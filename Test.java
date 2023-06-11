import java.util.Scanner;
class PolymorphismExample1{
void print()
{
System.out.println("Welcome");
}
void print(String n)
{
System.out.println("Welcome  " + n );
}
}
class Test{
public static void main(String args[]){
PolymorphismExample1 a=new PolymorphismExample1();
a.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type your name:");
String s=sc.next();
a.print(s);
}
}

