//to read from text file character by character


import java.io.*;
import java.lang.*;
import java.util.*;

class file4
{
    public static void main(String arg[]) throws Exception
    {
       FileReader reader=new FileReader("file4.java");  //open a file

       //read a character as ASCII or Unicode;
       int ch=reader.read();
       char chr;
       
       //ch is -1 if no more character is left in the file
       while(ch!=-1)
       {
        chr=(char)ch ;  //typecast to char
        System.out.print(chr);
        ch=reader.read();  //to read next character
       }

       reader.close();
        
        
    }

    
}