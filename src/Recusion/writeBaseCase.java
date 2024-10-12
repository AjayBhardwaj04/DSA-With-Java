package Recusion;

public class writeBaseCase {
    public static int writeCase(int n){
        if (n == 0 ){
            return -1 ;
        }
//        if (n == 1){
//            return 0;
//        }
        System.out.print(n + " ");
//         writeCase(n - 1 );
        writeCase(n - 2 );

    // + writeCase(n -2);
        return n ;
    }

    public static void main(String[] args) {
        int n = 4;
//        writeCase(n);
        System.out.println(writeCase(n));
    }
}
