//list of subdirectories and files in folder
/*

 */

import java.io.File;
import java.lang.*;
import java.util.*;

class file2
{
    public static void main(String arg[])
    {
        File dir=new File("C:/Users/ABHIJEET/Desktop/javaa");
        //get the list of files and sub-directories
        String files[]=dir.list();

        for(String f:files)
        {
            System.out.println(f);
        }
    }

    
}