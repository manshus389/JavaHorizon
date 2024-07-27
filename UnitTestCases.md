# Unit Test Cases for Magical Arena Game

## Overview
This document provides the unit test cases for the Magical Arena Game project. Each test case specifies the input values and the expected output of the game.

## Test Cases

### Test Case 1: Identical Attributes
**Input:**

- Player A: Health = 50, Strength = 50, Attack = 50
- Player B: Health = 50, Strength = 50, Attack = 50

**Expected Output:**

- Warning: Both players have identical attributes.
- The game should not start or declare an immediate draw.

### Test Case 2: Player A Wins
**Input:**

- Player A: Health = 100, Strength = 50, Attack = 70
- Player B: Health = 90, Strength = 40, Attack = 60

**Expected Output:**

- Player A attacks Player B.
- Player B attacks Player A.
- Continue until one player's health reaches 0.
- **Final Status:**
  - Player 1: [Health > 0, Strength = 50, Attack = 70]
  - Player 2: [Health = 0, Strength = 40, Attack = 60]
  - The winner is Player 1.

### Test Case 3: Player B Wins
**Input:**

- Player A: Health = 80, Strength = 30, Attack = 60
- Player B: Health = 90, Strength = 40, Attack = 70

**Expected Output:**

- Player B attacks Player A.
- Player A attacks Player B.
- Continue until one player's health reaches 0.
- **Final Status:**
  - Player 1: [Health = 0, Strength = 30, Attack = 60]
  - Player 2: [Health > 0, Strength = 40, Attack = 70]
  - The winner is Player 2.

### Test Case 4: Minimum and Maximum Values
**Input:**

- Player A: Health = 1, Strength = 1, Attack = 1
- Player B: Health = 100, Strength = 100, Attack = 100

**Expected Output:**

- Player B attacks Player A.
- Player A's health reaches 0 immediately due to the high attack and strength of Player B.
- **Final Status:**
  - Player 1: [Health = 0, Strength = 1, Attack = 1]
  - Player 2: [Health = 100, Strength = 100, Attack = 100]
  - The winner is Player 2.

### Test Case 5: Equal Attack and Defense Rolls
**Input:**

- Player A: Health = 50, Strength = 50, Attack = 50
- Player B: Health = 50, Strength = 50, Attack = 50

**Expected Output:**

- Player A attacks Player B with equal attack and defense rolls, resulting in no damage.
- Player B attacks Player A with equal attack and defense rolls, resulting in no damage.
- Continue until the dice rolls differ.
- **Final Status:**
  - Determined by the varying dice rolls eventually leading to one player's health reaching 0.

### Test Case 6: Dice Roll Edge Cases
**Input:**

- Player A: Health = 60, Strength = 30, Attack = 40
- Player B: Health = 60, Strength = 30, Attack = 40

**Expected Output:**

- Player A attacks Player B.
  - Attacker dice roll result: 1
  - Defender dice roll result: 6
  - Minimum damage to Player B.
- Player B attacks Player A.
  - Attacker dice roll result: 6
  - Defender dice roll result: 1
  - Maximum damage to Player A.
- Continue until one player's health reaches 0.
- The winner will depend on the sequence and outcome of dice rolls.

### Test Case 7: Invalid Input (Zero)
**Input:**

- Player A: Health = 0, Strength = 50, Attack = 50
- Player B: Health = 50, Strength = 50, Attack = 50

**Expected Output:**

- Error message indicating invalid input: "Health, Strength, and Attack values must be greater than zero."
- The game should not start.

### Test Case 8: Invalid Input (Greater than 100)
**Input:**

- Player A: Health = 101, Strength = 50, Attack = 50
- Player B: Health = 50, Strength = 50, Attack = 50

**Expected Output:**

- Error message indicating invalid input: "Health, Strength, and Attack values must not exceed 100."
- The game should not start.
