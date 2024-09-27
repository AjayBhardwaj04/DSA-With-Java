package Recusion.Problem;

public class qun3 {
    static int isFibonacci(int n){
        if (n <= 1){
            return n;
        }
        return isFibonacci(n -1) + isFibonacci(n -2);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isFibonacci(n));
    }
}
