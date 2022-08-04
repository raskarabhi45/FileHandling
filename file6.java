//to write text using BufferedWriter

import java.io.*;
import java.lang.*;
import java.util.*;

class file6
{
    public static void main(String arg[]) throws Exception
    {
        FileWriter fobj=new FileWriter("file7.java");

        BufferedWriter bobj=new BufferedWriter(fobj);

        char arr[]={'h','e','l','l','o'};
        bobj.write(arr);  //write characer array
        bobj.write(',') ;  //write a character
        bobj.write("Jay Ganesh");  //write string
        bobj.close();

        
    }
}


