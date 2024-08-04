package Mathes;

public class computPow {
    public static  long power(int n , int x){
        long pow = 1L;
        for (int i = 0; i < n; i++){
            pow = pow * x;
        }
        return pow;
    }

    public static void main(String[] args) {
        int n =  3;
        int x = 2;
        System.out.println(power(n,x));
    }
}
