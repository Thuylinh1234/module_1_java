package bai_tap_1;

import java.util.Scanner;

/**
 * Nhập tên sản phẩm, số lượng và đơn giá. Tính tiền và thuế giá trị gia tăng phải trả, biết:
 * a. tiền = số lượng * đơn giá
 * b. thuế giá trị gia tăng = 10%
 */
public class TinhTienThue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPham = sc.nextLine();

        System.out.print("Nhập số luợng: ");
        int soLuong = sc.nextInt();

        System.out.print("Đơn giá: ");
        double donGia = sc.nextDouble();

        Double tinhTong = soLuong * donGia;
        Double thueVat = tinhTong * 0.1;

        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Tổng tiền sản phẩm: " + tinhTong);
        System.out.println("Thuế VAT: " + thueVat);
    }
}
