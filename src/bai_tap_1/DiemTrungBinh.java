package bai_tap_1;

import java.util.Scanner;

/**
 * Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa của một học sinh. Tính điểm trung bình của học sinh đó.
 */
public class DiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm thi Toán: ");
        Double diemToan = sc.nextDouble();

        System.out.print("Nhập điểm thi Lý: ");
        Double diemLy = sc.nextDouble();

        System.out.print("Nhập điểm thi Hóa: ");
        Double diemHoa = sc.nextDouble();

        System.out.print("Nhập hệ số Toán: ");
        Double heSoToan = sc.nextDouble();

        System.out.print("Nhập hệ số Lý: ");
        Double heSoLy = sc.nextDouble();

        System.out.print("Nhập hệ số Hoa: ");
        Double heSoHoa = sc.nextDouble();

        Double dtb = (diemToan * heSoToan + diemLy * heSoLy + diemHoa * heSoHoa) / (heSoHoa + heSoLy + heSoToan);
        System.out.println("Điểm trung bình học sinh: " + dtb);
    }
}
