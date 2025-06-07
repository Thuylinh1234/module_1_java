package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Nhập vào tháng & năm. Hãy cho biết tháng đó trong năm đó có bao nhiêu ngày.
 */
public class XacDinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tháng: ");
        int thang = sc.nextInt();

        System.out.print("Nhập Năm: ");
        int nam = sc.nextInt();

        int thangNam;

        switch (thang) {
            case 4:
            case 6:
            case 9:
            case 11:
                thangNam = 30;
                break;
            case 2:
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                    thangNam = 29; // nhuận
                } else {
                    thangNam = 28; // không nhuận
                }
                break;
            default:
                thangNam = 31;
                break;
        }
        System.out.printf("Số ngày trong tháng %d năm %d là %d ngày ", thang, nam, thangNam);

    }
}
