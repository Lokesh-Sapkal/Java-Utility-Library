package com.utils.digits;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	DigitUtils
//	Description			:	This class provides operations on digits of a number.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class DigitUtils
{
    private int iNo;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	DigitUtils
    //	Description             :   This is parameterized constructor of the DigitUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   integer
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public DigitUtils(int no)
    {
        this.iNo = no;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	displayDigits
    //	Description             :   Display digits of number.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void displayDigits()
    {
        int iNum = this.iNo;

        if(iNum < -9)
        {
            iNum = -iNum;
        }

        System.out.print("Digits are : ");
        while(iNum != 0)
        {
            System.out.print(iNum % 10+"   ");
            iNum /= 10;
        }
        System.out.println();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countDigits
    //	Description             :   Count digits of number.
    //	Parameters				:   NONE
    //	Returns					:   integer
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countDigits()
    {
        int iNum = this.iNo;
        int iCount = 0;

        while(iNum != 0)
        {
            iNum /= 10;
            iCount++;
        }
        
        return iCount;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countEvenDigits
    //	Description             :   Count even digits of number.
    //	Parameters				:   NONE
    //	Returns					:   integer
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countEvenDigits()
    {
        int iNum = this.iNo;
        int iCntEven = 0;

        while(iNum != 0)
        {
            if(((iNum % 10) % 2) == 0)
            {
                iCntEven++;
            }
            iNum /= 10;
        }
        
        return iCntEven;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countOddDigits
    //	Description             :   Count odd digits of number.
    //	Parameters				:   NONE
    //	Returns					:   integer
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countOddDigits()
    {
        int iNum = this.iNo;
        int iCntodd = 0;

        while(iNum != 0)
        {
            if(((iNum % 10) % 2) != 0)
            {
                iCntodd++;
            }
            iNum /= 10;
        }
        
        return iCntodd;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	addDigits
    //	Description             :   Calculate summation of digits of number.
    //	Parameters				:   NONE
    //	Returns					:   integer
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int addDigits()
    {
        int iNum = this.iNo;
        int iSum = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum != 0)
        {
            iSum += iNum % 10;
            iNum /= 10;
        }
        
        return iSum;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	multiplyDigits
    //	Description             :   Calculate multiplication of digits of number.
    //	Parameters				:   NONE
    //	Returns					:   integer
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int multiplyDigits()
    {
        int iNum = this.iNo;
        int iMult = 1;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum != 0)
        {
            if((iNum % 10) != 0)
            {
                iMult *= iNum % 10;
            }
            iNum /= 10;
        }
        
        return iMult;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	reverseNumber
    //	Description             :   Perform operation to reverse the number.
    //	Parameters				:   NONE
    //	Returns					:   integer
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int reverseNumber()
    {
        int iNum = this.iNo;
        int iRev = 0;

        while(iNum != 0)
        {
            iRev *= 10;
            iRev += iNum % 10;
            iNum /= 10;
        }
        
        return iRev;
    }
}