package com.utils.patterns;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	PatternUtils
//	Description			:	This class provides methods for printing different numbers/
//                          characters/star patterns.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class PatternUtils
{
    private int iRow;
    private int iCol;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	PatternUtils
    //	Description             :   This is parameterized constructor of the PatternUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   int(no1), int(no2)
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public PatternUtils(int no1, int no2)
    {
        this.iRow = no1;
        this.iCol = no2;
    }
}