package bai_tap_debug;

import java.util.Scanner;

/*
Cho 2 chuỗi (String) a và b nhập vào từ bàn phím. Hãy so sánh chuỗi nào lớn hơn. (quan trọng)
 */
public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        int result = a.compareTo(b);

        if (result == 0) {
            System.out.println("Hai chuỗi bằng nhau.");
        } else if (result < 0) {
            System.out.println("Chuỗi a nhỏ hơn chuỗi b.");
        } else {
            System.out.println("Chuỗi a lớn hơn chuỗi b.");
        }
    }
}

