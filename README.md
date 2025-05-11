# Election System

This is a simple election system project developed as an introduction to object-oriented programming in Java. It was created as part of coursework for an Electrical and Computer Engineering program.

## Features

- **Candidate Registration:** Supports registration for both regional and national candidates.
- **Elector Registration:** Electors can register and vote, with checks to prevent double voting.
- **Voting Process:** Electors can vote for either regional or national candidates.
- **Result Calculation:** The system determines and displays the winners for both regional and national elections.
- **Advertising:** Candidates can advertise through different media (Radio, TV, Magazine) using the Strategy design pattern.

## Project Structure

```
Election System/
├── src/
│   ├── Advertising.java
│   ├── Candidates.java
│   ├── Committee.java
│   ├── ElectionHouse.java   # Main entry point
│   ├── Electors.java
│   ├── MagazineAd.java
│   ├── NationalCandidate.java
│   ├── RadioAd.java
│   ├── RegionalCandidate.java
│   └── TvAd.java
└── bin/
    └── (compiled .class files)
```

## How It Works

- The program starts with a registration phase for candidates (regional and national).
- After registration, the voting phase opens, allowing electors to vote for their preferred candidates.
- Each elector can only vote once.
- After voting, the system calculates and displays the winners for both regional and national elections.

## How to Run

1. **Compile the source files:**
   ```bash
   cd "Election System/src"
   javac *.java
   ```

2. **Run the program:**
   ```bash
   java ElectionHouse
   ```

3. **Follow the on-screen prompts** to register candidates, vote, and view results.

## Requirements

- Java JDK 8 or higher

## Notes

- All user interaction is via the command line.
- The project demonstrates basic OOP concepts: classes, inheritance, interfaces, and the strategy pattern for advertising.

## Author

This project was created by an Electrical and Computer Engineering student as an introduction to Java OOP. 
