
# ArcaneBattles

## Overview

This is a simple Java-based game where two players, each with their own health, strength, and attack attributes, battle against each other. The outcome of each attack is determined by rolling dice to simulate randomness in combat.

## Features

- Players can set their health, strength, and attack values within the range of 1 to 100.
- The game will prompt a warning if both players have identical attributes.
- During each attack, dice rolls determine the effectiveness of the attack and defense.
- The game prints detailed logs for each attack, including dice roll results.
- The game determines and displays the winner after the match ends.

## How to Run the Code

### Prerequisites

- Java Development Kit (JDK) installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/javase-downloads.html).

### Steps to Run

1. **Extract the ZIP File:**

   Extract the provided ZIP file containing the project folder and its local git history.

2. **Navigate to the Project Directory:**

   Open your terminal or command prompt and navigate to the extracted project directory.

3. **Compile the Code:**

   Run the following command to compile all Java files:

   ```sh
   javac *.java
4. **Run the Game:**
   After compiling, run the Main class to start the game:
   ```sh
   java Main
### File Descriptions

- **Main.java**: The entry point of the game where players are created and the match is started.
- **Player.java**: Defines the Player class with attributes and methods for attacking and defending.
- **Dice.java**: Simulates dice rolls for determining the outcome of attacks and defenses.
- **Arena.java**: Manages the game logic, including initiating attacks and determining the match outcome.
- **InputHandler.java**: Handles user input, ensuring valid values are entered for player attributes.
