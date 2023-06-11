import java.util.Scanner;
public class RemoveStr{
public static void main(String args[]){
Scanner sc=new  Scanner(System.in);
String s;
char c;
s=sc.nextLine();
c=sc.next().charAt(0);
int b=s.charAt(0);
for(int i=0;i<=s.length()-1;i++)
{
if(c!=s.charAt(i))
{
System.out.print(s.charAt(i));
}
}
}
}

