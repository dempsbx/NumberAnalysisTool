# NumberAnalysisTool

The `NumberAnalysisTool` is a Java application that provides various mathematical analyses for a pair of positive integers. This tool is capable of calculating the Least Common Multiple (LCM), Greatest Common Factor (GCF), and determining whether each number is a prime number or a perfect number.

## Features

- **Least Common Multiple (LCM) Calculation:** Finds the smallest number that is a multiple of both input integers.
- **Greatest Common Factor (GCF) Calculation:** Determines the largest number that can divide both integers without leaving a remainder.
- **Prime Number Check:** Verifies whether each of the input integers is a prime number.
- **Perfect Number Check:** Determines if each of the input integers is a perfect number (a number that is equal to the sum of its proper divisors).

## Prerequisites

Ensure you have Java installed on your machine. To check, run `java -version` in the terminal.

## Installation

Clone this repository:

```sh
git clone https://github.com/dempsbx/NumberAnalysisTool
```

Compile the program:

```sh
javac NumberAnalysisTool.java
```

Run the program:

```sh
java NumberAnalysisTool
```

## Usage

Follow the on-screen prompts to enter two positive integers. The program will then display:

- The LCM of the two numbers.
- The GCF of the two numbers.
- Whether each number is a prime number.
- Whether each number is a perfect number.

**Invalid Inputs:** If you enter a non-positive integer (zero or negative), the program will prompt you to re-enter the values.

### Examples

```text
Enter the first positive integer:
[User enters 15]
Enter the second positive integer:
[User enters 25]

The least common multiple (LCM) of 15 and 25 is: 75
The greatest common factor (GCF) of 15 and 25 is: 5
15 is NOT a prime number.
15 is NOT a perfect number.
25 is NOT a prime number.
25 is NOT a perfect number.
```

## Author

- Billy Dempsey

Feel free to modify and use this program as needed.
