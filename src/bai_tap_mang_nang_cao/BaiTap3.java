package bai_tap_mang_nang_cao;

import java.util.Scanner;

/*
Sử dụng các mảng 1 chiều để bổ sung xử lý bài nhập thông tin cho n nhân viên ở bài trước.
    Sắp xếp nhân viên theo độ tuổi tăng dần. (*)
 */
public class BaiTap3 {
    static String[] hoTen = new String[5];
    static int[] tuoi = new int[5];
    static String[] gioiTinh = new String[5];
    static double[] mucLuong = new double[5];
    static double[] diemTrungBinh = new double[5];
    static int soLuongNhanVien = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            if (soLuongNhanVien >= 5) {
                System.out.println("Đã đủ %d nhân viên, không thể nhập thêm.");
                break;
            }
            nhapThongTin(soLuongNhanVien, sc);
            soLuongNhanVien++;
            System.out.print("Nhập Yes để tiếp tục, No để dừng lại: ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));

        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("\nThông tin nhân viên thứ " + (i + 1) + ":");
            xuatThongTin(i);
        }

        System.out.println("\n Danh sách nhân viên sau khi sắp xếp tăng dần theo tuổi: ");
        sapXepTangDan();
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhân viên " + (i + 1) + ":");
            xuatThongTin(i);
        }
    }

    public static void sapXepTangDan(){
        for (int i = 0; i < soLuongNhanVien - 1; i++) {
            for (int j = i + 1; j < soLuongNhanVien; j++) {
                if (tuoi[i] > tuoi[j]) {

                    int tamTuoi = tuoi[i];
                    tuoi[i] = tuoi[j];
                    tuoi[j] = tamTuoi;

                    String tamHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tamHoTen;

                    String tamGioiTinh = gioiTinh[i];
                    gioiTinh[i] = gioiTinh[j];
                    gioiTinh[j] = tamGioiTinh;

                    double tamMucLuong = mucLuong[i];
                    mucLuong[i] = mucLuong[j];
                    mucLuong[j] = tamMucLuong;

                    double tamDiemTrungBinh = diemTrungBinh[i];
                    diemTrungBinh[i] = diemTrungBinh[j];
                    diemTrungBinh[j] = tamDiemTrungBinh;
                }
            }
        }
    }
    public static void nhapThongTin(int index, Scanner sc) {
        System.out.print("Nhập họ tên: ");
        hoTen[index] = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi[index] = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gioiTinh[index] = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        mucLuong[index] = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình tốt nghiệp (0 - 10): ");
        while (true) {
            try {
                diemTrungBinh[index] = Double.parseDouble(sc.nextLine());
                if (diemTrungBinh[index] >= 0 && diemTrungBinh[index] <= 10) {
                    break;
                } else {
                    System.out.print("Điểm không hợp lệ! Nhập lại (0 - 10): ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Sai định dạng! Nhập lại: ");
            }
        }
    }

    public static void xuatThongTin(int index) {
        System.out.println("Họ tên: " + hoTen[index]);
        System.out.println("Tuổi: " + tuoi[index]);
        System.out.println("Giới tính: " + gioiTinh[index]);
        System.out.println("Lương cơ bản: " + mucLuong[index]);
        System.out.println("Điểm trung bình tốt nghiệp: " + diemTrungBinh[index]);
    }
}
