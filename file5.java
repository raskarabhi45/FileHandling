//to read from text file line by line

import java.io.*;
import java.lang.*;
import java.util.*;

class file5
{
    public static void main(String arg[]) throws Exception
    {
        FileReader fobj=new FileReader("file5.java");

        //wrap reader by Scanner object
        Scanner sobj=new Scanner(fobj);

        while(sobj.hasNext())   //check the next word
        {
            String line=sobj.nextLine();
            System.out.println(line);
        }

        
    }
}




/* 
import java.io.*;
import java.lang.*;
import java.util.*;

class file5
{
    public static void main(String arg[]) throws Exception
    {
        FileReader fobj=new FileReader("file5.java");

        //wrap reader by BufferedReader object
        BufferedReader bobj=new BufferedReader(fobj);

        int ch=bobj.read(); //read single character
        String line=bobj.readLine();   //read line

        
    }
}
*/