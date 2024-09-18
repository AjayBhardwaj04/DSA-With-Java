package Recusion;
// Not Tail Recursion Function
public class tailRecFun {
    public static void tailFun(int n , int k){
        if (n == 0){
            return;
        }                                                  // Base Cases
        System.out.print(k + " ");
        tailFun(n - 1, k + 1);

    }

    public static void main(String[] args) {
        int n =  11;
        int k = 1;
        tailFun(n,k);
//        System.out.println(tailFun(n,k));
    }
}
