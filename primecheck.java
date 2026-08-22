import java.util.Scanner;
public class primecheck{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int number = sc.nextInt();
boolean isprime=true;
if(number<=1){
isprime=false;
}else{
for(int i=2;i<number;i++){
if(number%i==0){
isprime=false;
break;
}
}
}
System.out.println("Is the number:"+number+"a prime number"+isprime);
sc.close();
}
}
