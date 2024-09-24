package Recusion;
//You are given a number n. You need to find the count of digits in n.
//n  = 99999
//Output: 5
//Explanation:Number of digit in 99999 is 5
public class countDigits {
    public static int countDigits(int number) {
        if (number == 0) {
            return 0; // Base case: 0 has 1 digit
        } else {
            return 1 + countDigits(number / 10); // Recursive case: count digits in the remaining number
        }
    }

    public static void main(String[] args) {
        int num = 12345;
//        int digitCount = countDigits(num);
        System.out.println(countDigits(num));

//        System.out.println("Number of ofdigits in  
//                " + num + " is: " + digitCount);
    }
}
