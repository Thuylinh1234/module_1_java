package bai_tap_mang;

import java.util.Scanner;

/*
Dựa trên chương trình quản lý nhân viên ở bài trước, thực hiện các yêu cầu sau:

    a. Tìm nhân viên có điểm trung bình cao nhất.

    b. Tìm nhân viên theo họ tên (tìm chính xác).

    c. Tìm nhân viên theo họ tên (tìm mềm - Gần chính xác)

      Ví dụ: Khi nhập một phần của họ tên (ví dụ: "Hoàng"),
      hệ thống sẽ xuất ra tất cả các nhân viên có chữ "Hoàng" xuất hiện trong họ tên của họ (ví dụ: "Nguyễn Văn Hoàng", "Hoàng Văn Thái", ...).
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

        System.out.println("\n DANH SÁCH NHÂN VIÊN");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhân viên " + (i + 1) + ":");
            xuatThongTin(i);
        }

        // a. Tìm điểm trung bình cao nhất
        System.out.println("\na. Nhân viên có điểm trung bình cao nhất: ");
        timNhanVienDiemCaoNhat();

        // b. Tìm theo họ tên chính xác
        System.out.print("\nb. Nhập họ tên để tìm chính xác: ");
        String tenChinhXac = sc.nextLine();
        timTheoHoTen(tenChinhXac);

        // c. Tìm gần đúng
        System.out.print("\nc. Nhập từ khóa để tìm gần đúng: ");
        String tuKhoa = sc.nextLine();
        timGanDung(tuKhoa);

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

    // a. Tìm nhân viên có điểm cao nhất
    public static void timNhanVienDiemCaoNhat() {
        double max = diemTrungBinh[0];
        for (int i = 1; i < soLuongNhanVien; i++) {
            if (diemTrungBinh[i] > max) {
                max = diemTrungBinh[i];
            }
        }

        for (int i = 0; i < soLuongNhanVien; i++) {
            if (diemTrungBinh[i] == max) {
                xuatThongTin(i);
            }
        }
    }

    // b. Tìm theo họ tên (chính xác)
    public static void timTheoHoTen(String ten) {
        boolean timThay = false;
        for (int i = 0; i < soLuongNhanVien; i++) {
            if (hoTen[i].equalsIgnoreCase(ten)) {
                xuatThongTin(i);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy nhân viên tên \"" + ten + "\"");
        }
    }

    // c. Tìm theo tên gần đúng
    public static void timGanDung(String tuKhoa) {
        boolean timThay = false;
        for (int i = 0; i < soLuongNhanVien; i++) {
            if (hoTen[i].toLowerCase().contains(tuKhoa.toLowerCase())) {
                xuatThongTin(i);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không có ai chứa từ khóa \"" + tuKhoa + "\" trong họ tên.");
        }
    }
}

