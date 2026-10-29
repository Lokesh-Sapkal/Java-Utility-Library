package com.utils.app;

import com.utils.numbers.NumberUtils;
import com.utils.n_numbers.*;
import com.utils.digits.DigitUtils;
import com.utils.patterns.*;
import com.utils.strings.StringUtils;
import com.utils.bitwise.BitwiseUtils;
import com.utils.matrix.*;
import com.utils.recursion.RecursionUtils;
import com.utils.io.FileUtils;

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	Main
//	Description			:	This class is entry point of the java utility library application.
//
///////////////////////////////////////////////////////////////////////////////////////////
class Main
{
    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	main
    //	Description             :   This is entry point method.
    //                              Program execution starts here.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        /* For accept input from user */
        // int iValue1 = 0;
        int iSize = 0;
        // int iValue2 = 0;
        float iElement = 0.0f;
        float fElement = 0.0f;
        // int i = 0;
        // int j = 0;
        Integer Arr[];
        Float Brr[];
        // int Crr[][];
        // Float Drr[][];
        // String str = "";
        // char cValue = '\0';

        /* For Output */
        boolean bResult = false;
        // long lOutput = 0;
        int iResult = 0;
        double dResult = 0.0;
        // float fResult = 0.0f;

        Scanner sobj = new Scanner(System.in);

        try
        {
            // System.out.print("Enter first value : ");
            // System.out.print("Enter the number : ");
            System.out.print("Enter the size of array : ");
            // iValue1 = sobj.nextInt();
            iSize = sobj.nextInt();

            // System.out.print("Enter second value : ");
            // System.out.printf("Enter the number to check whether it is divisible by %d : ",iValue1);
            System.out.print("Enter the integer element : ");
            // iValue2 = sobj.nextInt();
            iElement = sobj.nextFloat();

            System.out.print("Enter the float element : ");
            fElement = sobj.nextFloat();

            // System.out.print("Enter the character : ");
            // cValue = sobj.next().charAt(0);
        }
        catch(InputMismatchException eobj)
        {
            System.out.println("Error : "+eobj);
            System.out.println("Invalid input please give correct input.");
            return;
        }

