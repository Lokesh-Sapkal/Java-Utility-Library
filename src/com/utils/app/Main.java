package com.utils.app;

import com.utils.numbers.NumberUtils;
import com.utils.n_numbers.*;
import com.utils.digits.DigitUtils;
import com.utils.patterns.PatternUtils;
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
        int iValue1 = 0;
        int iValue2 = 0;
        // int i = 0;
        // int j = 0;
        // int Arr[];
        // Float Brr[];
        // int Crr[][];
        // Float Drr[][];
        // String str = "";

        /* For Output */
        boolean bResult = false;
        long lOutput = 0;

        Scanner sobj = new Scanner(System.in);

        try
        {
            // System.out.print("Enter first value : ");
            System.out.print("Enter the number : ");
            iValue1 = sobj.nextInt();

            // System.out.print("Enter second value : ");
            // System.out.printf("Enter the number to check whether it is divisible by %d : ",iValue1);
            // iValue2 = sobj.nextInt();
        }
        catch(InputMismatchException eobj)
        {
            System.out.println("Error : "+eobj);
            System.out.println("Invalid input please give correct input.");
            return;
        }

        // if((iValue1 < 0) || (iValue2 < 0))
        // {   
        //     System.out.println("Invalid input please give correct input.");
        //     return;
        // }
        // else
        // {
            // Brr = new Float[iValue1];
            // try
            // {
            //     for(i = 0;i < iValue1;i++)
            //     {
            //         Brr[i] = sobj.nextFloat();
            //     }
            // }
            // catch(InputMismatchException eobj)
            // {
            //     System.out.println("Error : "+eobj);
            //     System.out.println("Invalid input please give correct input.");
            // }

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
            
            // DigitUtils dobj = new DigitUtils(iValue1);
            // BitwiseUtils bobj1 = new BitwiseUtils(iValue1);
            // RecursionUtils robj = new RecursionUtils(iValue1);

            // PatternUtils pobj = new PatternUtils(iValue1, iValue2);
            // BitwiseUtils bobj2 = new BitwiseUtils(iValue1, iValue2);
            
            // sobj.nextLine();
            // System.out.println("Enter the string : ");
            // str = sobj.nextLine();

            // StringUtils strobj = new StringUtils(str);
            // FileUtils fobj = new FileUtils(str);

            // Arr = new int[iValue1];

            // NNumberUtils nnobj = new NNumberUtils(Arr);

            // NNumberGenericUtils ngobj = new NNumberGenericUtils(Brr);

            // Crr = new int[iValue1][iValue2];

            // MatrixUtils mobj = new MatrixUtils(Crr,iValue1,iValue2);

            // MatrixGenericUtils mgobj = new MatrixGenericUtils(Drr, iValue1, iValue2);

            // System.out.println("Everything is OK till now...!");
        // }

        NumberUtils nobj = new NumberUtils(iValue1);

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

        sobj.close();
    }
}