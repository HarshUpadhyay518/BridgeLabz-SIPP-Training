import java.util.*;
public class PrimeChecker  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check if it is prime or not");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    //Method to check if a integer is prime 
    public static boolean isPrime(int number) {
       if(number<=1){
        return false;
       }
       if(number==2){
        return true;
       }
       if(number%2==0){
        return false;
       }
       for(int i=3;i<=Math.sqrt(number);i+=2){
           if(number%i==0){
               return false;
           }
       }
       return true;
   }

}
