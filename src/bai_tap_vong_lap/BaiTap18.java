package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In hình * sau đây: (chiều dài các cạnh là không cố định) (*)
 *    ******
 *  **      *
 *  *  *    *
 *  *    *  *
 *  *      **
 *   ******
 */
public class BaiTap18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j ++){
                if (i == 1 || j == 1 || i == n || j == n || i == j ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
