package bai_tap_debug;

import java.util.Scanner;

/*
Cho chuỗi "Hello World"
    a. Lấy ra chữ World
    b. Thay o thành f
    c. Đếm xem có bao nhiêu chữ l
    d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
    e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
    f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
    g. Đảo chuỗi thành dlroW olleH
    h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
    i. Đổi toàn bộ kí tự của S sang chữ Hoa
    k. Đổi toàn bộ kí tự của S sang chữ thường
    l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
 */
public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello World";

        System.out.println("a. Lấy ra chữ World: " + str.substring(6));

        System.out.println("b. Thay o thành f: " + str.replace('o', 'f'));

        // c. Đếm xem có bao nhiêu chữ l
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("c. Đếm xem có bao nhiêu chữ l: " + count);

        //  d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        int first = str.indexOf('l');
        int last = str.lastIndexOf('l');
        System.out.println("d. Vị trí đầu: " + first + ", cuối: " + last);

        // e. Xóa tất cả khoảng trắng
        String e = str.replace(" ", "");
        System.out.println("e. Xóa toàn bộ khoảng trắng: " + e);

        // f. Xóa khoảng trắng đầu và cuối
        String f = str.trim();
        System.out.println("f. Xóa khoảng trắng đầu/cuối: " + f);

        // g. Đảo chuỗi
        StringBuilder reversed = new StringBuilder(str);
        System.out.println("g. Đảo chuỗi: " + reversed.reverse().toString());

        // chuỗi "SQC"
        String str1 = "SQC";
        // h. Nối chuỗi thành "SQC Hello World"
        String h = str1 + " " + str;
        System.out.println("h. Chuỗi sau nối: " + h);

        // i. Chuyển s2 sang chữ hoa
        System.out.println("i. Hoa: " + str1.toUpperCase());

        // k. Chuyển s2 sang chữ thường
        System.out.println("k. Thường: " + str1.toLowerCase());

        // l. Trích chuỗi con từ vị trí n đến m
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.print("Nhập m: ");
        int m = sc.nextInt();
        if (n >= 0 && m <= str.length() && n < m) {
            String sub = str.substring(n, m);
            System.out.println("l. Chuỗi con từ " + n + " đến " + m + ": " + sub);
        } else {
            System.out.println("Giá trị không hợp lệ!");
        }
    }
}

