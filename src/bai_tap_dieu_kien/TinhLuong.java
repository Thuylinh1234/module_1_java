package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Viết chương trình tính lương của nhân viên dựa theo thâm niên công tác (TNCT) như sau:
 * <p>
 * Lương = hệ số * lương căn bản, trong đó lương căn bản là 650000 $.
 * <p>
 * • Nếu TNCT < 12 tháng: hệ số = 1.92
 * <p>
 * • Nếu 12 <= TNCT < 36 tháng: hệ số = 2.34
 * <p>
 * • Nếu 36 <= TNCT < 60 tháng: hệ số = 3
 * <p>
 * • Nếu TNCT >= 60 tháng: hệ số = 4.5
 */
public class TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập thâm niên công tác: ");
        int tnct = sc.nextInt();

        double luongCanBan = 650000;

        double heSoLuong;
        if (tnct < 12) {
            heSoLuong = 1.92;
        } else if (tnct < 36) {
            heSoLuong = 2.34;
        } else if (tnct < 60) {
            heSoLuong = 3;
        } else {
            heSoLuong = 4.5;
        }

        double luong = heSoLuong * luongCanBan;

        System.out.println("Lương của nhân viên là: " + luong);
    }
}
