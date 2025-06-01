package bai_tap_1;

import java.util.Scanner;

/**
 * Viết một chương trình Java để nhập vào hai số nguyên a và b từ người dùng.
 * Sau đó, tính và hiển thị tổng, hiệu, tích và thương của hai số đó.
 */
public class ToanCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        System.out.print("Nhâp số b: ");
        int b = sc.nextInt();

        System.out.println("Tổng của 2 số  : " + (a + b));
        System.out.println("Hiệu của 2 số   : " + (a - b));
        System.out.println("Tích của 2 số   : " + (a * b));
        System.out.println("Thương của 2 số  : " + (double) a / b);

    }
}
