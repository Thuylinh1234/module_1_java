package bai_tap_phuong_thuc;

import java.util.Scanner;

/*
Viết chương trình nhập thông tin của một nhân viên trong công ty. Thông tin cần nhập vào bao gồm: họ tên, tuổi, giới tính,
 mức lương cơ bản, điểm trung bình tốt nghiệp đại học (theo thang điểm 10).
Sau khi nhập xong thì in thông tin đã nhập ra.
 */
public class BaiTap6 {
    static  String hoTen;
    static  int tuoi;
    static  String gioiTinh;
    static double mucLuongCoBan;
    static  double diemTrungBinh;

    public static void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên: ");
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        mucLuongCoBan = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình tốt nghiệp (0 - 10): ");
        while (true) {
            diemTrungBinh = sc.nextFloat();
            if (diemTrungBinh >= 0 && diemTrungBinh <= 10) {
                break;
            } else {
                System.out.print("Điểm không hợp lệ! Nhập lại (0 - 10): ");
            }
        }
    }

    public  static void xuat(){
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan);
        System.out.println("Điểm trung bình tốt nghiệp đại học: " + diemTrungBinh);
    }

    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
