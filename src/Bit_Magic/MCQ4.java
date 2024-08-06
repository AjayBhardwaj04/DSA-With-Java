package Bit_Magic;

public class MCQ4 {


    public static int countBitsToFlip(int a, int b) {
        int xor = a ^ b;
        int count = 0;

        // Efficiently count set bits using Brian Kernighan's algorithm
        while (xor != 0) {
            xor &= (xor - 1);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 11, b = 9;
        int flips = countBitsToFlip(a, b);
        System.out.println("Number of bits to be flipped: " + flips);
    }
}
