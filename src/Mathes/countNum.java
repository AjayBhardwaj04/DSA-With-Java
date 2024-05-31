package Mathes;

public class countNum {
    static int countNums(int n){
        if (n/10 == 0)
            return n;

        return 1 + countNums(n/10);
    }

    public static void main(String[] args) {
        int n = 12321;
        System.out.println(countNums(n));
    }
}
