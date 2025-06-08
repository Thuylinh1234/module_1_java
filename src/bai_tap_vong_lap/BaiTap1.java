package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 */
public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i + "\t");
        }
    }
}
