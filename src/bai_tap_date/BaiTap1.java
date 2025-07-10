package bai_tap_date;

/*
a. Cho chuỗi "Hello World"
    Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.

b. Cho chuỗi "Hello World"
    Thay o thành f bằng cách dùng StringBuffer và StringBuilder.

c. Cho chuỗi "Hello" và chuỗi “World”
    Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.

d. Đoạn code sau tạo ra bao nhiêu đối tượng và kết quả hiển thị là gì:
    String a = "A";
    String b = new String("A");
    String c = "A";
    b.concat("B").
    String d = c.concat("C");
    StringBuffer e = new StringBuffer("E");
    e.append("F");
    StringBuilder g = new StringBuilder("G");
    g.append("H");
    System.out.println(a + b + c + d + e + g);

e. Viết chương trình phân biệt sự khác nhau giữa so sánh
bằng method equals và so sánh bằng toán tử == khi sử dụng String, StringBuffer và StringBuilder.
 */
public class BaiTap1 {

    public static void main(String[] args) {
        // a. Lấy "World" từ "Hello World"
        StringBuffer bufferA = new StringBuffer("Hello World");
        StringBuilder builderA = new StringBuilder("Hello World");

        String resultBufferA = bufferA.substring(6);
        String resultBuilderA = builderA.substring(6);

        System.out.println("a. Lấy 'World':");
        System.out.println("  StringBuffer: " + resultBufferA);
        System.out.println("  StringBuilder: " + resultBuilderA);

        // b. Thay 'o' thành 'f' trong "Hello World"
        StringBuffer bufferB = new StringBuffer("Hello World");
        StringBuilder builderB = new StringBuilder("Hello World");

        for (int i = 0; i < bufferB.length(); i++) {
            if (bufferB.charAt(i) == 'o') {
                bufferB.setCharAt(i, 'f');
            }
        }

        for (int i = 0; i < builderB.length(); i++) {
            if (builderB.charAt(i) == 'o') {
                builderB.setCharAt(i, 'f');
            }
        }

        System.out.println("\nb. Thay 'o' thành 'f':");
        System.out.println("  StringBuffer: " + bufferB);
        System.out.println("  StringBuilder: " + builderB);

        // c. Nối "Hello" và "World"
        String str1 = "Hello";
        String str2 = "World";
        String resultStr = str1 + str2;

        StringBuffer bufferC = new StringBuffer("Hello");
        bufferC.append("World");

        StringBuilder builderC = new StringBuilder("Hello");
        builderC.append("World");

        System.out.println("\nc. Nối chuỗi:");
        System.out.println("  String: " + resultStr);
        System.out.println("  StringBuffer: " + bufferC);
        System.out.println("  StringBuilder: " + builderC);

        // d. Số đối tượng và kết quả hiển thị
        String a = "A";
        String b = new String("A");
        String c = "A";
        b.concat("B"); // không gán lại
        String d = c.concat("C");
        StringBuffer e = new StringBuffer("E");
        e.append("F");
        StringBuilder g = new StringBuilder("G");
        g.append("H");

        System.out.println("\nd. Kết quả in:");
        System.out.println("  " + a + b + c + d + e + g);

        // e. So sánh equals() và ==
        String s1 = "Hello";
        String s2 = new String("Hello");

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");

        System.out.println("\ne. So sánh equals() và == ");
        System.out.println("  String equals: " + s1.equals(s2)); // true
        System.out.println("  String == " + (s1 == s2));         // false

        System.out.println("  StringBuffer equals: " + sb1.equals(sb2)); // false
        System.out.println("  StringBuffer == " + (sb1 == sb2));         // false

        System.out.println("  StringBuilder equals: " + sb3.equals(sb4)); // false
        System.out.println("  StringBuilder == " + (sb3 == sb4));         // false
    }
}