package bai_tap_vong_lap;

import java.util.Scanner;

/**
 * Viết chương trình tính:
 *
 * S = 1+1/3!+1/5!+…..+1/(2n-1)!
 *
 * Số n được nhập từ bàn phím
 */
public class BaiTap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        double S = 0.0;
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            S += 1.0 / fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.println("Kết quả của S = "+ S);
    }
}
