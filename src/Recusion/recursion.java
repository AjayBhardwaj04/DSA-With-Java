package Recusion;

public class recursion {
    static void res(int n) {
        if (n == 0)
            return;
        res(n - 1);
            System.out.println(n);
            res(n - 1);
            System.out.println(n);



    }

    public static void main(String[] args) {
        res(3);
    }
}
