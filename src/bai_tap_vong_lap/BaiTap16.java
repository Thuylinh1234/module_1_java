package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * Hình a
 * *
 * **
 * ***
 * ****
 * *****
 * <p>
 * Hình b
 * *****
 * ****
 * ***
 * **
 * *
 * <p>
 * Hình c
 * *
 * **
 * ***
 * ****
 * *****
 * <p>
 * Hình d
 * *****
 * ****
 * ***
 * **
 * *
 * <p>
 * Hình e
 * *****
 * *    *
 * *  *
 * **
 * *
 * <p>
 * Hình f
 * *
 * ***
 * *****
 * *******
 * <p>
 * Hình g
 * *******
 * *****
 * ***
 * *
 */
public class BaiTap16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh:");
        int n = sc.nextInt();

        // hinh a
        System.out.println("Hinh a: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh b
        System.out.println("Hinh b: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh c
        System.out.println("Hinh c: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh d
        System.out.println("Hinh d: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh e
        System.out.println("Hinh e: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                if (i == 1 || j == 1 || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // hinh f
        System.out.println("Hinh f: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh g
        System.out.println("Hinh g: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (n - i) * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
