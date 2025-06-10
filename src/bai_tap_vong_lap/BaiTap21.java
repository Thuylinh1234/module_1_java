package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
 * a. Có phải là số đối xứng? Ví dụ: 121, 12021, …
 * b. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13, …
 * c. Các chữ số có tăng dần không? Ví dụ: 2345, 367, 59, 123, …
 */
public class BaiTap21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đối xứng
        int n;
        do {
            System.out.print("Nhập một số nguyên dương: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (n <= 0);

        String N = Integer.toString(n);

        boolean DoiXung = true;
        for (int i = 0; i < N.length() / 2; i++) {
            if (N.charAt(i) != N.charAt(N.length() - 1 - i)) {
                DoiXung = false;
                break;

            }
        }
        if (DoiXung) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }

        // số nguyên tố

        int m;
        do {
            System.out.print("Nhập một số nguyên dương: ");
            m = sc.nextInt();
            if (m < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (m <= 0);

        boolean soNguyenTo = true;

        if (m < 2){
            soNguyenTo = false;
        }

        for (int i = 2; i < m; i++){
            if (m % i == 0){
                soNguyenTo = false;
                break;
            }
        }

        if (soNguyenTo){
            System.out.println(m + " là số nguyên tố");
        } else {
            System.out.println(m + " không phải là số nguyên tố");
        }

    //    Chữ số tăng dần

        int a;
        do {
            System.out.print("Nhập một số nguyên dương: ");
            a = sc.nextInt();
            if (a < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (a <= 0);

        String b = Integer.toString(a);

        boolean c = true;

        for (int i = 0; i < b.length() - 1; i++){
            if (b.charAt(i) >= b.charAt(i+1)){
                c = false;
                break;
            }
        }

        if (c){
            System.out.print(a + " chứa các chữ số tăng dần");
        } else {
            System.out.println(a + " không chứa các chữ số tăng dần");
        }
        }
    }
