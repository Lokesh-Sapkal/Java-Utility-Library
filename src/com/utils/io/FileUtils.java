package com.utils.io;

import java.io.*;
import java.util.Scanner;

///////////////////////////////////////////////////////////////////////////////////////////
//
//	Class Name			:	FileUtils
//	Description			:	This class provides utilities for file operations.
//
///////////////////////////////////////////////////////////////////////////////////////////
public class FileUtils
{
    private String filePath;
    private String fileName;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	FileUtils
    //	Description             :   This is parameterized constructor of the FileUtils class
    //                              and it is used to initialize characteristics.
    //	Parameters				:   String(name)
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public FileUtils(String name)
    {
        this.filePath = "com/utils/io/backups";
        this.fileName = name;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	ensureDirExists
    //	Description             :   Ensure that the required directory exists, creating it if necessary.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //                              true -> if a new directory created successfully or directory already exists.
    //                              false -> if directory creation fails.
    //
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean ensureDirExists()
    {
        boolean isExists = true;
        File fobj = new File(filePath);

        if(!(fobj.isDirectory()))
        {
            isExists = fobj.mkdirs();
        }

        return isExists;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	createFile
    //	Description             :   Create a new file if it does not exist.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //                              true -> if a new file created successfully.
    //                              false -> if file already exists or creation fails.
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean createFile()
    {
        boolean isfileCreate = false;
        try
        {
            if(ensureDirExists())
            {
                File fobj = new File(filePath+"/"+fileName+".txt");
                isfileCreate = fobj.createNewFile();
            }

        }
        catch(IOException e)
        {
            System.out.println("An exception occurred: "+e.getMessage());
        }
        return isfileCreate;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	isFileExists
    //	Description             :   Checks whether the file is available or not.
    //	Parameters				:   NONE
    //	Returns					:   boolean
    //                              true -> if a file is available.
    //                              false -> if a file is not available.
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean isFileExists()
    {
        File fobj = new File(filePath+"/"+fileName+".txt");
        return fobj.isFile();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	getFileInfo
    //	Description             :   Returns the file name and absolute path.
    //	Parameters				:   NONE
    //	Returns					:   String
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public String getFileInfo()
    {
        File fobj = new File(filePath+"/"+fileName+".txt");
        if(isFileExists())
        {
            String fInfo = "File name : "+fobj.getName()+"\nFile path : "+fobj.getAbsolutePath();
            return fInfo;
        }
        else
        {
            return "No such file is available.";
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	writeToFile
    //	Description             :   Write user-provided text to a file, replacing existing content.
    //	Parameters				:   Scanner
    //	Returns					:   NONE
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public void writeToFile(Scanner sobj)
    {
        String text = "";
        try(FileWriter writer = new FileWriter(filePath+"/"+fileName+".txt"))
        {
            System.out.print("Enter the string that you want to write in file : ");
            text = sobj.nextLine();

            writer.write(text);
        }
        catch(IOException e)
        {
            System.out.println("An exception occurred: "+e.getMessage());
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	appendToFile
    //	Description             :   Append user-provided text to an existing file 
    //                              without overwriting its contents.
    //	Parameters				:   Scanner
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void appendToFile(Scanner sobj)
    {
        String text = "";
        try(FileWriter writer = new FileWriter(filePath+"/"+fileName+".txt",true))
        {
            System.out.print("Enter the string that you want to write in file : ");
            text = sobj.nextLine();

            writer.write("\n");
            writer.write(text);
        }
        catch(IOException e)
        {
            System.out.println("An exception occurred: "+e.getMessage());
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	readFile
    //	Description             :   Read and display the contents of a file.
    //	Parameters				:   NONE
    //	Returns					:   NONE
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void readFile()
    {
        if(isFileExists())
        {
            String text = "";
            try(BufferedReader reader = new BufferedReader(new FileReader(filePath+"/"+fileName+".txt")))
            {
                System.out.println("Data from file is : ");
                while((text = reader.readLine()) != null)
                {
                    System.out.println(text);
                }
            }
            catch(IOException e)
            {
                System.out.println("An exception occurred: "+e.getMessage());
            }
        }
        else
        {
            System.out.println("No such file is available.");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //
    //	Method Name			    :	deleteFile
    //	Description             :   Delete the specified file.
    //                              Returns whether the deletion was successful.
    //	Parameters				:   Scanner
    //	Returns					:   boolean
    //                              true -> if file deleted successfully.
    //                              false -> if file does not exist or deletion fails.
    //
    ///////////////////////////////////////////////////////////////////////////////////////////
    public boolean deleteFile(Scanner sobj)
    {
        String wantDeleteFile = "";
        boolean isDeleteFile = false;
        System.out.println("You want to delete file?(yes/no)");
        wantDeleteFile = sobj.nextLine();

        if(wantDeleteFile.equalsIgnoreCase("yes"))
        {
            File fobj = new File(filePath+"/"+fileName+".txt");
            isDeleteFile = fobj.delete();
        }
        return isDeleteFile;
    }
}