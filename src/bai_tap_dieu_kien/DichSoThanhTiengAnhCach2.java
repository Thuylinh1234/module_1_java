package bai_tap_dieu_kien;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

/**
 * Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
 * Cách 2: Dùng switch case.
 */
public class DichSoThanhTiengAnhCach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số tự nhiên từ 1 đến 10: ");
        int n = sc.nextInt();

        switch (n) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
            default -> System.out.println("Số không hợp lệ");
        }
    }
}
