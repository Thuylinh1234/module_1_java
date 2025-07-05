package bai_tap_phuong_thuc;

import java.util.Scanner;

/**
 * Bài tập chương câu lệnh điều kiện và rẽ nhánh
 *     a.    Viết phương thức đổi một ký tự hoa sang ký tự thường.
 *     b.    Viết phương thức giải phương trình bậc nhất.
 *     c.    Viết phương thức giải phương trình bậc hai.
 *     d.    Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên.
 */
public class BaiTap1 {

//--------------Cau a -------------------------//
    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }
//-------------Cau b --------------------------//
    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.printf("Nghiệm của phương trình là x = %.2f\n", x);
        }
    }
//--------------Cau c --------------------------//
public static void levelTwo(double a, double b, double c) {
    if (a == 0) {
        levelOne(b, c);
    } else {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
//---------------Cau d ---------------------------//
public static int min(int a, int b, int c, int d) {
    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;
    if (d < min) min = d;
    return min;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//-------------Câu a----------------------------------------//
        System.out.print("Nhập 1 ký tự: ");
        char c = sc.next().charAt(0);
        System.out.println("Ký tự thường: " + toLowerCase(c));

//---------------Cau b----------------------------------------------------//
        System.out.println("Phương trình bậc nhất ax + b = 0 ");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        levelOne(a, b);

//--------------- Cau c -----------------------------------------------//
        System.out.println("Giải phương trình bậc hai ax^2 + bx + c = 0 ");
        System.out.print("Nhập a: ");
        double a1 = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b1 = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c1 = sc.nextDouble();
        levelTwo(a1, b1, c1);

//--------------- Cau c -----------------------------------------------//
        System.out.println("Nhập 4 số nguyên để tìm số nhỏ nhất: ");
        System.out.print("Số 1: ");
        int n = sc.nextInt();
        System.out.print("Số 2: ");
        int n1 = sc.nextInt();
        System.out.print("Số 3: ");
        int n2 = sc.nextInt();
        System.out.print("Số 4: ");
        int n3 = sc.nextInt();
        System.out.println("Giá trị nhỏ nhất là: " + min(n, n1, n2, n3));
    }
}
