package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * Viết chương trình tính S = a! + b! + c! với a, b, c là 3 số nguyên dương nhập từ bàn phím.
 */
public class BaiTap20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        long giaithuaA = 1, giaiThuaB = 1, giaithuaC = 1;
//        do {
//            System.out.print("Nhập a: ");
//            a = sc.nextInt();
//            System.out.print("Nhập b: ");
//            b = sc.nextInt();
//            System.out.print("Nhập c: ");
//            c = sc.nextInt();
//            if (a < 0 || b < 0 || c < 0) {
//                System.out.println("Bạn nhập sai vui lòng nhập lại");
//            }
//        } while (a <= 0 || b <= 0 || c <= 0);
        do {
            System.out.print("Nhập a: ");
            a = sc.nextInt();
            if (a < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhập b: ");
            b = sc.nextInt();
            if (b < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (b <= 0);

        do {
            System.out.print("Nhập c: ");
            c = sc.nextInt();
            if (c < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (c <= 0);


        for (int i = 1; i <= a; i++) {
            giaithuaA *= i;
        }

        for (int i = 1; i <= b; i++) {
            giaiThuaB *= i;
        }

        for (int i = 1; i <= c; i++) {
            giaithuaC *= i;
        }

        long Tong = giaithuaA + giaiThuaB + giaithuaC;

        System.out.printf("Tổng của giai thừa: %d! + %d! + %d! = %d", giaithuaA, giaiThuaB, giaithuaC, Tong);
    }
}
