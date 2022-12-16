import java.util.*;
import java.io.*;
public class FileExp{
 public static void main(String args[])throws IOException{
 try{
  FileOutputStream f = new FileOutputStream("File.txt");
  String s;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter data");
  s = sc.nextLine();
  byte b[] = s.getBytes();
  f.write(b);
  f.close();
  System.out.println("Written successfully");
  }
  catch(Exception e)
  {
  System.out.println(e.getMessage());
  }
 FileInputStream 0 = null;
  try{
   0=new FileInputStream("File.txt");
  }
catch(FileNotFoundexception e)
{
 System.out.println("File not found" +e);
}
int i;
while((i=0.read())!=-1)
{
 System.out.println((char)i);
}
System.out.println("finished");
 }
 }
 

