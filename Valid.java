import java.util.*;
public class Valid
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.print("enter the username:");
String a=s.next();
Scanner r=new Scanner(System.in);
System.out.print("re enter the username:");
String b=r.next();
if(a.equals(b))
{
System.out.print(" username is valid:");
}
else
{
System.out.print(" username is invalid:");
}
}
}
