package Recusion.Quiz;

public class quiz2 {
     static int res2(int n){
        if (n == 1)
            return n;

            else return 2*res2(n+1);

    }

    public static void main(String[] args) {
         int a = 2;
        System.out.println(res2(a));
    }
}
