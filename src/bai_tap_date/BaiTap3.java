package bai_tap_date;
/*
 a. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        byte⤍short⤍int⤍long⤍float⤍double
    b. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        double⤍float⤍long⤍int⤍short⤍byte
    c. Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới:
        double⤍float⤍long⤍int⤍short⤍byte
    d. Phân biệt ép kiểu tường minh và ép kiểu ngầm định
    e. Khi nào cần dùng các ký tự L, F, D… sau các số nguyên, số thực trong Java?
    Khi nào thì không cần dùng đến các ký tự này mà Java vẫn tự hiểu được các số thuộc kiểu dữ liệu gì?
 */
public class BaiTap3 {
    public static void main(String[] args) {
        System.out.println("Câu a: ");
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\nCâu b: ");
        double d1 = 123.0;
        float f1 = (float) d1;
        long l1 = (long) f1;
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte b1 = (byte) s1;

        System.out.println("double: " + d1);
        System.out.println("float: " + f1);
        System.out.println("long: " + l1);
        System.out.println("int: " + i1);
        System.out.println("short: " + s1);
        System.out.println("byte: " + b1);

        System.out.println("\nCâu c: ");
        double d2 = 123456789.987654321;
        float f2 = (float) d2;
        long l2 = (long) d2;
        int i2 = (int) l2;
        short s2 = (short) i2;
        byte b2 = (byte) s2;

        System.out.println("double: " + d2);
        System.out.println("float (mất chính xác): " + f2);
        System.out.println("long (mất phần thập phân): " + l2);
        System.out.println("int: " + i2);
        System.out.println("short: " + s2);
        System.out.println("byte: " + b2);

        System.out.println("\nCâu d: ");
        int a = 100;
        long b3 = a;

        double x = 123.456;
        int y = (int) x;

        System.out.println("Ép ngầm định (int -> long): " + b3);
        System.out.println("Ép tường minh (double -> int): " + y);

        System.out.println("\nCâu e: ");
        int a2 = 100;
        double d3 = 3.14;
        long l3 = 100L;
        float f3 = 3.14F;
        double d4 = 3.14D;

        System.out.println("int: " + a2);
        System.out.println("double: " + d3);
        System.out.println("long (L): " + l3);
        System.out.println("float (F): " + f3);
        System.out.println("double (D): " + d4);
    }
}
