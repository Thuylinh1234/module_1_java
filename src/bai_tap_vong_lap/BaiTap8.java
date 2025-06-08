package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In dãy số 1, 3, 7, 15, 31, …n (n là số nhập vào từ bàn phím)
 */
public class BaiTap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int a = 1;

        while (a <= n) {
            System.out.print(a + " ");

            a = 2 * a + 1;
        }
    }
}
