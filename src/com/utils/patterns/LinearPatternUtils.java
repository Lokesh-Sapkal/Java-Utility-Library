package com.utils.patterns;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	PattLinearPatternUtilsernUtils
//	Description			:	This class provides methods for printing different numbers/
//                          characters/star patterns.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class LinearPatternUtils
{
    private int iFreq;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	LinearPatternUtils
    //	Description             :   This is parameterized constructor of the LinearPatternUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   int(no)
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public LinearPatternUtils(int no)
    {
        if(no < 0)
        {
            no = -no;
        }
        this.iFreq = no;
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display1
    // input    : 4
    // Output   : *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void Display1()
    {
        int i = 0;

        for(i = 1;i <= iFreq;i++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display2
    // input    : 4
    // Output   : 1   2   3   4
    //
    //////////////////////////////////////////////////////////
    public void Display2()
    {
        int i = 0;

        for(i = 1;i <= iFreq;i++)
        {
            System.out.printf("%d\t",i);
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display3
    // input    : 4
    // Output   : 4   3   2   1
    //
    //////////////////////////////////////////////////////////
    public void Display3()
    {
        int i = 0;

        for(i = iFreq;i >= 1;i--)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display4
    // input    : 4
    // Output   : -4   -3   -2   -1   0   1   2   3   4
    //
    //////////////////////////////////////////////////////////
    public void Display4()
    {
        int i = 0;
 
        for(i = -iFreq;i <= iFreq;i++)
        {
            System.out.printf("%d\t",i);
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display5
    // input    : 4   R
    // Output   : R   R   R   R
    //
    //////////////////////////////////////////////////////////
    public void Display5(char ch)
    {
        int i = 0;

        for(i = 1;i <= iFreq;i++)
        {
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}