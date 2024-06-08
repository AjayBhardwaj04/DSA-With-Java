package Mathes;

public class PrimeNum {
    static boolean uPrime(int n)
    {
//        if (n==1)
//            return false;
//        for (int i = 2; i < n; i++)
//            if (n % i == 0)
//                return false;
//        return true;

        if (n==1)
            return false;

        for (int i = 2 ; i < n ; i++)
            if (n%2==0)
                return true;
        System.out.println(n + "This is a Naturel Numbers");
        return false;

    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(uPrime(n));
    }
}
