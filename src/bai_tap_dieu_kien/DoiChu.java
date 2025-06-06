package bai_tap_dieu_kien;

import java.util.Scanner;

/**
 * Nhập vào 1 ký tự là chữ cái. Nếu nhập sai thì báo thông báo đã nhập sai.
 * Nếu đúng thì đi kiểm tra nếu đó đang là chữ cái thường thì biến nó thành chữ cái hoa,
 * nếu nó là chữ cái hoa thì biến nó thành chữ cái thường.
 * Gợi ý: Ký tự chữ cái thường và hoa có mã ASCII cách nhau 32 đơn vị.
 * Vd: ‘a’ là 97, ‘A’ là 65
 */
public class DoiChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kyTu = 0;

        while (true) {
            System.out.print("Nhập một ký tự chữ cái: ");
            String c = sc.next();

            if (c.length() != 1) {
                System.out.println("Bạn phải nhập đúng 1 ký tự. Vui lòng nhập lại cho đúng.");
                continue;
            }

            kyTu = c.charAt(0);
            // Kiểm tra có phải chữ cái không
            if ((kyTu >= 'A' && kyTu <= 'Z') || (kyTu >= 'a' && kyTu <= 'z')) {
                break;
            } else {
                System.out.println("Nhập sai, vui lòng nhập một ký tự chữ cái.");
            }
        }

                if (kyTu >= 'a' && kyTu <= 'z') {
                    kyTu = (char) (kyTu - 32);
                } else {
                    kyTu = (char) (kyTu + 32);
                }

        System.out.println("Ký tự sau khi đã đổi: " + kyTu);
    }
}
