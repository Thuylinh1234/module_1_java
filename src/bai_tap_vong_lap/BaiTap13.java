package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * Nhập 2 số nguyên dương a và b.
 * Sau đó in ra ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương a và b đó.
 */
public class BaiTap13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên dương b: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("Cả hai số phải là số nguyên dương.");
            return;
        }

        int uscln = 1;
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln = i;
                break;
            }
        }

        int bscnn = a * b;
        int max = Math.max(a, b);
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                bscnn = i;
                break;
            }
        }

        System.out.println("Ước số chung lớn nhất (USCLN) của " + a + " và " + b + " là: " + uscln);
        System.out.println("Bội số chung nhỏ nhất (BSCNN) của " + a + " và " + b + " là: " + bscnn);
    }
}
