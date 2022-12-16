import java.util.Scanner;
 class Employee{
 String name;
 int age;
 int number;
 char address;
 int salary;
  void printSalary(int salary){
  System.out.print("Salary: "+salary);
  }
}
class Officer extends Employee{
char spec;
}
class Manager extends Employee{
char dept;
}
class Details{
 public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter Officer details");
Officer o = new Officer();
System.out.println("Enter name:");
 o.name = in.nextLine();
System.out.print("Enter age:");
o.age = in.nextInt();
System.out.print("Enter number:");
o.number = in.nextInt();
System.out.print("Enter salary:");
 o.salary = in.nextInt();
 System.out.print("enter specialization:");
 o.spec = in.nextChar();
System.out.println("name:" +o.name);
System.out.println("age:" +o.age);
System.out.println("number:" +o.number);
System.out.println("address:" +o.address);
System.out.println("salary:" +o.salary);
System.out.println("specialization:" +o.spec);

System.out.println("Enter Manager details");
Manager m=new Manager();
System.out.print("Enter name:");
 m.name = in.nextLine();
System.out.print("Enter age:");
 m.age = in.nextInt();
System.out.print("Enter number:");
 m.number = in.nextInt();
System.out.print("Enter address:");
 m.address = in.nextChar();
System.out.print("Enter salary:");
 m.salary = in.nextInt();
 System.out.print("Enter department:");
 m.dept = in.nextChar();

System.out.println("name:" +m.name);
System.out.println("age:" +m.age);
System.out.println("number:" +m.number);
System.out.println("address:" +m.address);
System.out.println("salary:" +m.salary);
System.out.println("dept:" +m.dept);

}
}

