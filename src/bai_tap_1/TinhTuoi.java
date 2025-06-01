package bai_tap_1;

import java.time.Year;
import java.util.Scanner;

/**
 * Nhập năm sinh của một người. Tính tuổi người đó.
 */
public class TinhTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập năm sinh của bạn: ");
        int namSinh = sc.nextInt();

        System.out.println("Tuoi cua ban la: " + (Year.now().getValue() - namSinh));
    }
}
// Ctrl + alt + L : Format Code