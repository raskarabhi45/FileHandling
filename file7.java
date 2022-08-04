//to read and write a binary files

import java.io.*;
import java.lang.*;
import java.util.*;

class file7
{
    public static void main(String arg[]) throws Exception
    {
        String src="C:/Users/ABHIJEET/Pictures/Saved Pictures/abhishek.jpg";
        String dest="C:/Users/ABHIJEET/Pictures/Saved Pictures/Abhi2.jpg";

        FileInputStream in=new FileInputStream(src);
        FileOutputStream out=new FileOutputStream(dest);

        int ch=in.read();  //read a byte
        while(ch!=-1)   //-1 end of file
        {
            out.write(ch); //write a byte
            ch=in.read();

        }
        out.close();
        in.close();

        
    }
}


