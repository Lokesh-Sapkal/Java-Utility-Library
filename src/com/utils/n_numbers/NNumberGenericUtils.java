package com.utils.n_numbers;

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	ArrayX
//	Description			:	This class displays the elements of an array.
//
///////////////////////////////////////////////////////////////////////////////////////////
class ArrayX<T extends Number>
{
    protected T Arr[];

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	ArrayX
    //	Description             :   This is a parameterized constructor of the ArrayX class
    //                              and it is used to initialized characteristics.
    //	Parameters				:   T[] (arr[])
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public ArrayX(T arr[])
    {
        this.Arr = arr;
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
//	Class Name			:	NNumberGenericUtils
//	Description			:	This class provides generic utilities for operations on 
//                          numeric arrays of any type.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class NNumberGenericUtils<T extends Number> extends ArrayX
{
    //////////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	NNumberGenericUtils
    //	Description             :   This is parameterized constructor of the NNumberGenericUtils class
    //                              and it is used to call base constructor.
    //	Parameters				:   T[] (arr[])
    //	Returns					:   NONE
    //
    //////////////////////////////////////////////////////////////////////////////////////////////
    public NNumberGenericUtils(T arr[])
    {
        super(arr);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	addElementsGeneric
    //	Description             :   This method is used to add the elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   double
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public double addElementsGeneric()
    {
        int i = 0;
        double iSum = 0.0;

        for(i = 0;i < super.Arr.length;i++)
        {
            iSum += super.Arr[i].doubleValue();
        }

        return iSum;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	multiplyElementsGeneric
    //	Description             :   This method is used to multiply the elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   double
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public double multiplyElementsGeneric()
    {
        int i = 0;
        double iMult = 0.0;

        for(i = 0, iMult = 1;i < super.Arr.length;i++)
        {            
            iMult *= super.Arr[i].doubleValue();
        }

        return iMult;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countEvenElementsGeneric
    //	Description             :   This method is used to count the even elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countEvenElementsGeneric()
    {
        int i = 0, iCnt = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            if(((super.Arr[i].doubleValue()) % 2) == 0)
            {
                iCnt++;
            }
        }

        return iCnt;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countOddElementsGeneric
    //	Description             :   This method is used to count the odd elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countOddElementsGeneric()
    {
        int i = 0, iCnt = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            if(((super.Arr[i].doubleValue()) % 2) != 0)
            {
                iCnt++;
            }
        }

        return iCnt;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findMaximumGeneric
    //	Description             :   This method is used to find the maximum element of an array.
    //	Parameters				:   NONE
    //	Returns					:   double
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public double findMaximumGeneric()
    {
        int i = 0;
        double iMax = 0.0;
        double element = 0.0;

        for(i = 0, iMax = super.Arr[0].doubleValue();i < super.Arr.length;i++)
        {
            element = super.Arr[i].doubleValue();
            if(iMax < element)
            {
                iMax = element;
            }
        }

        return iMax;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findMinimumGeneric
    //	Description             :   This method is used to find the minimum element of an array.
    //	Parameters				:   NONE
    //	Returns					:   double
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public double findMinimumGeneric()
    {
        int i = 0;
        double dMini = 0.0;
        double element = 0.0;

        for(i = 0, dMini = super.Arr[0].doubleValue();i < super.Arr.length;i++)
        {
            element = super.Arr[i].doubleValue();
            if(dMini > element)
            {
                dMini = element;
            }
        }

        return dMini;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findAverageGeneric
    //	Description             :   This method is used to find average of the elements of an array.
    //	Parameters				:   NONE
    //	Returns					:   double
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public double findAverageGeneric()
    {
        return (addElementsGeneric()/((double)super.Arr.length));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findElementGeneric
    //	Description             :   This method is used to find accepted element in the array.
    //	Parameters				:   float
    //	Returns					:   boolean
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean findElementGeneric(float fElement)
    {
        int i = 0;
        boolean isFound = false;

        for(i = 0;i < super.Arr.length;i++)
        {
            if(fElement == (super.Arr[i].floatValue()))
            {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countFrequencyGeneric
    //	Description             :   This method is used to count accepted element in the array.
    //	Parameters				:   float
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countFrequencyGeneric(float fElement)
    {
        int i = 0;
        int iCount = 0;

        for(i = 0;i < super.Arr.length;i++)
        {
            if(fElement == (super.Arr[i].floatValue()))
            {
                iCount++;
            }
        }

        return iCount;
    }
}