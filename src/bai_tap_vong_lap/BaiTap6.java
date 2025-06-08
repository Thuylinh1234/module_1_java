package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (n là số nhập vào từ bàn phím)
 */
public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int dem = 0;
        int khoangCach = 1;

        for (int i = 2; i <= n; i += 2) {
            if (dem == khoangCach) {
                System.out.print(-i + " ");
                dem = 0;
                khoangCach++;
            } else {
                System.out.print(i + " ");
                dem++;
            }
        }
    }
}
