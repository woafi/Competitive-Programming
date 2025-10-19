import java.util.Scanner;

public class box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}