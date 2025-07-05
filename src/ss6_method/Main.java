package ss6_method;

public class Main {
    public static  void main(String [] args){
        double x = 1;
        double y = 2;
        double z = 2;

        double total = sum(x,y);
        total = sum(total,z);
    }
    public static double  sum(double a, double b){
        double sum = a + b;
        return sum;

    }
}
