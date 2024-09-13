package Recusion.Quiz;
//Quiz 5 is not solve
public class quz5 {
    static int fun(int x, int y) {
        if (x == 0) {
            return 0;
        }

        return x + fun(x, y - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println(fun(x,y));
    }
}
