package bai_tap_1;

public class TimBien {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a = i++ + j++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);

        int a1 = i++ + ++j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a1 = " + a1);

        int a2 = ++i + j++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a2 = " + a2);

        int a3 = ++i + ++j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a3 = " + a3);

        int a4 = i++ + j++ + i++ + j++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a4 = " + a4);

        int a5 = ++i + ++j + i++ + j++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a5 = " + a5);

        int a6 = i++ + ++i - i-- - --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a6 = " + a6);

        int a7 = 10;
        a7 += a7++ + ++a7;
        System.out.println("a7 = " + a7);
    }
}
