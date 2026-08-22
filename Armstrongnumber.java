import java.util.Scanner;
public class Armstrongnumber{
publis static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int number=sc.nextInt();
int origNumber = number;
int sum=0;
while(number>0){
int digit =number%10;
sum+=digit*digit*digit;
number=number/10;
}
if(sum==origNumber){
System.out.println(" Is the number "+number+" an armsteongnumber?true ");
}else{
System.out.println("Is the number "+number+" an armsteongnumber?false ");
}
sc.close();
}
}
