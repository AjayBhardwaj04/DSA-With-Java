package Bit_Magic.LeetCodes;
// COUNT THE POWER OF NUMBERS :)
public class powerTow {
    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(3, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int i = 81;
        System.out.println(isPowerOfTwo(i));
    }
}
