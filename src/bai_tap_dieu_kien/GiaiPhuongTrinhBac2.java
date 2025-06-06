package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Giải phương trình bậc 2 có dạng: a𝑥2 + bx + c = 0.
 */
public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.printf("Phương trình có nghiệm x = %.2f\n", x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có một nghiệm duy nhất x = %.2f\n", x);
            } else if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt là: ");
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            }

        }
    }
}
