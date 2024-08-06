package Bit_Magic;

public class que2 {
    public static int getFirstSetBit(int n) {
        int position = 1;

        // Check if n is negative or zero
        if (n <= 0) {
            return 0;
        }

        // Find the first set bit
        while ((n & 1) == 0) {
            n >>= 1;
            position++;
        }

        return position;
    }

    public static void main(String[] args) {
        int n = 18;
        int result = getFirstSetBit(n);
        System.out.println("Position of first set bit: " + result);
    }
}
