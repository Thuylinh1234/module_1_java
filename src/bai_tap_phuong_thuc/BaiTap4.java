package bai_tap_phuong_thuc;

import java.util.Scanner;

/*
Phương thức trả về USCLN của 2 số nguyên.
 */
public class BaiTap4 {

    public  static int UCLN(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            return min;
        }

        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;

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

        int a = inputPositive("a");
        int b = inputPositive("b");

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        System.out.printf("Ước chung của 2 số %d và %d là: %d", a,b, UCLN(a,b));
    }
}
