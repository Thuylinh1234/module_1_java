package ss4_condition;

public class Main {
    public static void main(String[] args) {
        double score = 11;

//        if (score < 4) {
//            System.out.println("Rớt môn!");
//        } else {
//            System.out.println("Qua môn!");
//        }
        // cách 2
//        if (score < 4) {
//            System.out.println("Rớt môn");
//        } else if (score >= 4 && score < 6) {
//            System.out.println("Trung bình");
//        } else if (score >= 6 && score < 8) {
//            System.out.println("Khá");
//        } else if (score >= 8 && score <= 10) {
//            System.out.println("Giỏi");
//        }
        //  cách 3
        if (score < 0 || score >= 10){
            System.out.println("Không hợp lệ");
        }else  if (score < 4) {
            System.out.println("Rớt môn");
        } else if (score < 6) {
            System.out.println("Trung bình");
        } else if (score < 8) {
            System.out.println("Khá");
        } else  {
            System.out.println("Giỏi");
        }

        System.out.println("Chương trình kết thúc");
    }
}
// switch sử dụng so sánh bằng
// if so sánh lớn hơn bé bằng
// switch case làm được if else làm được ngược lại thì không
// nhuocwjc điểm switch chỉ cho phép thực hiện string và số nguyên và chỉ thực hiện so sánh bằng
// Ưu điểm switch rõ ràng, tốc độ nhanh