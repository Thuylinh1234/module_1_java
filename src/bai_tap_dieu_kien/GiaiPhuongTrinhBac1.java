package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Giải phương trình bậc 1 có dạng: ax + b = 0.
 */
public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }

    }
}
