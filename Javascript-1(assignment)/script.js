// Game Variables
let currentPlayer = 1; // 1 = Player 1, 2 = Player 2
let currentScore = 0;
let player1SavedScore = 0;
let player2SavedScore = 0;

// Selecting Elements
let diceImg = document.getElementById("dice-img");
let rollBtn = document.getElementById("roll-btn");
let saveBtn = document.getElementById("save-btn");
let resetBtn = document.getElementById("reset-btn");
let winnerMsg = document.getElementById("winner-msg");

// Function to Switch Player
function switchTurn() {
    currentScore = 0;
    document.getElementById("player" + currentPlayer + "-current").textContent = "0";
    
    if (currentPlayer === 1) {
        currentPlayer = 2;
    } else {
        currentPlayer = 1;
    }
}

// Function to Roll Dice
function rollDice() {
    let diceValue = Math.floor(Math.random() * 6) + 1; // Random number 1-6
    diceImg.src = "dice" + diceValue + ".png"; 

    if (diceValue === 1) {
        switchTurn(); 
    } else {
        currentScore += diceValue; 
        document.getElementById("player" + currentPlayer + "-current").textContent = currentScore;
    }
}

// Function to Save Score
function saveScore() {
    if (currentPlayer === 1) {
        player1SavedScore += currentScore;
        document.getElementById("player1-score").textContent = player1SavedScore;

        if (player1SavedScore >= 100) { 
            winnerMsg.textContent = document.getElementById("player1-name").value + " Wins!";
            rollBtn.disabled = true;
            saveBtn.disabled = true;
            return;
        }
    } else {
        player2SavedScore += currentScore;
        document.getElementById("player2-score").textContent = player2SavedScore;

        if (player2SavedScore >= 100) { 
            winnerMsg.textContent = document.getElementById("player2-name").value + " Wins!";
            rollBtn.disabled = true;
            saveBtn.disabled = true;
            return;
        }
    }
    switchTurn();
}

// Function to Reset Game
function resetGame() {
    currentPlayer = 1;
    currentScore = 0;
    player1SavedScore = 0;
    player2SavedScore = 0;

    document.getElementById("player1-score").textContent = "0";
    document.getElementById("player2-score").textContent = "0";
    document.getElementById("player1-current").textContent = "0";
    document.getElementById("player2-current").textContent = "0";
    winnerMsg.textContent = "";

    rollBtn.disabled = false;
    saveBtn.disabled = false;
}

// Attaching Event Listeners to Buttons
rollBtn.addEventListener("click", rollDice);
saveBtn.addEventListener("click", saveScore);
resetBtn.addEventListener("click", resetGame);



