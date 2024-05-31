package com.ajay.Arrays;

public class Arrays02 {



    static boolean checkPalindrome(int n)
    {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n); // if it is true then it will return 1;
        // else if false it will return 0;
    }






    public static void main(String[] args) {

        int n = 7007;
        if (checkPalindrome(n) == true) {
            System.out.println("Yes"+ n);
        }
        else {
            System.out.println("No");
        }




    }



}
