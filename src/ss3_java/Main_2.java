package ss3_java;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm sinh của bạn");
        int NAMSINH = sc.nextInt();
        int Tuoi = 2025 - NAMSINH;
        System.out.println("Tuoi cua ban la: " + Tuoi);

    }

}
