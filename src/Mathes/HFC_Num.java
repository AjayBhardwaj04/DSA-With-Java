package Mathes;

public class HFC_Num {
    static int HFCNUM(int n, int m, int x) {
        int res = Math.min(n, m);
        while (res > 0) {
            if (n % res == 0 && m % res == 0 && x % res ==0) {
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 43;
        int m = 91;
        int x = 183;
        System.out.println(HFCNUM(n, m ,x));
    }
}
