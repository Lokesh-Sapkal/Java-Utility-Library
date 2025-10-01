package com.utils.n_numbers;

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	NNumberUtils
//	Description			:	This class provides utilities for operations on integer array.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class NNumberUtils
{
    private int Arr[];

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	NNumberUtils
    //	Description             :   This is parameterized constructor of the NNumberUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   int[] (arr[])
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public NNumberUtils(int arr[])
    {
        this.Arr = arr;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	Accept
    //	Description             :   This method is used to accept the elements of array.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void Accept()
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the elements of array : ");

        try
        {
            for(i = 0;i < Arr.length;i++)
            {
                Arr[i] = sobj.nextInt();
            }
        }
        catch(InputMismatchException eobj)
        {
            System.out.println("Error : "+eobj);
            System.out.println("Invalid input please give correct input.");
        }

        sobj.close();
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