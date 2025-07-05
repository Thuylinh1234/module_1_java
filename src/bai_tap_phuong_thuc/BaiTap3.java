package bai_tap_phuong_thuc;

import java.util.Scanner;

/*
Bài tập chương Câu lệnh lặp. Phương thức nhận vào một số nguyên dương n và thực hiện:
a.    S = 1 + 2 + … + n
b.    S = 1^2 + 2^2 + … + n^2
c.    S = 1 + 1/2 + … + 1/n
d.    S = 1 * 2 * … * n
e.    S = 1! + 2! + … + n!
 */
public class BaiTap3 {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static double sum1(double n) {
        double sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 = sum1 + (i * i);
        }
        return sum1;
    }

    public static double sum2(double n) {
        double sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum2 = sum2 + (1.0 / i);
        }
        return sum2;
    }

    public static long sum3(long n) {
        long sum3 = 1;
        for (int i = 1; i <= n; i++) {
            sum3 *= i;
        }
        return sum3;
    }

    public static long sum4(long n) {
        long sum4 = 0;
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
            sum4 = sum4 + f;
        }
        return sum4;
    }
  public  static  int inputPositive(String target){
      Scanner sc = new Scanner(System.in);
      int n;
      do {
          System.out.printf("Nhập vào số nguyên dương: %s: ", target);
          n = sc.nextInt();
          if (n < 0){
              System.out.printf("%s không phải là số nguyên dương, xin vui lòng nhập lại! \n ", target);
          }
      } while (n <= 0);
      return  n;
  }
    public static void main(String[] args) {

        int n = inputPositive("n");
        System.out.println("n = "+ n);

        System.out.printf(" S = 1 + 2 + … + %d = %d\n", n, sum(n));
        System.out.printf(" S = 1^2 + 2^2 + … + %d^2 = %.2f\n", n, sum1(n));
        System.out.printf(" S = 1 + 1/2 + … + 1/%d = %.2f\n", n, sum2(n));
        System.out.printf(" S = 1 * 2 * … * %d = %d\n", n, sum3(n));
        System.out.printf("  S = 1! + 2! + … + %d! = %d\n", n, sum4(n));

    }
}
