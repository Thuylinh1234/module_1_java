package bai_tap_1;

import java.util.Scanner;

public class ChuViDienTichHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        Double r = sc.nextDouble();

        Double bankinh =  2 * Math.PI * r;
        System.out.printf("Chu vi của hình tròn: %.2f\n ",  bankinh);
        Double dientich = Math.PI * r*r;
        System.out.printf("Diện tích của hình tròn: %.2f ", dientich);

    }
}
