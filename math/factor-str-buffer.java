import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuffer sb = new StringBuffer();
        
        // Collect factors and append them to the StringBuffer
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (sb.length() > 0) {
                    sb.append(", ");  // Append a comma and space before each factor after the first one
                }
                sb.append(i);  // Append the factor
            }
        }
        
        // Output the result
        System.out.println(sb.toString());
    }
}
