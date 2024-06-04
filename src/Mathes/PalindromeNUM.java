package Mathes;

public class PalindromeNUM {
    static  boolean checkPalindrome(int n){
        int revers = 0;
        int temp = n;

        while (temp != 0){
            revers = (revers * 10 ) + (temp % 10);
            temp = temp / 10;
        }
return (revers == n);
    }

    public static void main(String[] args) {
        int n = 7007;
        if (!(checkPalindrome(n) != true)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
