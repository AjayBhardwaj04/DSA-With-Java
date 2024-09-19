package Recusion;

public class printForNum {
    static void  fun(int n){
        if (n == 0){
            return ;
        }
        fun(n - 1);
        System.out.print(n + " ");
//        fun(n -1);
    }

    public static void main(String[] args) {
        int n =4;
        fun(n);
//        System.out.println(fun(n));
    }
//    Time complexity is : T(n) = T(n-1) + cont(1);
}
