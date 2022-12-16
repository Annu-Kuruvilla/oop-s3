import java.util.Scanner;
public class BinSearch
{
  public static void main(String args[])
  {
   int a[], lb, ub;
   int mid;
   int key;
   int i;
   int n;
   int temp = 0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of elements of array");
   n = sc.nextInt();
   a = new int[n];
   System.out.println("Enter elements in array");
   for(i=0;i<n;i++)
    a[i] = sc.nextInt();
   for(int j=0;j<n;j++)
    for (int k=1;k<(n-i);k++)
     {
      if(a[k-1]>a[k])
      {
       temp = a[k-1];
       a[k-1] = a[j];
       a[j] = temp;
      }
     }
   System.out.println("Enter element to search");
    key = sc.nextInt();
   lb = 0;
   ub = n-1;
   mid = (lb+ub)/2;
   while(lb<=ub)
    {
     if(a[mid]<key)
      lb = mid+1;
    else if(a[mid]==key)
    {
     System.out.println("element found at position " +(mid+1));
     break;
     }
     else
     {
      ub = mid-1;
     }
     mid = (lb+ub)/2;
    }
    if(lb>ub)
    System.out.println("Element not found");
  } 
}

