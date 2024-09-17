package Recusion;

public class powOFNum {
    public  double priNumForRec(double x, int n) {
        return priNumForRec(x, (long) n);}


    private double priNumForRec(double x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1 / priNumForRec(x, -n);
        }

        if (n % 2 == 1) {
            return x * priNumForRec(x * x, (n - 1) / 2);
        } else {
            return priNumForRec(x * x, n / 2);
        }
    }

    public static void main(String[] args) {

//        myClass fun = new myClass();
        powOFNum fun = new powOFNum();
        System.out.println(fun.priNumForRec(9,4));
//        fun.priNumForRec(2.0,4);

//        double x = 2.1;
//        int n = 2;
//
//        priNumForRec(x,n);

//        System.out.println(priNumForRec(x, n));
    }

}
