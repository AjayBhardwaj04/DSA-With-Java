package Bit_Magic;

// Brian Kernighan’s Algorithm :)

 class countSetBits {
    static int countBits(int i) {
        int count = 0;
        while (i > 0) {
            count += i & 1;
            i >>= 1;

        }
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(countBits(n));
    }
}
