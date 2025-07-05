package bai_tap_phuong_thuc;

import java.util.Scanner;

/*
Phương thức in ra n phần tử của dãy Fibonacy.
 */
public class BaiTap5 {

    public static void fibonacy(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(fn + "\t");
            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }

    public static int inputPositive(String target) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.printf("Nhập vào số nguyên dương %s: ", target);
            n = sc.nextInt();
            if (n < 0) {
                System.out.printf("%s không phải là số nguyên dương, xin vui lòng nhập lại! \n ", target);
            }
        } while (n <= 0);
        return n;
    }

    public static void main(String[] args) {

        int n = inputPositive("n");
        System.out.println("n = " + n);

        System.out.printf("%d phần tử của Fibonacy: ", n);
        fibonacy(n);
    }
}
