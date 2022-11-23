import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Linkedlist
{
 class Node
 {
  int data;
  Node prev;
  Node next;
  public Node(int data)
  {
   this.data = data;
  }
 }
 Node head,tail=null;
 public void atBeg(int data)
 {
   Node newNode = new Node(data);
   newNode.next = head;
   newNode.prev = null;
   if(head!=null)
    head.prev = newNode;
    head = newNode;
 }
 public void atEnd(int data)
 {
 Node newNode = new Node(data);
 newNode.next = null;
 if(head==null)
 {
  head = newNode;
  newNode.prev = null;
  return;
 }
 Node last = head;
 while(last.next!=null)
  last = last.next;
  last.next = newNode;
  newNode.prev = last;
 }
public void atPos(int n, int data)
{
 int len = getLength(head);
 if(n==0)
 {
  atBeg(data);
  return;
 }
 if(n<1||len<n)
  System.out.println("invalid position");
  else
  {
   Node newNode = new Node(data);
   newNode.next = null;
   newNode.prev = null;
   Node nNode = head;
   while(--n>0)
   {
   nNode = nNode.next;
   }
   Node nextNode = nNode.next;
   nextNode.prev = newNode;
   newNode.next = nextNode;
   nNode.next = newNode;
  }
  
}
 public void delete()
 {
  if (head==null)
  { 
  System.out.println("No element to delete");
  }
  else if(head!=tail)
  {
  tail = tail.prev;
  tail.next = null;
  System.out.println("Last element deleted");
 }
 
 else{
  head = tail = null;
 }
 }
 public void display()
  {
  Node current = head;
  if(head==null)
  {
   System.out.println("List is empty");
  return;
  }
  System.out.println("nodes of linked list are:");
  while(current!=null)
  {
   System.out.println(current.data + "");
   current = current.next;
  }
  }
  
  public static void main(String args[])
  {
   int n, opt,pos, num;
     Scanner sc=new Scanner(System.in);
   Linkedlist l = new Linkedlist();
   System.out.println("Select operation: 1.Insertion 2. Deletion 3. Display 4. Exit");
   opt = sc.nextInt();
    switch(opt){
     case 1:
     {
        System.out.println("Choose position to enter data: 1.Beginning\n 2.End\n 3.At a position");
        pos = sc.nextInt();
           switch(opt)
           {
             case 1:{
              System.out.println("Enter element");
              l.atBeg(num);
              num = sc.nextInt();
            break;
            }
            case 2:{
              System.out.println("Enter element");
              l.atEnd(num);
              num = sc.nextInt();
            break;
            }
            case 3:{
              System.out.println("Enter element");
              l.atPos(n, num);
              n= sc.nextInt();
              num = sc.nextInt();
            break;
            }
          }
     }
    case 2:
    {
     l.delete();
     break;
    }
   case 3:
   {
    l.display();
    break;
   }
   case 4:
   {
    System.exit(0);
    break;
    }
   default:
   {
   System.out.println("wrong choice");
   break;
   }
  
  }
}
}

