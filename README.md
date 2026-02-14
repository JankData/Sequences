# Sequences - Java Swing Application

A comprehensive Java-based desktop application designed to generate, analyze, and process various mathematical sequences. The project features a user-friendly Graphical User Interface built with Swing, allowing users to interact with mathematical data dynamically.

## Key Features

* **Diverse Sequence Types:** Support for Integers, Squares, Prime numbers, and Fibonacci sequences.
* **Dynamic Range Management:** Users can set and update the upper limit for sequences on the fly.
* **Mathematical Operations:**
    * **Summation:** Calculate the sum of the first *n* elements of a selected sequence.
    * **Decomposition:** Decompose any given integer into a sum of elements from the current sequence using a greedy algorithm.
* **Data Visualization:** View formatted sequences in a dedicated text area or a separate pop-up window.
* **Export Capabilities:** Save generated sequence data to a text file for external use.

## Project Structure

The project follows a modular architecture, separating logic, presentation, and data formatting:

### 1. `sequences`
Contains the core mathematical logic.
* `Sequence.java`: Abstract base class defining the contract for all sequences.
* Implementations: `Arithmetic.java`, `Fibonacci.java`, `Integers.java`, `Primes.java`, `Squares.java`.
* Includes methods for calculation, summation, and greedy decomposition.

### 2. `gui`
Handles the User Interface.
* `MainFrame`: The primary window containing controls for sequence selection and manipulation.
* `TextWindow`: A reusable dialog for displaying large blocks of text or results.

### 3. `Printers`
Implements the Strategy pattern for output formatting.
* `Printer.java`: Abstract class defining formatting rules.
* `PrinterDummy.java`, `PrinterFile.java`, `PrinterStdOut.java`: Various output implementations.

### 4. `exceptions`
Custom error handling for robust execution.
* `CantDecomposeException`: Thrown when a number cannot be represented by the sequence elements.
* `OutOfBoundsException`: Thrown when requesting more elements than available.

### 5. Root Directory
* `Main.java`: The entry point of the application. It initializes the `MainFrame` and launches the GUI thread.

## Logic Overview

### Greedy Decomposition
The application uses a greedy approach to decompose a target number *n*. It iterates through the sequence elements in descending order, subtracting the largest possible element from *n* until it reaches zero or determines that decomposition is impossible with the current set.

### Formatted Output
The `Printer` class ensures that sequences are displayed in a clean, aligned grid format, automatically calculating padding based on the number of digits to maintain visual consistency.

## Requirements

* **Java Development Kit:** Version 8 or higher.
* **IDE:** IntelliJ IDEA or any standard Java compiler.

## How to Run

1.  Clone the repository to your local machine.
2.  Open the project in your preferred Java IDE.
3.  Locate the `Main.java` file in the root source directory.
4.  Run the `main` method to launch the application.

## Usage

1.  **Select** a sequence from the dropdown menu and click **"Select"**.
2.  Use **"Change"** to set a custom upper limit for the sequence.
3.  Click **"Sum"** to calculate the sum of the first *n* elements.
4.  Click **"Decompose"** to see how a number can be built using the sequence elements.
5.  Use **"Save to file"** to export the current view.

## Author

Developed by **Karol Jank**.
