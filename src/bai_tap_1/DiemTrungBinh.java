package bai_tap_1;

import java.util.Scanner;

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
        Double hesoToan = sc.nextDouble();
        System.out.print("Nhập hệ số Lý: ");
        Double hesoLy = sc.nextDouble();
        System.out.print("Nhập hệ số Hoa: ");
        Double hesoHoa = sc.nextDouble();

        Double DTB = (diemToan * hesoToan + diemLy *hesoLy + diemHoa * hesoHoa) / (hesoHoa + hesoLy + hesoToan);
        System.out.println("Điểm trung bình học sinh: " + DTB);
    }
}
