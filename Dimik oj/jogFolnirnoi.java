import java.util.Scanner;

public class jogFolnirnoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read how many numbers we have to process
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            // Read the number as an integer
            int num = sc.nextInt();

            // Extract the last digit
            int last = num % 10;

            // Extract the first digit
            int first = num;
            while (first >= 10) {
                first /= 10;
            }

            // Compute the sum
            int sum = first + last;

            // Required output format: "Sum = <value>"
            System.out.println("Sum = " + sum);
        }

        sc.close();
    }
}


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // read how many numbers we have to process
//         int t = sc.nextInt();

//         for (int i = 0; i < t; i++) {
//             // read the five-digit number as a string
//             String num = sc.next();

//             // first digit
//             char first = num.charAt(0);
//             // last digit
//             char last = num.charAt(num.length() - 1);

//             // convert characters to integers and add them
//             int sum = (first - '0') + (last - '0');

//             // required output format: "Sum = <value>"
//             System.out.println("Sum = " + sum);
//         }

//         sc.close();
//     }
// }