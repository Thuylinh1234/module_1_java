package arr_part2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 2, 2, 30, 40, 2};

        //int x = 100;
        int value = 2;
        arr = removeValue(arr, value);

        System.out.println(Arrays.toString(arr));
    }

//    private static int[] add(int[] arr, int x) {
//        //Bước 1: Tạo vùng nhớ mới = Độ dài của vungd nhớ cũ + 1
//        int[] brr = new int[arr.length + 1];
//
//        // Bước 2: Coppy giá trị vùng nhớ cũ qua vùng nhớ mới
//        System.arraycopy(arr, 0, brr, 0, arr.length);
//
//        // Bước 3: Gán phần tử muốn thêm vào vị trí cuối cùng của mảng
//        brr[arr.length] = x;
//
//        // Bước 4: Cho biển mảng ban đầu tham chiếu đến vùng mảng mới
//        //arr = brr; // vẫn đúng nhưng dư thừa vì ở trên đã gán
//        return brr;
//    }

//    private static int[] addIndex(int[] arr, int index, int x) {
//        //Bước 1: Tạo vùng nhớ mới = Độ dài của vungd nhớ cũ + 1
//        int[] brr = new int[arr.length + 1];
//
//        // Bước 2: Coppy giá trị vùng nhớ cũ qua vùng nhớ mới
//        // Trước index
//        for (int i = 0; i < index; i++) {
//            brr[i] = arr[i];
//        }
//        // sau index
//        for (int i = index; i < arr.length; i++) {
//            brr[i + 1] = arr[i];
//        }
//
//        // Bước 3: Gán phần tử muốn thêm vào vị trí cuối cùng của mảng
//        brr[index] = x;
//
//        // Bước 4: Cho biển mảng ban đầu tham chiếu đến vùng mảng mới
//        //arr = brr; // vẫn đúng nhưng dư thừa vì ở trên đã gán
//        return brr;
//    }

     public static int[] remove(int[] arr, int index) {
        //Bước 1: Tạo vùng nhớ mới = Độ dài của vungd nhớ cũ + 1
        int[] brr = new int[arr.length - 1];

        // Bước 2: Coppy giá trị vùng nhớ cũ qua vùng nhớ mới
        // Trước index
        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }
        // sau index
        for (int i = index; i < arr.length - 1; i++) {
            brr[i] = arr[i+ 1];
        }

        // Bước 3: Cho biển mảng ban đầu tham chiếu đến vùng mảng mới
        //arr = brr; // vẫn đúng nhưng dư thừa vì ở trên đã gán
        return brr;
    }

  public static int[] removeValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr = remove(arr, i);
                i--; // kiểm tra lại phần tử ở vị trí vừa đưa vào
            }
        }
        return arr;
    }

}
