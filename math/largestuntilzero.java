//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        do
        {
            n = sc.nextInt();
            if(n!=0)
            {
                if(n > max){
                    max = n;
                }
            }
        }
        while(n!=0);
        System.out.print(max);
    }
}
