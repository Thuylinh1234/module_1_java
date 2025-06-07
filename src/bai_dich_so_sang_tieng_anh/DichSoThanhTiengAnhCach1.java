package bai_dich_so_sang_tieng_anh;

import java.util.Scanner;

/**
 * Nhập vào 1 số tự nhiên từ 1 đến 10, sau đó in ra tiếng Anh của từ đó theo 2 cách:
 * Cách 1: Dùng if else-if.
 *
 */
public class DichSoThanhTiengAnhCach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào 1 số tự nhiên từ 1 đến 10: ");
        int n = sc.nextInt();

        if (n < 1 || n > 10){
            System.out.println("Không hợp lệ");
        }else if (n == 1) {
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else if (n == 6) {
            System.out.println("Six");
        } else if (n == 7) {
            System.out.println("Seven");
        } else if (n == 8) {
            System.out.println("Eight");
        } else if (n == 9) {
            System.out.println("Nine");
        } else if (n == 10) {
            System.out.println("Ten");
        }
    }
}
