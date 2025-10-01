package com.utils.matrix;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	MatrixGenericUtils
//	Description			:	This class provides generic utilities for operations on numeric matrices.
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class MatrixGenericUtils<T extends Number>
{
    private T Arr[][];
    private int iRow;
    private int iCol;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	MatrixGenericUtils
    //	Description             :   This is parameterized constructor of the MatrixGenericUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   T[][] (arr[][])
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public MatrixGenericUtils(T arr[][], int row,int col)
    {
        this.Arr = arr;
        this.iRow = row;
        this.iCol = col;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	Display
    //	Description             :   This method is used to display the elements of matrix.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0;i < iRow;i++)
        {
            for(j = 0;j < iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}