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

    public static class QUN3 {
        public static int countAllBits(int n){
            //Ignoring 0 as all the bits are unset.
            n+=1;
            int count=0;

            //Counting set bits from 1 to n.
            for( int x=2 ; x/2<n ; x=x*2 )
            {
                //Total count of pairs of 0s and 1s.
                int quotient = n/x;
                //quotient gives the complete count of pairs of 1s.
                //Multiplying it with the (current power of 2)/2 will give
                //the count of 1s in the current bit.
                count += quotient * x / 2;

                int remainder = n%x;
                //If the count of pairs is odd then we add the remaining 1s
                //which could not be grouped together.
                if(remainder > x/2)
                    count += remainder - x/2;
            }

            //returning count of set bits.
            return count;

        }

        public static void main(String[] args) {
            int num = 7;
            System.out.println(countAllBits(num));
        }
    }
}
