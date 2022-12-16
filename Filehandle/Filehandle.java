import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Filehandle
{
 public static void main(String[] args)
  {
   try
    {
     File file=new File("/home/mec/Annu/File1.txt");
      if(file.createNewFile())
       {
        System.out.println("file created:"+file.getName());
       }
     else
     {
      System.out.println("File exist");
     }
    }
   catch(IOException e)
   {
    System.out.println("error occured");
    e.printStackTrace();
   }
  try
  {
   FileWriter writer = new FileWriter("/home/mec/Annu/File1.txt");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter text to be written:");
   String text = sc.nextLine();
   writer.write(text);
   writer.close();
   System.out.println("Succesfully wrote to the file");
  }
  catch(IOException e2)
  {
  System.out.print("error occured");
  e2.printStackTrace();
  }
  }

}
