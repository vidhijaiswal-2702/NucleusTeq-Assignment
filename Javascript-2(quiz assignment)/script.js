
const startScreen = document.getElementById('start-screen');
const gameScreen = document.getElementById('game-screen');
const endScreen = document.getElementById('end-screen');
const startBtn = document.getElementById('start-btn');
const restartBtn = document.getElementById('restart-btn');
const nextBtn = document.getElementById('next-btn');
const categorySelect = document.getElementById('category');
const difficultySelect = document.getElementById('difficulty');
const questionEl = document.getElementById('question');
const answersEl = document.getElementById('answers');
const timeEl = document.getElementById('time');
const scoreEl = document.getElementById('score');
const finalScoreEl = document.getElementById('final-score');

let questions = [];
let currentQuestionIndex = 0;
let score = 0;
let timer;
let timeLeft = 15;
let totalQuestions = 10; 

// Shuffle an array so that options of particular question does not come in same order
function shuffle(array) {
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }
  return array;
}

// Fetch questions from the Open Trivia Database API
async function fetchQuestions() {
  const category = categorySelect.value;
  const difficulty = difficultySelect.value;

   // Set number of questions based on difficulty
   if (difficulty === "easy") {
    totalQuestions = 10;
  } else if (difficulty === "medium") {
    totalQuestions = 15;
  } else if (difficulty === "hard") {
    totalQuestions = 20;
  }


 

  const url = `https://opentdb.com/api.php?amount=${totalQuestions}&category=${category}&difficulty=${difficulty}&type=multiple`;
  const res = await fetch(url);
  const data = await res.json();
  
  
  questions = data.results.map(q => {
    const txt = document.createElement("textarea");
    txt.innerHTML = q.question;
    const questionText = txt.value;
    txt.innerHTML = q.correct_answer;
    const correctAnswer = txt.value;
    const incorrectAnswers = q.incorrect_answers.map(ans => {
      txt.innerHTML = ans;
      return txt.value;
    });
    const answers = shuffle([correctAnswer, ...incorrectAnswers]);
    return {
      question: questionText,
      answers: answers,
      correct: correctAnswer
    };
  });
}


function showScreen(screen) {
  startScreen.classList.remove('active');
  gameScreen.classList.remove('active');
  endScreen.classList.remove('active');
  screen.classList.add('active');
}


function startTimer() {
  timeLeft = 15;
  timeEl.textContent = timeLeft;
  timer = setInterval(() => {
    timeLeft--;
    timeEl.textContent = timeLeft;
    if (timeLeft <= 0) {
      clearInterval(timer);
      revealAnswer(); 
    }
  }, 1000);
}


function displayQuestion() {
  const currentQuestion = questions[currentQuestionIndex];
  questionEl.textContent = `Question ${currentQuestionIndex + 1}: ${currentQuestion.question}`;
  answersEl.innerHTML = '';
  currentQuestion.answers.forEach(answer => {
    const li = document.createElement('li');
    const button = document.createElement('button');
    button.textContent = answer;
    button.addEventListener('click', () => selectAnswer(answer, button));
    li.appendChild(button);
    answersEl.appendChild(li);
  });
  nextBtn.style.display = 'none';
  startTimer();
}

function selectAnswer(selected, button) {
  clearInterval(timer);
  const currentQuestion = questions[currentQuestionIndex];
  const buttons = answersEl.querySelectorAll('button');
  buttons.forEach(btn => btn.disabled = true);
  if (selected === currentQuestion.correct) {
    button.style.backgroundColor = '#4CAF50'; // Green for correct
    score++;
    scoreEl.textContent = score;
  } else {
    button.style.backgroundColor = '#F44336'; // Red for wrong
    buttons.forEach(btn => {
      if (btn.textContent === currentQuestion.correct) {
        btn.style.backgroundColor = '#4CAF50';
      }
    });
  }
  nextBtn.style.display = 'block';
}

function revealAnswer() {
  const currentQuestion = questions[currentQuestionIndex];
  const buttons = answersEl.querySelectorAll('button');
  buttons.forEach(btn => {
    btn.disabled = true;
    if (btn.textContent === currentQuestion.correct) {
      btn.style.backgroundColor = '#4CAF50';
    }
  });
  nextBtn.style.display = 'block';
}


function nextQuestion() {
  currentQuestionIndex++;
  if (currentQuestionIndex < questions.length) {
    displayQuestion();
  } else {
    endGame();
  }
}

function endGame() {
  finalScoreEl.textContent = `${score} / ${totalQuestions}`;
  showScreen(endScreen);
}


startBtn.addEventListener('click', async () => {
  score = 0;
  currentQuestionIndex = 0;
  scoreEl.textContent = score;
  showScreen(gameScreen);
  await fetchQuestions();
  displayQuestion();
});

nextBtn.addEventListener('click', () => {
  clearInterval(timer);
  nextQuestion();
});

restartBtn.addEventListener('click', () => {
  showScreen(startScreen);
});








