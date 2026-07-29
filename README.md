# Java Training Lab Sheet Solutions - Day 2

This repository contains the extracted and organized Java solutions for the **Day 2 - Conditions & Loops Lab Sheet**.

---

## 📁 Repository Structure

```
wiprotraining/
├── Day 2.pdf                                 # Original Lab Sheet PDF
├── README.md                                 # Project Documentation
├── .gitignore                                # Git ignore file
└── src/
    ├── section_a_conditionals/               # Section A: Conditional Statements
    │   ├── CheckNumber.java                  # Q1: Check Positive, Negative, or Zero
    │   ├── GreaterNumber.java                # Q2: Find Greater of Two Numbers
    │   ├── EvenOdd.java                      # Q3: Check Even or Odd Number
    │   └── SumEvenOdd.java                   # Q4: Check if Sum of Two Numbers is Even/Odd
    └── section_b_loops/                      # Section B: Looping Constructs
        ├── Print1To100.java                  # Q5: Print Numbers 1 to 100
        ├── AlternateOdd.java                 # Q6: Print Alternate Numbers 1 to 99
        ├── AlternateEven.java                # Q7: Print Alternate Numbers 0 to 100
        ├── Reverse100To0.java                # Q8: Print Numbers 100 to 0
        └── ReverseSkip.java                  # Q9: Print Numbers 100 to 1 Skipping 2 Numbers
```

---

## 📋 Problems Overview

### Section A: Conditional Statements

1. **CheckNumber (`CheckNumber.java`)**
   - **Task:** Accept a number $N$ and print whether it is `"Positive"`, `"Negative"`, or `"Zero"`.
   - **Logic:** `if (n > 0)` -> Positive, `else if (n < 0)` -> Negative, `else` -> Zero.

2. **GreaterNumber (`GreaterNumber.java`)**
   - **Task:** Accept two numbers $a$ and $b$ and print the greater value.
   - **Logic:** `if (a > b)` print $a$, `else` print $b$.

3. **EvenOdd (`EvenOdd.java`)**
   - **Task:** Check whether an input number $n$ is EVEN or ODD.
   - **Logic:** `if (n % 2 == 0)` -> Even, `else` -> Odd.

4. **SumEvenOdd (`SumEvenOdd.java`)**
   - **Task:** Accept two numbers, calculate their sum, and print whether the sum is EVEN or ODD.
   - **Logic:** `sum = a + b`, then check `sum % 2 == 0`.

---

### Section B: Looping Constructs

5. **Print1To100 (`Print1To100.java`)**
   - **Task:** Print numbers from 1 to 100.
   - **Logic:** `for (int i = 1; i <= 100; i++)`

6. **AlternateOdd (`AlternateOdd.java`)**
   - **Task:** Print alternate numbers from 1 to 99 ($1, 3, 5, \dots, 99$).
   - **Logic:** `for (int i = 1; i <= 99; i += 2)`

7. **AlternateEven (`AlternateEven.java`)**
   - **Task:** Print alternate numbers from 0 to 100 ($0, 2, 4, \dots, 100$).
   - **Logic:** `for (int i = 0; i <= 100; i += 2)`

8. **Reverse100To0 (`Reverse100To0.java`)**
   - **Task:** Print numbers from 100 to 0 in reverse.
   - **Logic:** `for (int i = 100; i >= 0; i--)`

9. **ReverseSkip (`ReverseSkip.java`)**
   - **Task:** Print numbers from 100 down to 1 by skipping 2 numbers ($100, 97, 94, \dots$).
   - **Logic:** `for (int i = 100; i >= 1; i -= 3)`

---

## 🛠️ How to Compile and Run

### Compile All Files

From the root directory (`wiprotraining`), run:

```bash
# Compile Section A files
javac src/section_a_conditionals/*.java

# Compile Section B files
javac src/section_b_loops/*.java
```

### Run Programs

```bash
# Example: Run CheckNumber
java -cp src section_a_conditionals.CheckNumber

# Example: Run Print1To100
java -cp src section_b_loops.Print1To100
```

---

## 🚀 Pushing to GitHub

To push this repository to GitHub, follow these commands:

```bash
# 1. Initialize Git (if not already done)
git init

# 2. Add remote repository URL
git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git

# 3. Rename branch to main
git branch -M main

# 4. Push code to GitHub
git push -u origin main
```
