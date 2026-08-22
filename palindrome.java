import java.util.Scanner;
public class palindrome{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number:");
int number =sc.nextInt();
int originalNumber = number;
int reverseNumber=0;
while(number>0){
int digit = number%10;
reverseNumber=reverseNumber*10+digit;
number=number/10;
}
if(reverseNumber==originalNumber){
System.out.println("Is the number"+originalNumber+" "+"a palindrome?true");
}else{
System.out.println("Is the number"+ originalNumber +" "+  "a palindrome?false ");
}
sc.close();
}
}
