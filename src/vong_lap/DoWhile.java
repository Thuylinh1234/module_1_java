package vong_lap;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("Nhập vào số nguyên dương: ");
            a = sc.nextInt();
            if (a < 0) {
                System.out.println("Bạn nhập sai vui long nhap lai");
            }
        } while (a < 0);
            System.out.println("a+ " + a);

        }
    }

