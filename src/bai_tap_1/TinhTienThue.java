package bai_tap_1;

import java.util.Scanner;

public class TinhTienThue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String tensanpham = sc.nextLine();
        System.out.print("Nhập số luợng: ");
        int soluong = sc.nextInt();
        System.out.print("Đơn giá: ");
        double dongia = sc.nextDouble();
        Double tinhtong = soluong * dongia;
        Double thueVAT = tinhtong * 0.1;
        System.out.println("Tên sản phẩm: " + tensanpham);
        System.out.println("Tổng tiền sản phẩm: " + tinhtong );
        System.out.println("Thuế VAT: " + thueVAT);
    }
}
