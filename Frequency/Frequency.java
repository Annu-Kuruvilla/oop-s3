import java.util.Scanner;
public class Frequency {

    public static void main(String[] args) {
       System.out.println("Enter a string");
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       System.out.print("Enter a character");
       char ch=sc.nextLine().charAt(0);
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
