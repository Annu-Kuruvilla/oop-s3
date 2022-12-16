import java.io.*;
import java.util.Scanner;
public class Matmul
{
 public static void main(String args[])
 {
 int m,n,r,c,k=0,i=0,j=0;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of rows and coloumns of matrix 1 and 2");
 m=sc.nextInt();
 n=sc.nextInt();
 r=sc.nextInt();
 c=sc.nextInt();
 int mat1[][]=new int[m][n];
 int mat2[][]=new int[r][c]; 
 int mult[][]=new int[m][c];
 System.out.println("Enter elements of matrix 1");
 for(i=0;i<m;i++)
  for(j=0;j<n;j++)
   mat1[i][j]=sc.nextInt();
  System.out.println("Enter elements of matrix 2");
 for(i=0;i<r;i++)
  for(j=0;j<c;j++)
   mat2[i][j]=sc.nextInt();
if(n!=r){
 System.out.println("Matrices cannot be multiplied");

  }
else{
 System.out.println("\nMatrix multiplication is : ");
    for (i=0;i<m;i++) {
      for (j=0;j<c;j++) {
      
        mult[i][j] = 0;

        for (k=0;k<n;k++) {
          mult[i][j] += mat1[i][k] * mat2[k][j];
        }
        
        System.out.print(mult[i][j] + " ");
      }
      System.out.println();
    }
 }
 }

}
