package Arrays;

public class arrayShorted {
    public static boolean arrShore (int arr[]){
        for (int i=1; i< arr.length;i++){
            for (int j=i+1; j<arr.length;j++)

            if (arr[i] > arr[j])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {11,10,9,8,7};
        System.out.println(arrShore(arr));
    }
}
