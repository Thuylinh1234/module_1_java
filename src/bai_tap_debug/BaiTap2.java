package bai_tap_debug;

import java.util.Scanner;

/*
Thực hiện các việc chuyển đổi sau:
    a. Chuyển đổi String thành int
    b. Chuyển đổi int thành String
    c. Chuyển đổi String thành long
    d. Chuyển đổi long thành String
    e. Chuyển đổi String thành float
    f. Chuyển đổi float thành String
    g. Chuyển đổi String thành double
    h. Chuyển đổi double thành String
    i. Chuyển đổi String thành short
    k. Chuyển đổi short thành String
 */
public class BaiTap2 {
    public static void main(String[] args) {

        // a. Chuyển đổi String thành int
        String str = "14121315";
        int a = Integer.parseInt(str);

        //  b. Chuyển đổi int thành String
        String str1 =  String.valueOf(a);

        // c. Chuyển đổi String thành long
        String str2 = "1234567898765432";
        long b = Long.parseLong(str2);

        // d. Chuyển đổi long thành String
        String str3 = String.valueOf(b);

        // e. Chuyển đổi String thành float
        String str4 = "1.4F";
        Float c = Float.parseFloat(str4);

        // f. Chuyển đổi float thành String
        String str5 = String.valueOf(c);

        // g. Chuyển đổi String thành double
        String str6 = "1.4D";
        Double d = Double.parseDouble(str6);

        // h. Chuyển đổi double thành String
        String str7 = String.valueOf(d);

        // i. Chuyển đổi String thành short
        String str8 = "1000";
        Short e = Short.parseShort(str8);

        //  k. Chuyển đổi short thành String
        String str9 = String.valueOf(e);

        System.out.println("a. int: " + a);
        System.out.println("b. String: " + str1);
        System.out.println("c. long: " + b);
        System.out.println("d. String: " + str3);
        System.out.println("e. float: " + c);
        System.out.println("f. String: " + str5);
        System.out.println("g. double: " + d);
        System.out.println("h. String: " + str7);
        System.out.println("i. short: " + e);
        System.out.println("k. String: " + str9);

    }
}
