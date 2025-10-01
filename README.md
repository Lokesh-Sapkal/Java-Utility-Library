# Java-Utility-Library
A professional Java utility library containing reusable methods for numbers, arrays, digits, patterns, strings, bitwise operations, matrices, recursion and file I/O.

---

## Introduction
This library is designed for developers and learners to easily integrate common operations in their Java projects. 

It provides a wide range of utility methods that can help simplify your code and improve productivity.

---

## 📂 Folder Structure
```bash
Java-Utility-Library/
│
├── src/
│   └── com/
│       └── utils/
│           ├── app/
│           │   └── Main.java
│           ├── numbers/
│           │   └── NumberUtils.java
│           ├── n_numbers/
│           │   └── NNumberUtils.java
│           │   └── NNumberGenericUtils.java
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
│           │   └── MatrixGenericUtils.java
│           ├── recursion/
│           │   └── RecursionUtils.java
│           └── io/
│               └── FileUtils.java
│
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
- *Generic Classes:* Support for generic arrays and matrices

---

## 🚀 How to Run

1. *Clone the repository:*
```bash
git clone <repository-url>
```
2. *Navigate to the project folder:*
```bash
cd src
```
2. Compile Java files:
```bash
javac com/utils/app/Main.java
```
3. Run the Main class:
```bash
java com/utils/app/Main
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
        NumberUtils nobj = new NumberUtils(10);
        System.out.println(number.isEven()); // true

        int[] arr = {3, 5, 2, 8, 1};
        NNumberUtils nnobj = new NNumberUtils(arr);
        System.out.println(nn.sumArray()); // 19

        Float[] fArr = {3.5f, 5.2f, 2.1f, 8.9f, 1.7f};
        NNumberGenericUtils ngobj = new NNumberGenericUtils(fArr);
        System.out.println(ng.sumArray()); // 21.4
        
        Float[][] fMatrix = {{1.1f, 2.2f}, {3.3f, 4.4f}};
        MatrixGenericUtils mgobj = new MatrixGenericUtils(fMatrix, 2, 2);
        System.out.println(mg.sumMatrix()); // 11.0

        RecursionUtils robj = new RecursionUtils(5);
        System.out.println(recursion.factorial()); // 120
    }
}
```
---

📜 License

This project is licensed under the MIT License – see the LICENSE file for details.
