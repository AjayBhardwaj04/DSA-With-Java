package Recusion;

public class palindrome2 {
    static boolean isPalindrome2(String str, int n ){
        if (n > str.length()/2){

            return true;
//            System.out.println( "This is Palindrome String");
        }

        return (str.charAt(n) == str.charAt(str.length() -n -1) && isPalindrome2(str, n-1) );
    }

    public static void main(String[] args) {
        String str = "abbaa";
        if (isPalindrome2(str,0)){
            System.out.println(" This is Palindrome Char ");
        }else {
            System.out.println(" This is NOT Palindrome Char ");

        }
    }
}
