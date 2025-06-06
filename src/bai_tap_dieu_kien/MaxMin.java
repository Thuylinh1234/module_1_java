package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên a, b. In ra màn hình kết quả số lớn nhất, nhỏ nhất.
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int max = a > b ? a : b;

        int min = a < b ? a : b;

        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số bé nhất là " + min);

    }
}
