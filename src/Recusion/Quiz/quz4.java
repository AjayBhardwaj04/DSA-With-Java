package Recusion.Quiz;

public class quz4 {
    static int quz(int n){
        if (n ==1){
            return 0 ;}
//        System.out.println(n%2);
         else return 1 + quz(n/2);

    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(quz(n));
    }
}
