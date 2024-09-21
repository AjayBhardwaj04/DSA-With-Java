package Recusion;

public class palindrome2 {
    static boolean isPalindrome2(String str, int start, int end){
        if (start >= end){

            return true;
//            System.out.println( "This is Palindrome String");
        }
        if (str.charAt(start) != str.charAt(end)){
//            return false;
            System.out.println( "NOT is Palindrome String");
            return false;
        }
        return isPalindrome2(str,start +1 ,end -1);
    }

    public static void main(String[] args) {
        String str = "abbaa";
        int strat = 0;
        int end = str.length() -1;
        System.out.println(isPalindrome2(str,strat,end));
    }
}
