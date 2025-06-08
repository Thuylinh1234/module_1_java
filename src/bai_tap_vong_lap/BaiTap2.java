package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
 */
public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
    }
}