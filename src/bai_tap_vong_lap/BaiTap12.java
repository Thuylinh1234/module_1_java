package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím
 * <p>
 * (Ví dụ : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
 */
public class BaiTap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập m: ");
        int m = sc.nextInt();

        int s = 0;
        int p = 1;

        while (m > 0) {
            int digit = m % 10;

            s += digit;
            p *= digit;

            m = m / 10;

        }
        System.out.println("Tổng của các chữ số: " + s);
        System.out.println("Tích của các chữ số: " + p);
    }
}
