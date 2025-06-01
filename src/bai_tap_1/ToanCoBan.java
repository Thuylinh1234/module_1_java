package bai_tap_1;

import java.util.Scanner;

public class ToanCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhâp số b: ");
        int b = sc.nextInt();
        System.out.println("Tổng của 2 số  : "+  (a+b));
        System.out.println("Hiệu của 2 số   : " + (a-b));
        System.out.println("Tích của 2 số   : " + (a*b));
        double Thuong = a/b;
        System.out.println("Thương của 2 số  : " + Thuong );

    }
}
