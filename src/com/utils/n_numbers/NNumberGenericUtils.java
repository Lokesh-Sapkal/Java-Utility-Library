package com.utils.n_numbers;

import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	NNumberGenericUtils
//	Description			:	This class provides generic utilities for operations on 
//                          numeric arrays of any type.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class NNumberGenericUtils<T extends Number>
{
    private T Arr[];

    //////////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	NNumberGenericUtils
    //	Description             :   This is parameterized constructor of the NNumberGenericUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   T[] (arr[])
    //	Returns					:   NONE
    //
    //////////////////////////////////////////////////////////////////////////////////////////////
    public NNumberGenericUtils(T arr[])
    {
        this.Arr = arr;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	Display
    //	Description             :   This method is used to display the elements of array.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void Display()
    {
        int i = 0;

        System.out.println("Elements of array are : ");

        for(i = 0;i < Arr.length;i++)
        {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();
    }
}