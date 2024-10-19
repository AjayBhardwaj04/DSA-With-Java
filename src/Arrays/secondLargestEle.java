package Arrays;

public class secondLargestEle {
    public static int largestEle(int arr[],int n){
        int largest = 0;
        for (int i = 0; i<n;i++){
            if (arr[i] > arr[largest]);
            largest = i;
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {12,21,23,32,34,43};
        System.out.println(largestEle(arr, arr.length));
//        largestEle(arr);
    }
}
