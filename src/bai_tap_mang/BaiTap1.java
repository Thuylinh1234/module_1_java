package bai_tap_mang;

import java.util.Scanner;

/*
1. Các thao tác nhập xuất
    a. Nhập mảng
    b. Xuất mảng
2. Các thao tác kiểm tra
    a. Mảng có phải là mảng toàn chẵn?
    b. Mảng có phải là mảng toàn số nguyên tố?
    c. Mảng có phải là mảng tăng dần?
3. Các thao tác tính toán
    a. Đếm số lượng phần tử lẻ có trong mảng a.
    b. Tính tổng số dương lẻ của mảng a.
    c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
    d. Tổng các số nguyên tố có trong mảng.
4. Các thao tác tìm kiếm
    a. Vị trí cuối cùng của phần tử x trong mảng.
    b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
    c. Tìm số dương nhỏ nhất trong mảng.
    d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
    e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
 */
public class BaiTap1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Bạn nhập sai vui lòng nhập lại");
            }
        } while (n <= 0);

        int[] arr = new int[n];

        inputArr(arr);
        outputArr(arr);
        if (isAllEven(arr)) {
            System.out.println("Mảng toàn chẵn");
        } else {
            System.out.println("Mảng không toàn chẵn");
        }

        System.out.println("Tổng các số dương lẻ: " + calculateSumPositiveOdd(arr));

        int x = 2;
        int index = lastIndex(arr,x);
        if (index == -1){
            System.out.println("Không tìm thấy phần tử x trong mảng");
        } else {
            System.out.println("X nằm vị trí index: " + index);
        }

    }

    public static void outputArr(int[] arr) {
        for (int item : arr) { //foreach
            System.out.println(item + "\t");

        }
    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    public static boolean isAllEven(int[] arr) {
        for (int item : arr) {
            if (item % 2 != 0) {
                return false;
            }
        }
        return true;
    }


    public static int calculateSumPositiveOdd(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            if (item > 0 && item % 2 != 0) {
                sum += item;
            }
        }
        return sum;
    }

    public static int lastIndex(int [] arr, int x){
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
