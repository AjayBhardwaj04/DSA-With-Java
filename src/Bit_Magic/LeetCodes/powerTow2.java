package Bit_Magic.LeetCodes;

public class powerTow2 {
    public static boolean powerOfTow(double n) {
//        if (n == 0) {
//            return false;
//        }
//        return (n != 0) && ((n & (n - 2)) == 0);
//    }

        if(n <= 0){
            return false;
        }
        while (n % 2 == 0){
            n = n /  2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        double num = 4.0;
        System.out.println(powerOfTow(num));

    }
}
