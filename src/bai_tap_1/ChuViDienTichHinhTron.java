package bai_tap_1;

import java.util.Scanner;

/**
 * Nhập bán kính của đường tròn. Tính chu vi và diện tích của hình tròn đó.
 * <p>
 * Công thức
 * Chu vi: C = 2 * π * r
 * Diện tích: A = π * r²
 */
public class ChuViDienTichHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        Double r = sc.nextDouble();

        Double banKinh = 2 * Math.PI * r;
        System.out.printf("Chu vi của hình tròn: %.2f\n ", banKinh);

        Double dienTich = Math.PI * Math.pow(r, 2);
        System.out.printf("Diện tích của hình tròn: %.2f ", dienTich);

    }
}
