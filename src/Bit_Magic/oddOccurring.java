package Bit_Magic;

public class oddOccurring {
     static int OneOddOccurring(int arr[], int arr_size) {
        int i;
        int res = arr[0];
        for ( i = 0; i < arr_size; i++) {
            res = res ^ arr[i];

            for (int j = 0; j < arr_size; j++){
                res = res ^ arr[j];
            }
        }
        return res ;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,3,3,3};
        int n = arr.length;
        System.out.println(OneOddOccurring(arr ,n));
    }
}
