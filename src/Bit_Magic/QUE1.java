package Bit_Magic;

public class QUE1 {
    public static boolean isKthBitSet(int n, int k) {
        // Create a mask with only the kth bit set
        int mask = 1 << k;

        // Check if the kth bit is set by performing bitwise AND
        return (n & mask) != 0;
    }

    public static void main(String[] args) {
        int n = 4; // Binary: 1010
        int k = 1;

        if (isKthBitSet(n, k)) {
            System.out.println("The " + k + "th bit is set");
        } else {
            System.out.println("The " + k + "th bit is not set");
        }
    }

}
