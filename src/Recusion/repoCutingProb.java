package Recusion;

//Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B and C.
// The task is to maximizes the number of cuts in rope.
// If it is impossible to make cut then print the number else print -1. Examples:
public class repoCutingProb {
    public static int repoProblem(int n, int a, int b, int c) {
        if (n == 0)
            return 0;

        if (n <= -1)
            return -1;

        int res = Math.max(repoProblem(n - a, a, b, c),
                Math.max(repoProblem(n - b, a, b, c),
                        repoProblem(n - c, a, b, c)));
        if (res == -1)
            return -1;

        return res + 1;


    }

    public static void main(String[] args) {
        int n = 12;
        int a = 1;
        int b = 5;
        int c = 6;
        System.out.println(repoProblem(n, a, b, c));

    }
}