        if(iSize < 1)
        // if(iValue1 < 0)
        // if((iValue1 < 0) || (iValue2 < 0))
        {   
            System.out.println("Invalid input please give correct input.");
            return;
        }
        else
        {            
            // Drr = new Float[iValue1][iValue2];
            // try
            // {
            //     for(i = 0;i < iValue1;i++)
            //     {
            //         for(j = 0;j < iValue2;j++)
            //         {
            //             Drr[i][j] = sobj.nextFloat();
            //         }
            //     }
            // }
            // catch(InputMismatchException eobj)
            // {
            //     System.out.println("Error : "+eobj);
            //     System.out.println("Invalid input please give correct input.");
            // }
            
            // BitwiseUtils bobj1 = new BitwiseUtils(iValue1);
            // RecursionUtils robj = new RecursionUtils(iValue1);

            /////////////////////////////////////////////////////////////////////////////////

            // LinearPatternUtils lpobj = new LinearPatternUtils(iValue1);

            // lpobj.Display1();
            // lpobj.Display2();
            // lpobj.Display3();
            // lpobj.Display4();
            // lpobj.Display5(cValue);

            //---------------------------------------------------------------------------------

            // NonLinearPatternUtils nlpobj = new NonLinearPatternUtils(iValue1,iValue2);

            // nlpobj.squareFillPattern();
            // nlpobj.Display1();
            // nlpobj.Display2();
            // nlpobj.Display3();
            // nlpobj.Display4();
            // nlpobj.Display5();
            // nlpobj.Display6();
            // nlpobj.Display7();
            // nlpobj.Display8();
            // nlpobj.Display9();
            // nlpobj.squareHollowPattern();
            // nlpobj.Display10();
            // nlpobj.Display11();
            // nlpobj.Display12();
            // nlpobj.rightHalfPyramid();
            // nlpobj.rightHalfPyramidX();
            // nlpobj.Display13();
            // nlpobj.Display14();
            // nlpobj.reverseLeftHalfPyramid();
            // nlpobj.Display15();
            // nlpobj.Display16();
            // nlpobj.Display17();
            // nlpobj.leftHalfPyramid();
            // nlpobj.reverseRightHalfPyramid();
            // nlpobj.reverseRightHalfPyramidX();

            /////////////////////////////////////////////////////////////////////////////////

            // Arr = new int[iSize];

            // NNumberUtils nnobj = new NNumberUtils(Arr);
            // bResult = nnobj.Accept(sobj);
            // if(bResult)
            // {
            //     nnobj.Display();
            //     iResult = nnobj.addElements();
            //     System.out.println("Addition of array elements is : "+iResult);
            //     iResult = nnobj.multiplyElements();
            //     System.out.println("Multiplication of array elements is : "+iResult);
            //     iResult = nnobj.countEvenElements();
            //     System.out.println("Total number of even elements in the array is : "+iResult);
            //     iResult = nnobj.countOddElements();
            //     System.out.println("Total number of odd elements in the array is : "+iResult);
            //     iResult = nnobj.findMaximum();
            //     System.out.println("Maximum element in the array is : "+iResult);
            //     iResult = nnobj.findMinimum();
            //     System.out.println("Minimum element in the array is : "+iResult);
            //     fResult = nnobj.findAverage();
            //     System.out.println("Average of the elements of an array is : "+fResult);
            //     bResult = nnobj.findElement(iElement);
            //     if(bResult)
            //     {
            //         System.out.printf("%d is found in the array\n",iElement);
            //     }
            //     else
            //     {
            //         System.out.printf("%d is not found in the array\n",iElement);
            //     }
            //     iResult = nnobj.countFrequency(iElement);
            //     System.out.printf("Total number of %d in the array is : %d\n",iElement,iResult);
            // }

            //---------------------------------------------------------------------------------

            Arr = new Integer[iSize];
            System.out.println("Enter integer array elements");
            try
            {
                for(int i = 0;i < iSize;i++)
                {
                    Arr[i] = sobj.nextInt();
                }
            }
            catch(InputMismatchException eobj)
            {
                System.out.println("Error : "+eobj);
                System.out.println("Invalid input please give correct input.");
                return;
            }

            NNumberGenericUtils<Integer> ngobj1 = new NNumberGenericUtils<>(Arr);

            ngobj1.Display();
            dResult = ngobj1.addElementsGeneric();
            System.out.println("Addition of integer array elements is : "+dResult);
            dResult = ngobj1.multiplyElementsGeneric();
            System.out.println("Multiplication of integer array elements is : "+dResult);
            iResult = ngobj1.countEvenElementsGeneric();
            System.out.println("Total number of even elements in the integer array is : "+iResult);
            iResult = ngobj1.countOddElementsGeneric();
            System.out.println("Total number of odd elements in the integer array is : "+iResult);
            dResult = ngobj1.findMaximumGeneric();
            System.out.println("Maximum element in the integer array is : "+dResult);
            dResult = ngobj1.findMinimumGeneric();
            System.out.println("Minimum element in the integer array is : "+dResult);
            dResult = ngobj1.findAverageGeneric();
            System.out.println("Average of the elements of a integer array is : "+dResult);
            bResult = ngobj1.findElementGeneric(iElement);
            if(bResult)
            {
                System.out.println(iElement+" is found in the integer array");
            }
            else
            {
                System.out.println(iElement+" is not found in the integer array");
            }
            iResult = ngobj1.countFrequencyGeneric(iElement);
            System.out.println("Total number of "+iElement+" in the integer array is : "+iResult);

            //---------------------------------------------------------------------------------

            Brr = new Float[iSize];
            System.out.println("Enter float array elements");
            try
            {
                for(int i = 0;i < iSize;i++)
                {
                    Brr[i] = sobj.nextFloat();
                }
            }
            catch(InputMismatchException eobj)
            {
                System.out.println("Error : "+eobj);
                System.out.println("Invalid input please give correct input.");
                return;
            }

            NNumberGenericUtils<Float> ngobj2 = new NNumberGenericUtils<>(Brr);

            ngobj2.Display();
            dResult = ngobj2.addElementsGeneric();
            System.out.println("Addition of float array elements is : "+dResult);
            dResult = ngobj2.multiplyElementsGeneric();
            System.out.println("Multiplication of float array elements is : "+dResult);
            dResult = ngobj2.findMaximumGeneric();
            System.out.println("Maximum element in the float array is : "+dResult);
            dResult = ngobj2.findMinimumGeneric();
            System.out.println("Minimum element in the float array is : "+dResult);
            dResult = ngobj2.findAverageGeneric();
            System.out.println("Average of the elements of a float array is : "+dResult);
            bResult = ngobj2.findElementGeneric(fElement);
            if(bResult)
            {
                System.out.println(fElement+" is found in the float array");
            }
            else
            {
                System.out.println(fElement+" is not found in the float array");
            }
            iResult = ngobj2.countFrequencyGeneric(fElement);
            System.out.println("Total number of "+fElement+" in the float array is : "+iResult);

            /////////////////////////////////////////////////////////////////////////////////

            // BitwiseUtils bobj2 = new BitwiseUtils(iValue1, iValue2);
            
            // sobj.nextLine();
            // System.out.println("Enter the string : ");
            // str = sobj.nextLine();

            // StringUtils strobj = new StringUtils(str);
            // FileUtils fobj = new FileUtils(str);

            // Crr = new int[iValue1][iValue2];

            // MatrixUtils mobj = new MatrixUtils(Crr,iValue1,iValue2);

            // MatrixGenericUtils mgobj = new MatrixGenericUtils(Drr, iValue1, iValue2);

            // System.out.println("Radhe Radhe : Everything is OK till now...!");
        }
        
