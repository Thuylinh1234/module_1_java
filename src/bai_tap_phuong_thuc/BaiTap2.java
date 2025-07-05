package bai_tap_phuong_thuc;

import java.util.Scanner;

/**
 * Bài tập chương câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện
 *     a.    Trả về số đảo của số đó.
 *     b.    Có phải là số đối xứng (Trả về True/False)
 *     c.    Có phải là số chính phương.
 *     d.    Có phải là số nguyên tố.
 *     e.    Tổng các chữ số lẻ.
 *     f.    Tổng các chữ số nguyên tố.
 *     g.    Tổng các chữ số chính phương.
 */
public class BaiTap2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương n: ");
        int n = sc.nextInt();

        System.out.printf("Giá trị đảo của số: %d\n", n, reversedNumber(n));

    }
    public static int reversedNumber (int n) {
        int a = 0;
        while (n != 0) {
            int digit = n % 10;
            a = a * 10 + digit;
            n /= 10;
        }
        return a;
    }
}
