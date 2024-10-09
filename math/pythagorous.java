//(A Pythagorean triplet is when the sum
//of the square of two numbers is equal to the square of the third number)
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String ans = squareoftwo(a,b,c);
        System.out.print(ans);
    }
   public static String squareoftwo(int a, int b, int c) {
    if ((a * a + b * b) == (c * c) || (a * a + c * c) == (b * b) || (b * b + c * c) == (a * a)) {
        return "proved";
    }
    return "invalid";
}
}
