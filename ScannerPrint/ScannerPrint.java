package ScannerPrint;

import java.util.Scanner;

public class ScannerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] i = new int[3];
        for(int j=0; j < i.length; j ++) {
            i[j] = scan.nextInt();
        }
        for(int j=0; j < i.length; j ++) {
            System.out.println(i[j]);
        }
    }
}
