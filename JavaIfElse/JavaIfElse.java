package JavaIfElse;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println((N % 2) != 0 || (N <= 20 && N >= 6) ? "Weird" : "Not Weird");
        scanner.close();
    }
}
