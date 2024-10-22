package Arrays;

public class arrayShorted02 {
    public static boolean arrShorted(int arr[]){
        for (int i=1; i<arr.length;i++){
            if (arr[i] < arr[i-1])
                return false;
        }
        return arrShorted(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(arrShorted(arr));
    }
}
