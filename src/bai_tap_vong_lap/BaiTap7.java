package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 5, 8, 13, …n (n là số nhập vào từ bàn phím) (*).
 * <p>
 * Fibonacci là một chuỗi các số bắt đầu từ 0, 1 với quy luật số phía sau là tổng của 2 số đứng liền trước.
 */
public class BaiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n) {
            System.out.print(fn + " ");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}
