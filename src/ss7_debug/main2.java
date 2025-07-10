package ss7_debug;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào ngày sinh của bạn (dd/MM/yyyy): ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dateOfBirth = simpleDateFormat.parse(sc.nextLine());
        System.out.println("Ngày sinh của bạn: " + simpleDateFormat.format(dateOfBirth));
    }
}
