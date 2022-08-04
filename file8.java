//to read and write a binary files

import java.io.*;
import java.lang.*;
import java.util.*;

class file8
{
    public static void main(String arg[]) throws Exception
    {
    
        BufferedInputStream in=new BufferedInputStream(new FileInputStream("C:/Users/ABHIJEET/Pictures/Saved Pictures/Ab.jpg"));
        BufferedOutputStream  out=new BufferedOutputStream(new FileOutputStream("C:/Users/ABHIJEET/Pictures/Saved Pictures/Abhi2.jpg"));

        byte buffer[]=new byte[256];

        int count=in.read(buffer);  //read byte array
        while(count>0)   //0 if end of file
        {
            //takes buffer,start index,total elements to be copied
            out.write(buffer,0,count);
            count=in.read(buffer);
        }

        out.close();
        in.close();

        
    }
}


