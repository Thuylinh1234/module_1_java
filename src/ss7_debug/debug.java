package ss7_debug;

public class debug {
    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//
//
//        System.out.println("Giá trị của a: " + a);
//        System.out.println("Giá trị của b: " + b);
//
//        int c = sum(a,b);
//        for (int i = 1; i<=100; i++){
//            System.out.println(i);
//        }
//        System.out.println(c);
//    }
//    public  static int sum (int a, int b){
//        return a+b;

//        String str1 = "Nguyễn Ngọc Quang";
//        String str2 = "Nguyễn Ngọc Quang";
//        String str3 = new String("Nguyễn Ngọc Quang") ;
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
//
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));

        String name = "Nguyen Van A";
        name = name + " - 2000";

        System.out.println(name);

        StringBuilder stringBuilder = new StringBuilder("Nguyễn Văn A");
        StringBuilder stringBuilder1 = stringBuilder;

        stringBuilder1.append("- 2000");
        System.out.println(stringBuilder);

        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 10; i++){
            str.append(i);
        }
        System.out.println(str);
  }
}
