//file information
/*
Name StringX.java
Path C:\Users\ABHIJEET\Desktop\javaa\StringX.java
Access permission
Writable true
Readable true
Isfile true
Isdir false
Data modified Sun Jul 24 13:53:30 PDT 2022
Length 673 bytes
 */

import java.io.File;
import java.lang.*;
import java.util.*;

class file1
{
    public static void main(String arg[])
    {
        File fobj=new File("StringX.java")  ;  //to create the object of file

        //check if file exist
        if(fobj.exists())
        {
            //Name of file
            System.out.println("Name "+fobj.getName());
            
            //path of file
            System.out.println("Path "+fobj.getAbsolutePath());

            //check access permission
            System.out.println("Access permission");
            System.out.println("Writable "+fobj.canWrite());
            System.out.println("Readable "+fobj.canRead());

            //check if it is directory or file
            System.out.println("Isfile "+fobj.isFile());
            System.out.println("Isdir "+fobj.isDirectory());

            //last modified date of file or directory
            Date d=new Date(fobj.lastModified());
            System.out.println("Data modified "+d);

            //Length of file
            long length=fobj.length();
            System.out.println("Length "+length+" bytes");

        }
        else
        {
            System.out.println("File not exist");
        }
    }

    
}