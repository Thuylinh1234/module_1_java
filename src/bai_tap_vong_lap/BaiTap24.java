package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * Hệ thống tiền Việt Nam có các mệnh giá sau:
 * 1000đ
 * 2000đ
 * 5000đ
 * 10000đ
 * 20000đ
 * 50000đ
 * 100000đ
 * 200000đ
 * 500000đ
 * Người mua hàng phải trả tiền cho sản phẩm mà họ đã mua. Hãy nhập vào giá tiền của món đồ và tiền khách hàng  trả,
 * viết chương trình hỗ trợ nhân viên cửa hàng thối tiền lại cho khách hàng sao cho số tờ tiền phải thối lại là ít nhất.
 */
public class BaiTap24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập giá món đồ (VNĐ): ");
        int giaMonDo = sc.nextInt();
        System.out.print("Nhập số tiền khách trả (VNĐ): ");
        int tienKhachTra = sc.nextInt();

        int tienThoiLai = tienKhachTra - giaMonDo;

        if (tienThoiLai < 0) {
            System.out.println("Khách trả chưa đủ tiền!");
            return;
        }

        System.out.println("Tiền cần thối lại: " + tienThoiLai + " VNĐ");

        int[] menhGia = {500000, 200000, 100000, 50000, 20000, 10000, 5000, 2000, 1000};

        for (int tien : menhGia) {
            if (tienThoiLai >= tien) {
                int soTo = tienThoiLai / tien;
                System.out.printf("%d tờ %dđ\n", soTo, tien);
                tienThoiLai %= tien;
            }
        }

        if (tienThoiLai > 0) {
            System.out.println("Số tiền không thối được do không có mệnh giá phù hợp: " + tienThoiLai + " VNĐ");
        } else {
            System.out.println("Đã thối đủ tiền cho khách");
        }
    }
}

