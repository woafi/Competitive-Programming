import java.util.Scanner;

public class oddEven2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            String str = scanner.next();
            
            // Get the last character of the string
            char lastDigit = str.charAt(str.length() - 1);
            
            // Convert last character to integer and check if it's even
            if ((lastDigit - '0') % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        
        scanner.close();
    }
}