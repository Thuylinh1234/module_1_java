package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In các hình * sau đây: (chiều dài các cạnh là không cố định)
 *
 * Hình a
 * ******
 *  *
 *    *
 *      *
 *        *
 * ******
 *
 * Hình b
 * ******
 *        *
 *      *
 *    *
 *  *
 * ******
 */
public class BaiTap17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập canh: ");
        int n = sc.nextInt();

        System.out.println("Hinh a: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hinh b: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
