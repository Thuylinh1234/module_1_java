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



    public static int reversedNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    /* ---------------------------------------------------------- */
    public static boolean isSymmetricalNumber(int n) {
        return n == reversedNumber(n);
    }

    /* ---------------------------------------------------------- */
    public static boolean isSquareNumber(int n) {
        int square = (int) Math.sqrt(n);
        return square * square == n;
    }

    /* ---------------------------------------------------------- */
    public static boolean isPrimeNumber(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /* ---------------------------------------------------------- */
    public static int calculateTotalOddDigits(int n) {
        int tong = 0;
        while (n > 0) {
            int soCuoi = n % 10;
            if (soCuoi % 2 != 0) {
                tong += soCuoi;
            }
            n /= 10;
        }
        return tong;
    }

    /* ---------------------------------------------------------- */
    public static int calculateTotalPrimeDigits(int n) {
        int tong = 0;
        while (n > 0) {
            int soCuoi = n % 10;
            if (isPrimeNumber(soCuoi)) {
                tong += soCuoi;
            }
            n /= 10;
        }
        return tong;
    }

    /* ---------------------------------------------------------- */
    public static int calculateTotalSquareDigits(int n) {
        int tong = 0;
        while (n > 0) {
            int soCuoi = n % 10;
            if (soCuoi == 0 || soCuoi == 1 || soCuoi == 4 || soCuoi == 9) {
                tong += soCuoi;
            }
            n /= 10;
        }
        return tong;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (n <= 0);

        System.out.printf("Số đảo của %d: %d\n", n, reversedNumber(n));

        if (isSymmetricalNumber(n)) {
            System.out.printf("%d là số đối xứng\n", n);
        } else {
            System.out.printf("%d không phải là số đối xứng\n", n);
        }

        if (isSquareNumber(n)) {
            System.out.printf("%d là số chính phương\n", n);
        } else {
            System.out.printf("%d không phải là số chính phương\n", n);
        }

        if (isPrimeNumber(n)) {
            System.out.printf("%d là số nguyên tố\n", n);
        } else {
            System.out.printf("%d không phải là số nguyên tố\n", n);
        }

        System.out.printf("Tổng các chữ số lẻ của %d là: %d\n", n, calculateTotalOddDigits(n));
        System.out.printf("Tổng các chữ số nguyên tố của %d là: %d\n", n, calculateTotalPrimeDigits(n));
        System.out.printf("Tổng các chữ số chính phương của %d là: %d\n", n, calculateTotalSquareDigits(n));
    }
}



