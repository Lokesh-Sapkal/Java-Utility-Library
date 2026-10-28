package com.utils.n_numbers;

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	ArrayX
//	Description			:	This class accepts and displays the elements of an array.
//
///////////////////////////////////////////////////////////////////////////////////////////
class ArrayX
{
    protected int Arr[];

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	ArrayX
    //	Description             :   This is a parameterized constructor of the ArrayX class
    //                              and it is used to initialized characteristics.
    //	Parameters				:   int[] (arr[])
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public ArrayX(int arr[])
    {
        this.Arr = arr;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	Accept
    //	Description             :   This method is used to accept the elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //                              true -> the elements was successfully accepted
    //                              false -> an exception occurred while accepting elements of an array
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean Accept(Scanner sobj)
    {
        int i = 0;
        boolean isAccept = false;
        
        System.out.println("Enter the elements of array : ");

        try
        {
            for(i = 0;i < Arr.length;i++)
            {
                Arr[i] = sobj.nextInt();
            }
            isAccept = true;
        }
        catch(InputMismatchException eobj)
        {
            System.out.println("Error : "+eobj);
            System.out.println("Invalid input please give correct input.");
        }

        return isAccept;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	Display
    //	Description             :   This method is used to display the elements of an array.
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

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	finalize
    //	Description             :   This method acts as the destructor of ArrayX class.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    protected void finalize()
    {
        this.Arr = null;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	NNumberUtils
//	Description			:	This class provides utilities for operations on integer array.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class NNumberUtils extends ArrayX
{
    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	NNumberUtils
    //	Description             :   This is a parameterized constructor of the NNumberUtils class
    //                              and it is used to call base constructor.
    //	Parameters				:   int[] (arr[])
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////    
    public NNumberUtils(int arr[])
    {
        super(arr);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	addElements
    //	Description             :   This method is used to add the elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int addElements()
    {
        int i = 0, iSum = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            iSum += super.Arr[i];
        }

        return iSum;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	multiplyElements
    //	Description             :   This method is used to multiply the elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int multiplyElements()
    {
        int i = 0, iMult = 0;

        for(i = 0, iMult = 1;i < super.Arr.length;i++)
        {
            if(super.Arr[i] != 0)
            {
                iMult *= super.Arr[i];
            }
        }

        return iMult;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countEvenElements
    //	Description             :   This method is used to count the even elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countEvenElements()
    {
        int i = 0, iCnt = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            if((super.Arr[i] % 2) == 0)
            {
                iCnt++;
            }
        }

        return iCnt;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countOddElements
    //	Description             :   This method is used to count the odd elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countOddElements()
    {
        int i = 0, iCnt = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            if((super.Arr[i] % 2) != 0)
            {
                iCnt++;
            }
        }

        return iCnt;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findMaximum
    //	Description             :   This method is used to find the maximum element of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int findMaximum()
    {
        int i = 0, iMax = 0;

        for(i = 0, iMax = super.Arr[0];i < super.Arr.length;i++)
        {
            if(iMax < super.Arr[i])
            {
                iMax = super.Arr[i];
            }
        }

        return iMax;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findMinimum
    //	Description             :   This method is used to find the minimum element of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int findMinimum()
    {
        int i = 0, iMini = 0;

        for(i = 0, iMini = super.Arr[0];i < super.Arr.length;i++)
        {
            if(iMini > super.Arr[i])
            {
                iMini = super.Arr[i];
            }
        }

        return iMini;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findAverage
    //	Description             :   This method is used to find average of the elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   float
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public float findAverage()
    {
        int i = 0, iSum = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            iSum += super.Arr[i];
        }

        return (float)iSum/(float)super.Arr.length;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findElement
    //	Description             :   This method is used to find accepted element in the array.
    //	Parameters				:   int
    //	Returns					:   boolean
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean findElement(int iElement)
    {
        int i = 0;
        boolean isFound = false;

        for(i = 0;i < super.Arr.length;i++)
        {
            if(iElement == super.Arr[i])
            {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countFrequency
    //	Description             :   This method is used to count accepted element in the array.
    //	Parameters				:   int
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countFrequency(int iElement)
    {
        int i = 0;
        int iCount = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            if(iElement == super.Arr[i])
            {
                iCount++;
            }
        }

        return iCount;
    }
}