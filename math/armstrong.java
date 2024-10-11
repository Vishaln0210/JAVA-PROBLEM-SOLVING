//check armstrong 
import java .util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalnumber = n;
        int sum = 0;
        int noofdigits = String.valueOf(n).length();
        while(n > 0){
            int digit = n % 10;
            double powered = Math.pow(digit, noofdigits);
            sum += powered;
            n/=10;
        }
        if(sum == originalnumber) {
            System.out.print("it is an armstrong number");
        }
        else{
            System.out.print("it is not an armstrong number");
        }
    }
}
