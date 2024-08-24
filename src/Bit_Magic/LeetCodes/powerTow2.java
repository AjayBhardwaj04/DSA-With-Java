package Bit_Magic.LeetCodes;

public class powerTow2 {
    public static boolean powerOfTow(int n){
        if (n == 0){
            return false;
        }
        return (n != 0) && ((n & (n - 2)) == 0);
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(powerOfTow(num));
    }
}
