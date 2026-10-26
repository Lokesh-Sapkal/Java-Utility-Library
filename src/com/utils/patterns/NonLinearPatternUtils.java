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

    //////////////////////////////////////////////////////////
    //
    // Method   : squareFillPattern
    // input    : 4   4
    // Output   : *   *   *   *
    //            *   *   *   *
    //            *   *   *   *
    //            *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void squareFillPattern()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display1
    // input    : 4   4
    // Output   : 1   1   1   1
    //            2   2   2   2
    //            3   3   3   3
    //            4   4   4   4
    //
    //////////////////////////////////////////////////////////
    public void Display1()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display2
    // input    : 4   4
    // Output   : 1   2   3   4
    //            1   2   3   4
    //            1   2   3   4
    //            1   2   3   4
    //
    //////////////////////////////////////////////////////////
    public void Display2()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display3
    // input    : 4   4
    // Output   : *   *   *   *
    //            $   $   $   $
    //            *   *   *   *
    //            $   $   $   $
    //
    //////////////////////////////////////////////////////////
    public void Display3()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if((i % 2) != 0)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("$  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display4
    // input    : 4   4
    // Output   : *   $   *   $
    //            *   $   *   $
    //            *   $   *   $
    //            *   $   *   $
    //
    //////////////////////////////////////////////////////////
    public void Display4()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if((j % 2) != 0)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("$  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display5
    // input    : 4   4
    // Output   : A   B   C   D
    //            A   B   C   D
    //            A   B   C   D
    //            A   B   C   D
    //
    //////////////////////////////////////////////////////////
    public void Display5()
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1, ch = 'A';j <= this.iCol;j++, ch++)
            {
                System.out.print(ch+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display6
    // input    : 4   4
    // Output   : A   A   A   A
    //            B   B   B   B
    //            C   C   C   C
    //            D   D   D   D
    //
    //////////////////////////////////////////////////////////
    public void Display6()
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1, ch = 'A';i <= this.iRow;i++, ch++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                System.out.print(ch+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display7
    // input    : 5   4
    // Output   : *   *   *   *
    //            o   o   o   o
    //            o   o   o   o
    //            o   o   o   o
    //            *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void Display7()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if((i == 1) || (i == this.iRow))
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("o  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display8
    // input    : 4   5
    // Output   : *   o   o   o   *
    //            *   o   o   o   *
    //            *   o   o   o   *
    //            *   o   o   o   *
    //
    //////////////////////////////////////////////////////////
    public void Display8()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if((j == 1) || (j == this.iCol))
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("o  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display9
    // input    : 5   5
    // Output   : *   *   *   *   *
    //            *   o   o   o   *
    //            *   o   o   o   *
    //            *   o   o   o   *
    //            *   *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void Display9()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if((i == 1) || (i == this.iRow) || (j == 1) || (j == this.iCol))
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("o  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : squareHollowPattern
    // input    : 5   5
    // Output   : *   *   *   *   *
    //            *               *
    //            *               *
    //            *               *
    //            *   *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void squareHollowPattern()
    {
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if((i == 1) || (i == this.iRow) || (j == 1) || (j == this.iCol))
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}