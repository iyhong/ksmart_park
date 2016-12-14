package no01;

import java.io.IOException;
import java.io.FileInputStream;

public class Bb {
   public static void main(String[] args) throws IOException {
      
      FileInputStream fis = null;
      int i = 0;
      char c;
      
      try{
         // create new file input stream
         fis = new FileInputStream("d://test.txt");
         
         // read till the end of the file
         while((i=fis.read())!=-1)
         {
            // converts integer to character
            c=(char)i;
            
            // prints character
            System.out.print(c);
           // System.out.println(i);
         }
      }catch(Exception ex){
         // if any error occurs
         ex.printStackTrace();
      }finally{
         
         // releases all system resources from the streams
         if(fis!=null)
            fis.close();
      }
   }
}