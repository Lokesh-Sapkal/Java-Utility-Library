package com.utils.bitwise;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	BitwiseUtils
//	Description			:	This class provides bitwise operation utilities on one or
//                          two integers.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class BitwiseUtils
{
    private int iNo1;
    private int iNo2;

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	BitwiseUtils
    //	Description             :   This is parameterized constructor of the BitwiseUtils class that
    //                              accepts a single integer and is used to initialize characteristics.
    //	Parameters				:   int(no)
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public BitwiseUtils(int no)
    {
        this.iNo1 = no;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	BitwiseUtils
    //	Description             :   This is parameterized constructor of the BitwiseUtils class that
    //                              accepts two integer and is used to initialized characteristics.
    //	Parameters				:   int(no1), int(no2)
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public BitwiseUtils(int no1, int no2)
    {
        this.iNo1 = no1;
        this.iNo2 = no2;
    }
}