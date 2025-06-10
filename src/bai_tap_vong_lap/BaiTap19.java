package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * Viết chương nhập vào một số nguyên dương n. Sau đó quy đổi n ra hệ nhị phân.
 */
public class BaiTap19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập một số nguyên dương: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (n <= 0);

        String nhiPhan = "";

        int so = n;
        while (so > 0) {
            nhiPhan = (so % 2) + nhiPhan;
            so = so / 2;
        }

        System.out.println("Hệ nhị phân của " + n + " là: " + nhiPhan);
    }
}
