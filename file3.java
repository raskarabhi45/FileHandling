//to rename file and delete directory


import java.io.File;
import java.lang.*;
import java.util.*;

class file3
{
    public static void main(String arg[])
    {
        File file=new File("code.c");
        //rename file
        file.renameTo(new File("code1.java"));
        //delete file
        //file.delete()
        
        File file1=new File("ab.txt");
        file1.delete();
        //delete if exist;
       // file1.deleteOnExist();
        
        
    }

    
}