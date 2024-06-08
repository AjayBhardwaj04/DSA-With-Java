package Mathes;

import java.util.Scanner;

public class LCM {
    static int gcd(int a , int b)
    {
////        First Methode !!!
////        res = Math.max(a,b);
//        int res = Math.max(a,b);
//        while (true)
//        {
//            if (res % a == 0 && res % b == 0)
//                return res;
//            res++;
//        }

        //    Second Methode !!!!

        if (b == 0)
            return a;
        return gcd(b,a % b);

    }
    static int lcm (int a , int b )
    {
        return (a * b) / gcd(a ,b);
    }




    

    public static void main(String[] args) {
//        Scanner Scenner = new Scanner(System.in);
        int a = 10;
        int b = 12;
        System.out.println(lcm(a , b));
    }
}
