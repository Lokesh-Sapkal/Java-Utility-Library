package com.utils.matrix;

import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	MatrixUtils
//	Description			:	This class provides operations on integer matrices.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class MatrixUtils
{
    private int Arr[][];
    private int iRow;
    private int iCol;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	MatrixUtils
    //	Description             :   This is parameterized constructor of the MatrixUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   int[][] (arr[][])
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public MatrixUtils(int arr[][], int row, int col)
    {
        this.Arr = arr;
        this.iRow = row;
        this.iCol = col;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	Accept
    //	Description             :   This method is used to accept the elements of matrix.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void Accept()
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the elements of matrix : ");

        try
        {
            for(i = 0;i < iRow;i++)
            {
                for(j = 0;j < iCol;j++)
                {
                    Arr[i][j] = sobj.nextInt();
                }
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