package Recusion;

public class printForNum {
    static void  fun(int n){
        if (n == 0){
            return ;
        }
        System.out.print(n + " ");
        fun(n -1);
    }

    public static void main(String[] args) {
        int n = 12;
        fun(n);
//        System.out.println(fun(n));
    }
}
