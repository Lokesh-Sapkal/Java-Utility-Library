package com.utils.patterns;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	NonLinearPatternUtils
//	Description			:	This class provides methods for printing different numbers/
//                          characters/star patterns.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class NonLinearPatternUtils
{
    private int iRow;
    private int iCol;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	NonLinearPatternUtils
    //	Description             :   This is parameterized constructor of the NonLinearPatternUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   int(no1), int(no2)
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public NonLinearPatternUtils(int no1, int no2)
    {
        this.iRow = no1;
        this.iCol = no2;
    }
}