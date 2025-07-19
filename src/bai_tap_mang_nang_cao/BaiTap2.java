package bai_tap_mang_nang_cao;

import java.util.Arrays;
import java.util.Scanner;

/*
Các thao tác thêm/xóa/sửa
    a.    Sửa các số nguyên tố có trong mảng thành số 0
    b.    Chèn số 0 đằng sau các số nguyên tố trong mảng
    c.    Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
    d.    Xóa tất cả số nguyên tố có trong mảng
    e.    Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).
 */
public class BaiTap2 {
    static Scanner sc = new Scanner(System.in);

    public static void nhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử mảng arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // a. Sửa các số nguyên tố có trong mảng thành số 0
    public static boolean soNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i + i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void suaSoNguyenTo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i])) {
                arr[i] = 0;
            }
        }
    }

    //b.Chèn số 0 đằng sau các số nguyên tố trong mảng
    public static int[] chenSo0VaoDangSauSNT(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i])) {
                arr = add(arr, i + 1, 0);
                i++;
            }
        }
        return arr;
    }

    public static int[] add(int[] arr, int index, int value) {
        int[] brr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

        brr[index] = value;

        for (int i = index; i < arr.length; i++) {
            brr[i + 1] = arr[i];
        }

        return brr;
    }

    // c. Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
    public static int[] xoa(int[] arr, int index) {
        int[] brr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

        for (int i = index; i < brr.length; i++) {
            brr[i] = arr[i + 1];
        }

        return brr;
    }

    public static int[] xoaPhanTu(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                arr = xoa(arr, i);
                i--;
            }
        }
        return arr;
    }

    //d. Xóa tất cả số nguyên tố có trong mảng
    public static int[] xoaSoNguyenTo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i])) {
                arr = xoa(arr, i);
                i--;
            }
        }
        return arr;
    }

    //e. Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).
    public static int[] chenPhanTu(int[] arr, int index, int x) {
        arr = add(arr, index, x);
        arr = xoa(arr, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (n <= 0);
        int arr[] = new int[n];
        nhapMang(arr);
        System.out.println("Các phần tử trong mảng: ");
        xuatMang(arr);

        arr = chenSo0VaoDangSauSNT(arr);
        System.out.println("\nb.Chèn số 0 đằng sau các số nguyên tố trong mảng: " + Arrays.toString(arr));

        suaSoNguyenTo(arr);
        System.out.println("\na. Sửa các số nguyên tố có trong mảng thành số 0: " + Arrays.toString(arr));

        System.out.print("\nc. Nhập giá trị k cần xóa khỏi mảng: ");
        int k = sc.nextInt();
        arr = xoaPhanTu(arr, k);
        System.out.println("Mảng sau khi xóa các phần tử có giá trị " + k + ": " + Arrays.toString(arr));

        arr = xoaSoNguyenTo(arr);
        System.out.println("d. Mảng sau khi xóa tất cả số nguyên tố: " + Arrays.toString(arr));

        int viTriChen;
        do {
            System.out.print("e. Nhập vị trí cần chèn (0 đến " + (arr.length - 1) + "): ");
            viTriChen = sc.nextInt();
        } while (viTriChen < 0 || viTriChen >= arr.length);

        System.out.print("Nhập giá trị cần chèn vào vị trí " + viTriChen + ": ");
        int x = sc.nextInt();

        arr = chenPhanTu(arr, viTriChen, x);
        System.out.println("Mảng sau khi chèn " + x + " vào vị trí " + viTriChen + " và xóa phần tử cuối: " + Arrays.toString(arr));

    }
}