        /////////////////////////////////////////////////////////////////////////////////

        // NumberUtils nobj = new NumberUtils(iValue1);

        /* For Testing */

        // bResult = nobj.checkEvenOdd();
        // if(bResult == true)
        // {
        //     System.out.printf("%d is even\n",iValue1);
        // }
        // else
        // {
        //     System.out.printf("%d is odd\n",iValue1);
        // }

        // bResult = nobj.isDivisibleBy(iValue2);
        // if(bResult == true)
        // {
        //     System.out.printf("%d is divisible by %d\n",iValue2,iValue1);
        // }
        // else
        // {
        //     System.out.printf("%d is not divisible by %d\n",iValue2,iValue1);
        // }

        // lOutput = nobj.findFactorial();
        // if(lOutput == 0)
        // {
        //     System.out.println("Invalid input");
        // }
        // else
        // {
        //     System.out.printf("Factorial of %d is : %d\n", iValue1, lOutput);
        // }

        // nobj.displayFactors();

        // nobj.displayNonFactors();

        // bResult = nobj.isPrime();
        // if(bResult == true)
        // {
        //     System.out.printf("%d is prime\n",iValue1);
        // }
        // else
        // {
        //     System.out.printf("%d is not prime\n",iValue1);
        // }

        // bResult = nobj.isPerfect();
        // if(bResult == true)
        // {
        //     System.out.printf("%d is perfect\n",iValue1);
        // }
        // else
        // {
        //     System.out.printf("%d is not perfect\n",iValue1);
        // }

        /////////////////////////////////////////////////////////////////////////////////

        // DigitUtils dobj = new DigitUtils(iValue1);

        // dobj.displayDigits();

        // iResult = dobj.countDigits();
        // System.out.printf("Total no. of digits in %d is : %d\n",iValue1,iResult);

        // iResult = dobj.countEvenDigits();
        // System.out.printf("Total no. of even digits in %d is : %d\n",iValue1,iResult);

        // iResult = dobj.countOddDigits();
        // System.out.printf("Total no. of odd digits in %d is : %d\n",iValue1,iResult);

        // iResult = dobj.addDigits();
        // System.out.printf("Addition of digits of %d is : %d\n",iValue1,iResult);

        // iResult = dobj.multiplyDigits();
        // System.out.printf("Multiplication of digits of %d is : %d\n",iValue1,iResult);

        // iResult = dobj.reverseNumber();
        // System.out.printf("Reverse of %d is : %d\n",iValue1,iResult);

        sobj.close();
    }
}

