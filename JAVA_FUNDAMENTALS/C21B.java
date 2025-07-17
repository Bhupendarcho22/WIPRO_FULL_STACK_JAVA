import java.util.Scanner;
class C21B{
public static void main(String[] args){
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter num1");
a=sc.nextInt();
System.out.println("Enter num2");
b=sc.nextInt();
boolean same=(a%10)==(b%10);
System.out.println(same);
}
}