package Arrays;

public class RemoveDuplicatesArr02 {
    public static int removeDupArr(int arr[] ,int n){
        int res = 1;
        for (int i=1; i<n;i++){
            if (arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
//        int arr[] = {1,2,2,3,3,5,5},n = 7;
////        int n = arr.length;?
//        System.out.println(removeDupArr(arr,n));

        int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

        System.out.println("Before Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        n = removeDupArr(arr, n);

        System.out.println("After Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
