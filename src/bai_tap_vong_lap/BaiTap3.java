package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In dãy số 2, -4, 6, -8, 10 … n (n là số nhập vào từ bàn phím) (*)
 */
public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
