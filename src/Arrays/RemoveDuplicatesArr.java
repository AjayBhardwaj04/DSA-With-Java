package Arrays;

public class RemoveDuplicatesArr {
    public  static int removeDuplArr(int arr[], int n){
        int [] tamp = new int[n];
        tamp[0] = arr[0];
        int res = 1;
        for (int i=1; i<n; i++){
            if (tamp[res-1] != arr[i]){
                tamp[res] = arr[i];
                res++;
            }
        }
        for (int i=0; i<res;i++)
            arr[i] = tamp[i];

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3};
        int n = arr.length;
        System.out.println(removeDuplArr(arr,n));
    }
}
