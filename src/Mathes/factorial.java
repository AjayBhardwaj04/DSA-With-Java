package Mathes;

public class factorial {
    static int factorial(int n)
    {
//        int res = 1, i;
//        for (i = 1; i <= n; i++)
//            res = res * i;
//        return res;
//        int j = 1 ,i ;
//        for (i = 1; i <= n ; i++)
//            j = j * i;
//        return j;
//    }

//
//        if (n < 0) {
//            return -1;
//        } else if (n == 0) {
//            return 1;
//        } else {
//            long result = 1;
//            for (int i = 2; i <= n; i++) {
//                result = result * i;
//                // Check for overflow
//                if (result < 0) {
//                    throw new ArithmeticException("Factorial overflows a long value for number: " + n);
//                }
//            }
//            return result;

        if (n==0)
        return 1;
        return n * factorial(n-1);


        }

    public static void main(String[] args) {
int num = 6;
        System.out.println(factorial(num));

    }


}
