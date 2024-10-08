package Bit_Magic;

public class qun3 {
    public static int countAllBits(int n ){
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
        int num = 4;
        System.out.println(countAllBits(num));
    }
}
