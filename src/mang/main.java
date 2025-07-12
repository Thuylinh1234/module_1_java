package mang;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        int [] a= new int[3];
//        int [] b = a;
//        change(b);
//        System.out.println("a: " + Arrays.toString(a));
        StringBuilder str = new StringBuilder("Nguyễn Ngọc Quang");
        change(str);
        System.out.println(str);
    }
    public  static  void  change(StringBuilder ta){

//        for (int i = 0; i < arr.length; i++){
//            arr[i] = i*i;
//        }
//        arr[0] = 10;
//        arr[1] = 20;
//        arr = new int[3];
//        arr[2] = 30;
        ta.append((" 1995"));
    }
}
