import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        do
        {
            n = sc.nextInt();
            if(n!=0){
                sum = sum + n;
            }
        }
        while(n!=0);
        System.out.print(sum);
    }
}
