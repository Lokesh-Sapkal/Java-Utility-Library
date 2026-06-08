package com.utils.numbers;

///////////////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	NumberUtils
//	Description			:	This class represents a single number for performing numeric operations.
//
///////////////////////////////////////////////////////////////////////////////////////////////////
public class NumberUtils
{
    private int iNo;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	NumberUtils
    //	Description             :   This is parameterized constructor of the NumberUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   integer
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public NumberUtils(int no)
    {
        this.iNo = no;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	checkEvenOdd
    //	Description             :   Check whether number is even or odd.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //                              true -> even
    //                              false -> odd
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean checkEvenOdd()
    {
        int iNum = this.iNo;
        boolean bAnswer = false;
        
        if((iNum % 2) == 0)
        {
            bAnswer = true;
        }

        return bAnswer;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	isDivisibleBy
    //	Description             :   Check whether accepted number is divisible by number.
    //	Parameters				:   integer
    //	Returns					:   boolean
    //                              true -> divisible
    //                              false -> not divisible
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean isDivisibleBy(int iValue)
    {
        int iNum = this.iNo;
        boolean bAnswer = false;
        
        if((iValue % iNum) == 0)
        {
            bAnswer = true;
        }

        return bAnswer;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findFactorial
    //	Description             :   Calculate factorial of number.
    //	Parameters				:   NONE
    //	Returns					:   long
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public long findFactorial()
    {
        int iNum = this.iNo;
        long lFact = 1;
        int iCnt = 0;

        if(iNum < 0)
        {
            return 0;
        }
        
        for(iCnt = iNum; iCnt > 0; iCnt--)
        {
            lFact *= iCnt;
        }

        return lFact;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	displayFactors
    //	Description             :   Display factors of number.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void displayFactors()
    {
        int iNum = this.iNo;
        int iCnt = 0;

        System.out.printf("Factors of %d : ",iNum);

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 1; iCnt <= (iNum/2); iCnt++)
        {
            if((iNum % iCnt) == 0)
            {
                System.out.printf("%d   ",iCnt);
            }
        }
        System.out.println();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	displayNonFactors
    //	Description             :   Display non factors of number.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void displayNonFactors()
    {
        int iNum = this.iNo;
        int iCnt = 0;

        System.out.printf("Non factors of %d : ",iNum);

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 1; iCnt < iNum; iCnt++)
        {
            if((iNum % iCnt) != 0)
            {
                System.out.printf("%d   ",iCnt);
            }
        }
        System.out.println();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	isPrime
    //	Description             :   Check whether number is prime or not.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //                              true -> prime
    //                              false -> not prime
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean isPrime()
    {
        int iNum = this.iNo;
        boolean bAnswer = true;
        int iCnt = 0;

        if(iNum <= 1)
        {
            return false;
        }

        for(iCnt = 2; iCnt <= (iNum/2); iCnt++)
        {
            if((iNum % iCnt) == 0)
            {
                bAnswer = false;
                break;
            }
        }

        return bAnswer;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	isPerfect
    //	Description             :   Check whether number is perfect or not.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //                              true -> perfect
    //                              false -> not perfect
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean isPerfect()
    {
        int iNum = this.iNo;
        boolean bAnswer = true;
        int iCnt = 0;
        int iSum = 0;

        if(iNum <= 1)
        {
            return false;
        }

        for(iCnt = 1; iCnt <= (iNum/2); iCnt++)
        {
            if((iNum % iCnt) == 0)
            {
                iSum += iCnt;
            }
        }

        if(iNum != iSum)
        {
            bAnswer = false;
        }

        return bAnswer;
    }
}