package Mathes;

public class allDivNum {
    static void printDiv(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0)
                System.out.println(i);
            for (; i >= 1; i++)
                if (n % i == 0)
                    System.out.println( i);
        }

    }

    public static void main(String[] args) {
        int i = 20;
        printDiv(i);
    }
}
