package l_3;

import java.util.Scanner;

public class z_1 {
    
    static int b=2;

        static void stepen (int n) {
            double result =1;
            if (n >= 0) {
            for (int i=0; i<n; i++) {
            result*=b;
            }}
            else { for (int i=0; i< Math.abs(n); i++) {
            result=result/b;
            }}
            System.out.println(result);
        }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    stepen (n);
    }
}