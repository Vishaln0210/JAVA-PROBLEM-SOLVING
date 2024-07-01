import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter: ");
        int num = sc.nextInt();
        int c = 2;
        boolean isPrime = true;
        int a = (int) Math.sqrt(num);

        while (c < a) {
            if (a % c == 0) {
                System.out.print("it is not prime");
                isPrime = false;
                break;
            }
            c++;
        }

        if (isPrime) {
            System.out.print("it is prime");
        }
    }
}
