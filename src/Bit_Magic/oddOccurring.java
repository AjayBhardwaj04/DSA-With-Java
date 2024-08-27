package Bit_Magic;

public class oddOccurring {
     static int OneOddOccurring(int arr[], int arr_size) {
        int i;
        int res = 0;
        for (i = 0; i < arr_size; i++) {
            res = res ^ arr[i];
        }
        return res % 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,2,2,2,2,2,5};
        int n = arr.length;
        System.out.println(OneOddOccurring(arr ,n));
    }
}
