package bai_tap_mang_nang_cao;

import java.util.Arrays;
import java.util.Scanner;

/*
Các thao tác xử lý
    a. Tách các số nguyên tố có trong mảng a đưa vào mảng b.
    b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
    c. Sắp xếp mảng giảm dần
    d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.
    e. Đảo thứ tự các phần tử của mảng a.
    f. Kiểm tra xem mảng a có phải là mảng đối xứng hay không.
        Vd: Mảng sau là mảng đối xứng {1, 2, 4, 7, 3, 7, 4, 2, 1}
    g. Đếm số cặp số đối xứng trong mảng.
        Vd: Mảng sau {1, 2, 8, 7, 3, 7, 4, 2, 1} có 3 cặp số đối xứng
 */
public class BaiTap1 {
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

    //    a. Tách các số nguyên tố có trong mảng a đưa vào mảng b
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

    public static int[] tachNguyenTo(int[] arr) {
        int soLuongSoNguyenTo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i])) {
                soLuongSoNguyenTo++;
            }
        }
        int brr[] = new int[soLuongSoNguyenTo];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i])) {
                brr[index] = arr[i];
                index++;
            }
        }
        return brr;
    }

    //  b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
    public static int[] tachSoDuong(int[] arr) {
        int soLuongSoDuong = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                soLuongSoDuong++;
            }
        }
        int brr[] = new int[soLuongSoDuong];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                brr[index] = arr[i];
                index++;
            }
        }
        return brr;
    }

    public static int[] tachSoAm(int[] arr) {
        int soLuongSoAm = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                soLuongSoAm++;
            }
        }
        int brr[] = new int[soLuongSoAm];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                brr[index] = arr[i];
                index++;
            }
        }
        return brr;
    }

    //     c. Sắp xếp mảng giảm dần
    public static void sapXepGiam(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.
    public static void sapXepTang(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] sapXep(int[] arr) {
        int[] mangDuong = tachSoDuong(arr);
        int[] mangAm = tachSoAm(arr);
        sapXepTang(mangAm);
        sapXepGiam(mangDuong);
        int[] noiMang = new int[arr.length];
        for (int i = 0; i < mangDuong.length; i++) {
            noiMang[i] = mangDuong[i];
        }
        for (int i = 0; i < mangAm.length; i++) {
            noiMang[i + mangDuong.length] = mangAm[i];
        }
        return noiMang;
    }

    //  e. Đảo thứ tự các phần tử của mảng a.
    public static void daoThuTu(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //f. Kiểm tra xem mảng a có phải là mảng đối xứng hay không.
    public static boolean mangDoiXung(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        return true;
    }

    // g. Đếm số cặp số đối xứng trong mảng.
    public static int demSoDoiXung(int[] arr) {
        int dem = 0;
        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[arr.length - 1 - i]) {
                dem++;
            }
        return dem;
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

        System.out.println("\n a. Tách các số nguyên tố có trong mảng a đưa vào mảng b: ");
        int[] brr = tachNguyenTo(arr);
        xuatMang(brr);

        System.out.println("\n b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)");
        System.out.printf("Mảng chứa số dương trong mảng a: " + Arrays.toString(tachSoDuong(arr)));
        System.out.printf("\nMảng chứa số âm trong mảng a: " + Arrays.toString(tachSoAm(arr)));

        System.out.println("\n c. Sắp xếp mảng giảm dần");
        sapXepGiam(arr);
        System.out.printf("Mảng sau khi được sắp xếp giảm dần: " + Arrays.toString(arr));

        System.out.println("\n d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, " +
                "cuối cùng là các số 0.");
        System.out.printf("Mảng sau khi được sắp xếp theo đề là: " + Arrays.toString(sapXep(arr)));

        System.out.println("\n e. Đảo thứ tự các phần tử của mảng a.");
        daoThuTu(arr);
        System.out.printf("Mảng sau đi đảo là: " + Arrays.toString(arr));

        System.out.println("f. Kiểm tra xem mảng a có phải là mảng đối xứng hay không.");
        if (mangDoiXung(arr)) {
            System.out.println("Mảng đối xứng");
        } else {
            System.out.println("Mảng không đối xứng");
        }

        System.out.printf("g. Đếm số cặp số đối xứng trong mảng." + demSoDoiXung(arr));

    }

}
