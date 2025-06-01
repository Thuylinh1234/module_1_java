package bai_tap_1;

import java.util.Scanner;

/**
 * Nhập vào số xe của bạn (Gồm tối đa 5 chữ số). Cho biết số xe của bạn được mấy nút?
 * <p>
 * Ví dụ: Biển số xe bạn là: 12345 thì số nút là 5, do 1 + 2+ 3 + 4 + 5 = 15
 * nhưng số nút chỉ lấy hàng đơn vị nên sẽ là 5 nút (điểm).
 */
public class TimNut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số xe: ");
        int soXe = sc.nextInt();

        int tong = soXe % 10;
        soXe = soXe / 10;

        tong = tong + soXe % 10;
        soXe = soXe / 10;

        tong = tong + soXe % 10;
        soXe = soXe / 10;

        tong = tong + soXe % 10;
        soXe = soXe / 10;

        tong = tong + soXe;

        int nut = tong % 10;
        System.out.print("Số nút của biển số xe: " + nut);
    }
}
