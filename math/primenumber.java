//Define a method to find out if a number is prime or not.
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        if(n == 2){
            System.out.print("It is prime");
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime == true){
            System.out.print("It is prime");
        }
        else{
            System.out.print("no prime");
        }
    }
}
