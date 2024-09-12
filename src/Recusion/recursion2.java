package Recusion;

public class recursion2 {
    static void res2(int n){
        if (n == 1){
            return ;
        }
            else return 1 + res2(n/2);

    }
}
