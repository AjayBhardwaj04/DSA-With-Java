package Mathes;

public class TrailingZeros {
    static int countZeros(int n){
//         First Methode
//       int fact = 1;
//       for (int i = 5; i <= n ; i++)
//           fact *= i;
//       int res = 0;
//       while (fact % 10 == 0){
//           res++;
//           fact /= 10;
//       }

//        Second Methode
        int res = 0;
        for (int i = 5; i <= n; i = i* 5)
            res = res + n/i;

       return res;

    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println(countZeros(num));
    }
}
