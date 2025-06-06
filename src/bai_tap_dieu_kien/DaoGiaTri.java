package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Nhập vào 2 số nguyên, lưu vào 2 biến a và b.
 * Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
 */
public class DaoGiaTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi đổi giá trị a = " + a);
        System.out.println("Sau khi đổi giá trị b = " + b);
    }
}
