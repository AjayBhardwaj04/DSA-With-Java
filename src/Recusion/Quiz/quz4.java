package Recusion.Quiz;

public class quz4 {
    static int quz(int n){
        if (n ==0){
            return 1 ;}
        System.out.println(n%2);
        return quz(n/2);

    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(quz(n));
    }
}
