package bai_tap_vong_lap;

import java.util.Scanner;
/*
Nhập vào 2 số nguyên dương a & b với điều kiện là b > a.
 Hãy thực hiện đếm và tính tổng trong đoạn[a, b] có bao nhiêu số đối xứng, chính phương, nguyên tố
 */
public class BaiTap22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        do {
            System.out.print("Nhập số nguyên dương a: ");
            a = sc.nextInt();
            if (a <= 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (a <= 0);

        int b;
        do {
            System.out.print("Nhập số nguyên dương b (b > a): ");
            b = sc.nextInt();
            if (b <= 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (b <= a);

        int demDoiXung = 0, tongDoiXung = 0;
        int demChinhPhuong = 0, tongChinhPhuong = 0;
        int demNguyenTo = 0, tongNguyenTo = 0;

        for (int i = a; i <= b; i++) {
            if (laSoDoiXung(i)) {
                demDoiXung++;
                tongDoiXung += i;
            }
            if (laSoChinhPhuong(i)) {
                demChinhPhuong++;
                tongChinhPhuong += i;
            }
            if (laSoNguyenTo(i)) {
                demNguyenTo++;
                tongNguyenTo += i;
            }
        }

        System.out.printf("Số đối xứng: " + demDoiXung + " - Tổng: " + tongDoiXung);
        System.out.println("Số chính phương: " + demChinhPhuong + " - Tổng: " + tongChinhPhuong);
        System.out.println("Số nguyên tố: " + demNguyenTo + " - Tổng: " + tongNguyenTo);

    }

    // Hàm kiểm tra số đối xứng
    public static boolean laSoDoiXung(int n) {
        int dao = 0, tam = n;
        while (tam != 0) {
            dao = dao * 10 + tam % 10;
            tam /= 10;
        }
        return dao == n;
    }

    // Hàm kiểm tra số chính phương
    public static boolean laSoChinhPhuong(int n) {
        int can = (int) Math.sqrt(n);
        return can * can == n;
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
