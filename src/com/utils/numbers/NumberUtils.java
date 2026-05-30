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
}

