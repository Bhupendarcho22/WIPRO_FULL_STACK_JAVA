import java.util.Scanner;
class C22{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number: ");
int num=scan.nextInt();
if(num%2==0){
System.out.println("Even");
}else{
System.out.println("Odd");
}
}
}