//Sum Of A Digits Of Number
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum = sum + digit;
            n/=10;
        }
        System.out.print(sum);
    }
}
