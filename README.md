# Java-Utility-Library
A professional Java utility library containing reusable methods for numbers, arrays, digits, patterns, strings, bitwise operations, matrices, recursion and file I/O.

This library is designed for developers and learners to easily integrate common operations in their Java projects.

---

## 📂 Folder Structure
```bash
Java-Utility-Library/
│
├── src/
│   └── com/
│       └── utils/
│           ├── numbers/
│           │   └── NumberUtils.java
│           ├── n_numbers/
│           │   └── NNumberUtils.java
│           ├── digits/
│           │   └── DigitUtils.java
│           ├── patterns/
│           │   └── PatternUtils.java
│           ├── strings/
│           │   └── StringUtils.java
│           ├── bitwise/
│           │   └── BitwiseUtils.java
│           ├── matrix/
│           │   └── MatrixUtils.java
│           ├── recursion/
│           │   └── RecursionUtils.java
│           └── io/
│               └── FileUtils.java
│
├── Main.java
├── README.md
└── .gitignored
└── LICENSE
```
---

## ⚡ Features

- *Numbers & Digit Utilities:* Check even/odd, factorial, sum of digits, prime numbers  
- *Array / Series Operations:* Sum, max, min, reverse, search, count even/odd  
- *String Manipulations:* Reverse string, palindrome check, count vowels  
- *Patterns Printing:* Triangle, Diamond, etc.  
- *Bitwise Operations:* Count set bits, toggle bits
- *Matrix Operations:* Addition, multiplication, transpose  
- *Recursion Methods:* Factorial, Fibonacci, sum of digits
- *File I/O Utilities:* Read/Write text files

---

## 🚀 How to Run

1. *Clone the repository:*
```bash
git clone <repository-url>
```
2. Compile Java files:
```bash
javac -d bin src/com/utils///*.java src/Main.java
```
3. Run the Main class:
```bash
java -cp bin Main
```
---

📝 Example Usage
```bash
import com.utils.n_numbers.NNumberUtils;
import com.utils.io.FileUtils;
import com.utils.numbers.NumberUtils;
import com.utils.recursion.RecursionUtils;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        NumberUtils number = new NumberUtils(10);
        System.out.println(number.isEven()); // true

        int[] arr = {3, 5, 2, 8, 1};
        NNumberUtils nn = new NNumberUtils(arr);
        System.out.println(nn.sumArray()); // 19

        RecursionUtils recursion = new RecursionUtils(5);
        System.out.println(recursion.factorial()); // 120
    }
}
```
---

📜 License

This project is licensed under the MIT License – see the LICENSE file for details.
