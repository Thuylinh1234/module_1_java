package bai_tap_vong_lap;

/**
 * Tìm và in lên màn hình tất cả các số nguyên trong phạm vi từ 10 đến 99
 * sao cho tích của 2 chữ số bằng 2 lần tổng của 2 chữ số đó. Ví dụ: Số 44
 */
public class BaiTap23 {
    public static void main(String[] args) {
        System.out.println("Các số từ 10 đến 99 thỏa điều kiện tích = 2 × tổng:");

        for (int i = 10; i <= 99; i++) {

            int hangChuc = i / 10;
            int hangDonVi = i % 10;

            int tong = hangChuc + hangDonVi;
            int tich = hangChuc * hangDonVi;

            if (tich == 2 * tong) {
                System.out.println(i);
            }
        }
    }
}
