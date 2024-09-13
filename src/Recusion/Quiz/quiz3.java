package Recusion.Quiz;

public class quiz3 {
    static int  quz(int a , int b){
        if (a == 0){
            return b;
        }
        return quiz3.quz(a - 1, a + b);
    }

    public static void main(String[] args) {
        int a = 4; // Replace with your desired initial value for a
        int b = 3; // Replace with your desired initial value for b
        int result = quiz3.quz(a,b);
        System.out.println("Result: " + result);
//        System.out.println(quiz3(a,));
    }
}
