package bai_tap_phuong_thuc;

import java.util.Scanner;

/*
Viết chương trình nhập thông tin của n nhân viên trong công ty (n nhập vào từ bàn phím, n <= 5).
 Thông tin cần nhập tương tự ở câu trên. Sau khi nhập xong thì in thông tin đã nhập ra.
Lưu ý: in ra n nhân viên cùng lúc, không phải nhập nhân viên nào in nhân viên đó ra luôn.
 */
public class BaiTap7 {
    // Nhân viên 1
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double mucLuongCoBan;
    static double diemTrungBinh;

    // Nhân viên 2
    static String hoTen1;
    static int tuoi1;
    static String gioiTinh1;
    static double mucLuongCoBan1;
    static double diemTrungBinh1;

    // Nhân viên 3
    static String hoTen2;
    static int tuoi2;
    static String gioiTinh2;
    static double mucLuongCoBan2;
    static double diemTrungBinh2;

    // Nhân viên 4
    static String hoTen3;
    static int tuoi3;
    static String gioiTinh3;
    static double mucLuongCoBan3;
    static double diemTrungBinh3;

    // Nhân viên 5
    static String hoTen4;
    static int tuoi4;
    static String gioiTinh4;
    static double mucLuongCoBan4;
    static double diemTrungBinh4;

    public static void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên 1: ");
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

    public static void nhap1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên 2: ");
        System.out.print("Nhập họ tên: ");
        hoTen1 = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi1 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gioiTinh1 = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        mucLuongCoBan1 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình tốt nghiệp (0 - 10): ");
        while (true) {
            diemTrungBinh1 = sc.nextFloat();
            if (diemTrungBinh1 >= 0 && diemTrungBinh1 <= 10) {
                break;
            } else {
                System.out.print("Điểm không hợp lệ! Nhập lại (0 - 10): ");
            }
        }
    }

    public static void nhap2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên 3: ");
        System.out.print("Nhập họ tên: ");
        hoTen2 = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi2 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gioiTinh2 = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        mucLuongCoBan2 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình tốt nghiệp (0 - 10): ");
        while (true) {
            diemTrungBinh2 = sc.nextFloat();
            if (diemTrungBinh2 >= 0 && diemTrungBinh2 <= 10) {
                break;
            } else {
                System.out.print("Điểm không hợp lệ! Nhập lại (0 - 10): ");
            }
        }
    }

    public static void nhap3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên 4: ");
        System.out.print("Nhập họ tên: ");
        hoTen3 = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi3 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gioiTinh3 = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        mucLuongCoBan3 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình tốt nghiệp (0 - 10): ");
        while (true) {
            diemTrungBinh3 = sc.nextFloat();
            if (diemTrungBinh3 >= 0 && diemTrungBinh3 <= 10) {
                break;
            } else {
                System.out.print("Điểm không hợp lệ! Nhập lại (0 - 10): ");
            }
        }
    }

    public static void nhap4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên 5: ");
        System.out.print("Nhập họ tên: ");
        hoTen4 = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi4 = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gioiTinh4 = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        mucLuongCoBan4 = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình tốt nghiệp (0 - 10): ");
        while (true) {
            diemTrungBinh4 = sc.nextFloat();
            if (diemTrungBinh4 >= 0 && diemTrungBinh4 <= 10) {
                break;
            } else {
                System.out.print("Điểm không hợp lệ! Nhập lại (0 - 10): ");
            }
        }
    }

    public static void xuat() {
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan);
        System.out.println("Điểm trung bình tốt nghiệp đại học: " + diemTrungBinh);
    }

    public static void xuat1() {
        System.out.println("Họ Tên: " + hoTen1);
        System.out.println("Tuổi: " + tuoi1);
        System.out.println("Giới tính: " + gioiTinh1);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan1);
        System.out.println("Điểm trung bình tốt nghiệp đại học: " + diemTrungBinh1);
    }

    public static void xuat2() {
        System.out.println("Họ Tên: " + hoTen2);
        System.out.println("Tuổi: " + tuoi2);
        System.out.println("Giới tính: " + gioiTinh2);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan2);
        System.out.println("Điểm trung bình tốt nghiệp đại học: " + diemTrungBinh2);
    }

    public static void xuat3() {
        System.out.println("Họ Tên: " + hoTen3);
        System.out.println("Tuổi: " + tuoi3);
        System.out.println("Giới tính: " + gioiTinh3);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan3);
        System.out.println("Điểm trung bình tốt nghiệp đại học: " + diemTrungBinh3);
    }

    public static void xuat4() {
        System.out.println("Họ Tên: " + hoTen4);
        System.out.println("Tuổi: " + tuoi4);
        System.out.println("Giới tính: " + gioiTinh4);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan4);
        System.out.println("Điểm trung bình tốt nghiệp đại học: " + diemTrungBinh4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập số lượng nhân viên (1 - 5): ");
            n = sc.nextInt();
            if (n < 1 || n > 5) {
                System.out.println("Chỉ được nhập từ 1 đến 5 nhân viên!");
            }
        } while (n < 1 || n > 5);


        if (n >= 1) nhap();
        if (n >= 2) nhap1();
        if (n >= 3) nhap2();
        if (n >= 4) nhap3();
        if (n == 5) nhap4();


        System.out.println("\n DANH SÁCH NHÂN VIÊN ");
        if (n >= 1) xuat();
        if (n >= 2) xuat1();
        if (n >= 3) xuat2();
        if (n >= 4) xuat3();
        if (n == 5) xuat4();
    }
}

