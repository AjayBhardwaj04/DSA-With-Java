package Bit_Magic;

public class rendumCode {

    public static int fun(int arr[], int n){
        int x = arr[0];

        for (int i = 1; i < n ;i++)
            x= x ^ arr[i];
        return x;
    }


    public static void main(String[] args) {
//        int n = 9;122,11,2,2,10,9,10,12,9,11,2;
//        int i= 2;
//        System.out.println(i,fun(9,12,2,11,2,2,10,9,10,12,9,11,2));

        int[] arr = {9, 12, 2, 11, 2, 2, 10, 9, 10, 12, 9, 11, 2};
        int n = arr.length;

        int result = fun(arr, n);
        System.out.println(result);

    }
}
