package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Nhập vào thông tin 1 ngày (ngày - tháng - năm).
 * Kiểm tra ngày có hợp lệ hay không ? Nếu hợp lệ hãy tìm ra ngày kế tiếp (ngày - tháng - năm) & ngày trước đó (ngày - tháng - năm).
 */
public class KiemTraTimNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int ngay = sc.nextInt();
        System.out.print("Nhập tháng: ");
        int thang = sc.nextInt();
        System.out.print("Nhập năm: ");
        int nam = sc.nextInt();

        if (!laNgayHopLe(ngay, thang, nam)) {
            System.out.println("Ngày không hợp lệ");
            return;
        } else {
            System.out.println("Ngày hợp lệ");
        }

        int ngayMoi = ngay + 1;
        int thangMoi = thang;
        int namMoi = nam;

        int soNgayTrongThang = soNgay(thang, nam);
        if (ngayMoi > soNgayTrongThang) {
            ngayMoi = 1;
            thangMoi++;
            if (thangMoi > 12) {
                thangMoi = 1;
                namMoi++;
            }
        }
        System.out.printf("Ngày kế tiếp: %d-%d-%d\n", ngayMoi, thangMoi, namMoi);


        int ngayTruoc = ngay - 1;
        int thangTruoc = thang;
        int namTruoc = nam;

        if (ngayTruoc < 1) {
            thangTruoc--;
            if (thangTruoc < 1) {
                thangTruoc = 12;
                namTruoc--;
            }
            ngayTruoc = soNgay(thangTruoc, namTruoc);
        }

        System.out.printf("Ngày trước đó: %d-%d-%d\n", ngayTruoc, thangTruoc, namTruoc);
    }

    public static int soNgay(int thang, int nam) {
        if (thang == 2) {
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        }
        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            return 30;
        }
        return 31;
    }

    public static boolean laNgayHopLe(int ngay, int thang, int nam) {
        if (thang < 1 || thang > 12) return false;
        if (ngay < 1 || ngay > soNgay(thang, nam)) return false;
        return nam > 0;
    }
}

