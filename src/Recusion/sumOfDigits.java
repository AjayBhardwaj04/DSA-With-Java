package Recusion;
// Given a number, we need to find sum of its digits using recursion.
//Input : 12345
//Output : 15
public class sumOfDigits {
    static int fun( int n){
        if (n == 0){
            return 0;
        }else
        return fun(n/10) + n % 10;
    }

    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(fun(num));
    }
}
