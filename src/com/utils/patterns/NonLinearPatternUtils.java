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

    //////////////////////////////////////////////////////////
    //
    // Method   : Display10
    // input    : 5   5
    // Output   : *   o   o   o   o
    //            o   *   o   o   o
    //            o   o   *   o   o
    //            o   o   o   *   o
    //            o   o   o   o   *
    //
    //////////////////////////////////////////////////////////
    public void Display10()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }

        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i == j)
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
    // Method   : Display11
    // input    : 5   5
    // Output   : *   o   o   o   o
    //            *   *   o   o   o
    //            *   *   *   o   o
    //            *   *   *   *   o
    //            *   *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void Display11()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i >= j)
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
    // Method   : Display12
    // input    : 5   5
    // Output   : #   o   o   o   o
    //            *   #   o   o   o
    //            *   *   #   o   o
    //            *   *   *   #   o
    //            *   *   *   *   #
    //
    //////////////////////////////////////////////////////////
    public void Display12()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i == j)
                {
                    System.out.print("#  ");
                }
                else if(i > j)
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
    // Method   : rightHalfPyramid
    // input    : 5   5
    // Output   : *                
    //            *   *            
    //            *   *   *        
    //            *   *   *   *    
    //            *   *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void rightHalfPyramid()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i >= j)
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

    //////////////////////////////////////////////////////////
    //
    // Method   : rightHalfPyramidX (Optimize)
    // input    : 5   5
    // Output   : *                
    //            *   *            
    //            *   *   *        
    //            *   *   *   *    
    //            *   *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void rightHalfPyramidX()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= i;j++)
            {
                if(i >= j)
                {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display13
    // input    : 5   5
    // Output   : 1                
    //            1   2            
    //            1   2   3        
    //            1   2   3   4    
    //            1   2   3   4   5
    //
    //////////////////////////////////////////////////////////
    public void Display13()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i >= j)
                {
                    System.out.print(j+"  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : Display14
    // input    : 5   5
    // Output   : 1                
    //            2   2
    //            3   3   3        
    //            4   4   4   4    
    //            5   5   5   5   5
    //
    //////////////////////////////////////////////////////////
    public void Display14()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i >= j)
                {
                    System.out.print(i+"  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //////////////////////////////////////////////////////////
    //
    // Method   : reverseLeftHalfPyramid
    // input    : 5   5
    // Output   : *   *   *   *   *
    //                *   *   *   *
    //                    *   *   *
    //                        *   *
    //                            *
    //
    //////////////////////////////////////////////////////////
    public void reverseLeftHalfPyramid()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i <= j) 
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

    //////////////////////////////////////////////////////////
    //
    // Method   : Display15
    // input    : 5   5
    // Output   : 1   2   3   4   5
    //                2   3   4   5
    //                    3   4   5
    //                        4   5
    //                            5
    //
    //////////////////////////////////////////////////////////
    public void Display15()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i <= j) 
                {
                    System.out.print(j+"  ");
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
    
    //////////////////////////////////////////////////////////
    //
    // Method   : Display16
    // input    : 5   5
    // Output   : 1   1   1   1   1
    //                2   2   2   2
    //                    3   3   3
    //                        4   4
    //                            5
    //
    //////////////////////////////////////////////////////////
    public void Display16()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = 1;j <= this.iCol;j++)
            {
                if(i <= j) 
                {
                    System.out.print(i+"  ");
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

    //////////////////////////////////////////////////////////
    //
    // Method   : Display17
    // input    : 5   5
    // Output   : *   *   *   *   #
    //            *   *   *   #   o
    //            *   *   #   o   o
    //            *   #   o   o   o
    //            #   o   o   o   o
    //
    //////////////////////////////////////////////////////////
    public void Display17()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = this.iCol;j >= 1;j--)
            {
                if(i < j) 
                {
                    System.out.print("*  ");
                }
                else if(i == j) 
                {
                    System.out.print("#  ");
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
    // Method   : leftHalfPyramid
    // input    : 5   5
    // Output   :                 *
    //                        *   *
    //                    *   *   *
    //                *   *   *   *
    //            *   *   *   *   *
    //
    //////////////////////////////////////////////////////////
    public void leftHalfPyramid()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = this.iCol;j >= 1;j--)
            {
                if(i >= j) 
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

    //////////////////////////////////////////////////////////
    //
    // Method   : reverseRightHalfPyramid
    // input    : 5   5
    // Output   : *   *   *   *   *
    //            *   *   *   *    
    //            *   *   *        
    //            *   *            
    //            *                
    //
    //////////////////////////////////////////////////////////
    public void reverseRightHalfPyramid()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = this.iCol;j >= 1;j--)
            {
                if(i <= j) 
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

    //////////////////////////////////////////////////////////
    //
    // Method   : reverseRightHalfPyramidX  (Optimize)
    // input    : 5   5
    // Output   : *   *   *   *   *
    //            *   *   *   *    
    //            *   *   *        
    //            *   *            
    //            *                
    //
    //////////////////////////////////////////////////////////
    public void reverseRightHalfPyramidX()
    {
        if(this.iRow != this.iCol)
        {
            System.out.println("rows and columns should be same.");
            return;
        }
        
        int i = 0, j = 0;

        for(i = 1;i <= this.iRow;i++)
        {
            for(j = this.iCol;j >= i;j--)
            {
                if(i <= j) 
                {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}