package Recusion;
//Given a number n, find sum of first n natural numbers. To calculate the sum, we will use a recursive function recur_sum().
public class naturalNumSum {
     static  int naturalSum(int n) {
        if (n == 0){
            return 0 ;
        }else
            return n + naturalSum(n-1);




    }

    public static void main(String[] args) {
        int n = 4;
//        naturalSum(n);
        System.out.println(naturalSum(n));
    }
}
