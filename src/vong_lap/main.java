package vong_lap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh:  ");
        int canh = sc.nextInt();

        for (int i = 1; i <= canh; i++) { // vòng lặp cha
            // với 1 bước lặp của cha => thực hiện lại toàn bộ bước lớp của con
            for (int j = 1; j <= canh; j++) { // vòng lặp con
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
