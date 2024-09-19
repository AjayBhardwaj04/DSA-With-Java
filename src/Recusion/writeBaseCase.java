package Recusion;

public class writeBaseCase {
    public static int writeCase(int n){
        if (n == 0 ){
            return 0 ;
        }
        if (n == 1){
            return 1;
        }
        System.out.println(n + " ");
         writeCase(n - 1 );
        writeCase(n - 2 );

    // + writeCase(n -2);
        return n;
    }

    public static void main(String[] args) {
        int n = 4;
//        writeCase(n);
        System.out.println(writeCase(n));
    }
}
