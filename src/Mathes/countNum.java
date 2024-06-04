package Mathes;

public class countNum {
//    static int countNums(int n){
//        if (n/10 == 0)
//            return n;
//
//        return 1 + countNums(n/10);
//    }
//
//    public static void main(String[] args) {
//        int n = 12321;
//        System.out.println(countNums(n));
//    }

    static int singleDigit(int n){
        // code here

        if(n/10 == 0)
            return n;
        return 1 + singleDigit(n / n);

    }

    public static void main(String[] args){
        int n = 123;
        System.out.println(singleDigit(n));
    }

}
