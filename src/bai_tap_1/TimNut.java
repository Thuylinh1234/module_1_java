package bai_tap_1;

import java.util.Scanner;
//Bước 1: Nhập số xe từ bàn phím.
//
//Bước 2: Tính tổng các chữ số của số xe.
//
//Bước 3: Tính số nút bằng cách lấy chữ số hàng đơn vị của tổng các chữ số (tổng % 10).
//
//Bước 4: In ra số nút của biển số xe.
public class TimNut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số xe: ");
        int SoXe = sc.nextInt();
        int tong = SoXe % 10;
        SoXe = SoXe / 10;
        tong = tong + SoXe % 10;
        SoXe = SoXe / 10;
        tong = tong + SoXe % 10;
        SoXe = SoXe / 10;
        tong = tong + SoXe % 10;
        SoXe = SoXe / 10;
        tong = tong + SoXe;

        int Nut = tong % 10;
        System.out.print("Số nút của biển số xe: "+ Nut);
    }
}
