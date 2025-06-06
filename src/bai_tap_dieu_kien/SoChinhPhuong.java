package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không?
 * Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên. vd: 0, 1, 4, 9, 16, 25, 36 ...
 */
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 số nguyên dương: ");
        int x = sc.nextInt();

        double chinhPhuong = Math.sqrt(x);
        if (chinhPhuong % 1 == 0) {
            System.out.printf(x + "là số chính phương");
        } else {
            System.out.println(x + "Không phải là số chính phương");
        }


    }
}
