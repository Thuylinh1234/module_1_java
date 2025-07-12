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
public class BaiTap1_1 {
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

        if (toanNguyenTo(arr)) {
            System.out.println("Mảng toàn số nguyên tố");
        } else {
            System.out.println("Mảng không toàn số nguyên tố");
        }

        if (isAscending(arr)) {
            System.out.println("Mảng tăng dần");
        } else {
            System.out.println("Mảng không tăng dần");
        }

        System.out.println(" a. Đếm số lượng phần tử lẻ có trong mảng a: " + countOddElements(arr));
        System.out.println(" b. Tính tổng số dương lẻ của mảng a: " + sumPositiveOdd(arr));
        System.out.println(" c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5: " + countDivisibleBy4NotBy5(arr));
        System.out.println("d. Tổng các số nguyên tố có trong mảng: " + sumPrimes(arr));


        int x = 2;
        int index = lastIndexOf(arr, x);
        if (index == -1) {
            System.out.println("Không tìm thấy phần tử x trong mảng");
        } else {
            System.out.println("X nằm vị trí index: " + index);
        }

        Integer minPos = findMinPositive(arr);
        if (minPos == null) {
            System.out.println("Không có số dương nào trong mảng.");
        } else {
            System.out.println("Số dương nhỏ nhất trong mảng là: " + minPos);
        }

        System.out.print("Nhập phần tử k cần tìm: ");
        int k = sc.nextInt();
        findElementInArray(arr, k);

        System.out.println("Giá trị lớn nhất trong mảng: " + findMax(arr));
        System.out.println("Giá trị nhỏ nhất trong mảng: " + findMin(arr));


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

    //  2a. Mảng có phải là mảng toàn chẵn?
    public static boolean isAllEven(int[] arr) {
        for (int item : arr) {
            if (item % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // 2b. Mảng có phải là mảng toàn số nguyên tố?
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

    public static boolean toanNguyenTo(int[] arr) {
        for (int item : arr) {
            if (!soNguyenTo(item)) return false;
        }
        return true;
    }

    //   2c. Mảng có phải là mảng tăng dần?
    public static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //   3a. Đếm số lượng phần tử lẻ có trong mảng a.
    public static int countOddElements(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // 3b. Tính tổng số dương lẻ của mảng a.
    public static int sumPositiveOdd(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            if (value > 0 && value % 2 != 0) sum += value;
        }
        return sum;
    }

    // 3c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
    public static int countDivisibleBy4NotBy5(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 4 == 0 && value % 5 != 0) count++;
        }
        return count;
    }

    //  3d. Tổng các số nguyên tố có trong mảng.
    public static int sumPrimes(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            if (soNguyenTo(value)) sum += value;
        }
        return sum;
    }

    // 4a. Vị trí cuối cùng của phần tử x trong mảng.
    public static int lastIndexOf(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 4b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
    public static int firstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 4c. Tìm số dương nhỏ nhất trong mảng.
    public static  Integer findMinPositive(int[] arr) {
        Integer min = null;
        for (int x : arr) {
            if (x > 0 && (min == null || x < min)) {
                min = x;
            }
        }
        return min;
    }

    // 4d. Nhập vào phần tử k, tìm xem có xuất hiện không và in ra các vị trí
    public static void findElementInArray(int[] arr, int k) {
        boolean found = false;
        System.out.print("Vị trí xuất hiện của " + k + ": ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không tồn tại phần tử " + k);
        }
        System.out.println();
    }

    // 4e. Tìm giá trị lớn nhất
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // 4e. Tìm giá trị nhỏ nhất
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
