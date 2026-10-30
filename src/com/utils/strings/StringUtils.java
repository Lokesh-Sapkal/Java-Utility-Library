package com.utils.strings;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	StringUtils
//	Description			:	This class provides operations on strings.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class StringUtils
{
    private String sValue;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	StringUtils
    //	Description             :   This is parameterized constructor of the StringUtils class
    //                              and is used to initialized characteristics.
    //	Parameters				:   String(str)
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public StringUtils(String str)
    {
        if(str == null)
        {
            System.out.println("String is not provided.");
            return;
        }
        
        this.sValue = str;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countCapitalChar
    //	Description             :   This method is used to count capital character.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countCapitalChar()
    {
        int i = 0, iCntCapital = 0;

        if(sValue != null)
        {
            for(i = 0;i < sValue.length();i++)
            {
                if((sValue.charAt(i) >= 'A') && (sValue.charAt(i) <= 'Z'))
                {
                    iCntCapital++;
                }
            }
        }

        return iCntCapital;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countSmallChar
    //	Description             :   This method is used to count small character.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countSmallChar()
    {
        int i = 0, iCntSmall = 0;

        if(sValue != null)
        {
            for(i = 0;i < sValue.length();i++)
            {
                if((sValue.charAt(i) >= 'a') && (sValue.charAt(i) <= 'z'))
                {
                    iCntSmall++;
                }
            }
        }

        return iCntSmall;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countDigit
    //	Description             :   This method is used to count digit.
    //	Parameters				:   NONE
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countDigit()
    {
        int i = 0, iCntDigit = 0;

        if(sValue != null)
        {
            for(i = 0;i < sValue.length();i++)
            {
                if((sValue.charAt(i) >= '0') && (sValue.charAt(i) <= '9'))
                {
                    iCntDigit++;
                }
            }
        }

        return iCntDigit;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findOccurrence
    //	Description             :   This method is used to find occurrence of accepted character.
    //	Parameters				:   char
    //	Returns					:   boolean
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean findOccurrence(char cValue)
    {
        int i = 0;
        boolean isFound = false;

        if(sValue != null)
        {
            for(i = 0;i < sValue.length();i++)
            {
                if(sValue.charAt(i) == cValue)
                {
                    isFound = true;
                    break;
                }
            }
        }

        return isFound;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	findOccurrenceIgnoreCase
    //	Description             :   This method is used to find occurrence of accepted character.
    //                              (Case insensitive)
    //	Parameters				:   char
    //	Returns					:   boolean
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean findOccurrenceIgnoreCase(char cValue)
    {
        int iStart = 0, iEnd = 0, iDisplacement = 0;
        boolean isFound = false;

        if((cValue >= 'A') && (cValue <= 'Z'))
        {
            iDisplacement = 32;
        }
        else if((cValue >= 'a') && (cValue <= 'z'))
        {
            iDisplacement = -32;
        }

        if(sValue != null)
        {
            for(iStart = 0,iEnd = (this.sValue.length())-1;iStart <= iEnd;iStart++,iEnd--)
            {
                if((sValue.charAt(iStart) == cValue) || (sValue.charAt(iStart) == cValue + iDisplacement) || (sValue.charAt(iEnd) == cValue) || (sValue.charAt(iEnd) == cValue + iDisplacement))
                {
                    isFound = true;
                    break;
                }
            }
        }

        return isFound;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countFrequency
    //	Description             :   This method is used to count frequncy of accepted character.
    //	Parameters				:   char
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countFrequency(char cValue)
    {
        int i = 0, iCntFreq = 0;

        if(sValue != null)
        {
            for(i = 0;i < sValue.length();i++)
            {
                if(sValue.charAt(i) == cValue)
                {
                    iCntFreq++;
                }
            }
        }

        return iCntFreq;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	countFrequencyIgnoreCase
    //	Description             :   This method is used to count frequncy of accepted character.
    //                              (Case insensitive)
    //	Parameters				:   char
    //	Returns					:   int
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public int countFrequencyIgnoreCase(char cValue)
    {
        int i = 0, iCntFreq = 0, iDisplacement = 0;

        if(sValue != null)
        {
            if((cValue >= 'A') && (cValue <= 'Z'))
            {
                iDisplacement = 32;
            }
            else if((cValue >= 'a') && (cValue <= 'z'))
            {
                iDisplacement = -32;
            }

            for(i = 0;i < sValue.length();i++)
            {
                if((sValue.charAt(i) == cValue) || (sValue.charAt(i) == cValue + iDisplacement))
                {
                    iCntFreq++;
                }
            }
        }

        return iCntFreq;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	strLower
    //	Description             :   This method is used to convert letters in a string to 
    //                              lower case if they are in upper case.
    //	Parameters				:   NONE
    //	Returns					:   String
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public String strLower()
    {
        int i = 0;
        char str[] = this.sValue.toCharArray();

        for(i = 0;i < str.length;i++)
        {
            if((str[i] >= 'A') && (str[i] <= 'Z'))
            {
                str[i] += 32;
            }
        }

        return new String(str);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	strUpper
    //	Description             :   This method is used to convert letters in a string to 
    //                              upper case if they are in lower case.
    //	Parameters				:   NONE
    //	Returns					:   String
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public String strUpper()
    {
        int i = 0;
        char str[] = this.sValue.toCharArray();

        for(i = 0;i < str.length;i++)
        {
            if((str[i] >= 'a') && (str[i] <= 'z'))
            {
                str[i] -= 32;
            }
        }

        return new String(str);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	strToggle
    //	Description             :   This method is used to convert letters in a string to upper case 
    //                              if they are in lower case and lower case if they are in upper case.
    //	Parameters				:   NONE
    //	Returns					:   String
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public String strToggle()
    {
        int i = 0;
        char str[] = this.sValue.toCharArray();

        for(i = 0;i < str.length;i++)
        {
            if((str[i] >= 'A') && (str[i] <= 'Z'))
            {
                str[i] += 32;
            }
            else if((str[i] >= 'a') && (str[i] <= 'z'))
            {
                str[i] -= 32;
            }
        }

        return new String(str);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	strReverse
    //	Description             :   This method is used to reverse the string.
    //	Parameters				:   NONE
    //	Returns					:   String
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public String strReverse()
    {
        int iStart = 0, iEnd = 0;
        char cValue = '\0';
        char str[] = this.sValue.toCharArray();

        for(iStart = 0,iEnd = (str.length-1);iStart < iEnd;iStart++,iEnd--)
        {
            cValue = str[iStart];
            str[iStart] = str[iEnd];
            str[iEnd] = cValue;
        }

        return new String(str);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	checkPalindrome
    //	Description             :   This method is used to check whether a string is a palindrome or not.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean checkPalindrome()
    {
        int iStart = 0, iEnd = 0;
        boolean isPalindrome = true;

        if(sValue != null)
        {
            for(iStart = 0,iEnd = (this.sValue.length())-1;iStart < iEnd;iStart++,iEnd--)
            {
                if((this.sValue.charAt(iStart)) != (this.sValue.charAt(iEnd)))
                {
                    isPalindrome = false;
                    break;
                }
            }
        }

        return isPalindrome;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	checkPalindromeIgnoreCase
    //	Description             :   This method is used to check whether a string is a palindrome or not.
    //                              (Case insensitive)
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean checkPalindromeIgnoreCase()
    {
        int iStart = 0, iEnd = 0;
        boolean isPalindrome = true;

        if(sValue != null)
        {
            String str = strLower();

            for(iStart = 0,iEnd = (str.length()-1);iStart < iEnd;iStart++,iEnd--)
            {
                if((str.charAt(iStart)) != (str.charAt(iEnd)))
                {
                    isPalindrome = false;
                    break;
                }
            }
        }

        return isPalindrome;
    }
}