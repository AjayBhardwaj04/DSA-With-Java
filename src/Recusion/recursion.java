package Recusion;

public class recursion {
   static void fun(int n){
       if (n == 0){
           return;
       }
       fun(n / 2);
       System.out.println(n % 2);
   }

    public static void main(String[] args) {
        int n = 8;
//        System.out.println(fun(n));
        fun(n);
    }
}
