import java.util.*;

public class vajok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(); // টেস্ট কেস সংখ্যা

        for (int i = 1; i <= t; i++) {
            int n = input.nextInt();
            List<Integer> divisors = new ArrayList<>();

            // গুণনীয়ক বের করা
            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) {
                    divisors.add(j);
                    if (j != n / j) {
                        divisors.add(n / j);
                    }
                }
            }

            // ছোট থেকে বড় ক্রমে সাজানো
            Collections.sort(divisors);

            // আউটপুট ফরম্যাট করা
            System.out.print("Case " + i + ": ");
            for (int k = 0; k < divisors.size(); k++) {
                System.out.print(divisors.get(k));
                if (k < divisors.size() - 1) System.out.print(" ");
            }
            System.out.println();
        }

        input.close();
    }
}
