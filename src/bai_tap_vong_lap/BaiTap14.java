package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định)
 * <p>
 * * * * * * *
 * *            *
 * *            *
 * *            *
 * *            *
 * * * * * * *
 */
public class BaiTap14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh:  ");
        int canh = sc.nextInt();

        for (int i = 1; i <= canh; i++) {
            for (int j = 1; j <= canh; j++) {
                if (i == 1 || i == canh || j == 1 || j == canh){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
