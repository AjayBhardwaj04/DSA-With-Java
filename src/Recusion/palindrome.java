package Recusion;

public class palindrome {
      static boolean  isPalindrome(String str, int start, int end){
        if (start >= end) {
            return true;
//            System.out.println();
        }

        return  (str.charAt(start)== str.charAt(end)) && isPalindrome(str,start + 1, end -1) ;

    }

    public static void main(String[] args) {
        String str = "ABABA";

        int start = 0;
        int end  = str.length()-1;
        System.out.println(isPalindrome(str,start,end ));
    }

}
