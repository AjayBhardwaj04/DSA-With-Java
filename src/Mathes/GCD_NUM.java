package Mathes;

public class GCD_NUM {
    static int GCDNUM(int n, int m) {
//        First Methode to count GCD
//        while (n != m) {
//            if (n > m)
//                n = n - m;
//            else m = m - n;
//        }
//        return n;

//        Second Methode
        if (m == 0)
            return n;
        else return GCDNUM(m, n % m);


    }

    public static void main(String[] args) {
        int n = 43;
        int m = 91;

        System.out.println(GCDNUM(n, m));
    }
}

