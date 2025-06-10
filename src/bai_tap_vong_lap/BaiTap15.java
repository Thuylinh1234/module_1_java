package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * Hình a
 * * * * * * *
 * *
 * *
 * *
 * *
 * * * * * * *
 * <p>
 * Hình b
 * * * * * * *
 * *
 * *
 * *
 * *
 * * * * * * *
 * <p>
 * Hình c
 * *            *
 * *            *
 * *            *
 * *            *
 * *            *
 * * * * * * *.
 */
public class BaiTap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh:");
        int canh = sc.nextInt();

        System.out.println("Hình a: ");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || j == 1 || i == canh) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình b");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || j == canh || i == canh) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình c");
        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == canh || j == 1 || j == canh) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}



