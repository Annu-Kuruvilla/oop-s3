class Garbage{
public static void main(String args[])
{
 Garbage g = new Garbage();
System.out.println("Free memory before garbage collection:");
System.out.println(Runtime.getRuntime().freeMemory());
g=null;
 System.gc();
 System.out.println("Free memory after garbage collection:");
System.out.println(Runtime.getRuntime().freeMemory());
}
}
