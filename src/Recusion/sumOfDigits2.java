package Recusion;

public class sumOfDigits2 {
    static int sumDigit(int n){
        int num = 0;
        while (n >= num){
            num = num + n%10;
            n = n/10;
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 23;
        System.out.println(sumDigit(n));
    }
}
