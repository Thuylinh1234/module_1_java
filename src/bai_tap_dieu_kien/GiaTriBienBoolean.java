package bai_tap_dieu_kien;

/**
 * Tính giá trị của biến c và biến d:
 */
public class GiaTriBienBoolean {
    public static void main(String[] args) {

        boolean a = true && false;
        boolean b = (3 > 100) || (25 % 5 == 0);
        boolean c = a && b;
        boolean d = !a || b;

        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }
}
// Boolean có thể chứa null còn boolean ko thể chứa null