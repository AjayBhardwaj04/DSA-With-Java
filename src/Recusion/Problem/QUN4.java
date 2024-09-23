package Recusion.Problem;
//Print numbers from 1 to n without the help of loops. You only need to complete the function printNos() that takes N as parameter and prints
// number from 1 to N recursively.
public class QUN4 {
    static void print1ToN(int n){
        // Base case: If n is 0, return (the base case is reached).
        if (n == 0){
            return;
        }
        // Recursive call to print numbers from 1 to n-1
        print1ToN(n-1);
        // Print the current value of n after the recursive calls
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 41;
        print1ToN(n);
//        System.out.println(print1ToN(n));
    }
}
