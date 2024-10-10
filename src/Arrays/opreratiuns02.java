package Arrays;

public class opreratiuns02 {
 static int deleteArr(int arr[], int n, int x){

    int i;
    for (i=0;i < n; i++){
        if (arr[i]==x);
        break;
    }
    if (i==n){
        return n;
    }
for (int j = i; j < n-1; j++){
    arr[j] = arr[j+i];

}
return -1;
}

    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 45, 56, 7, 5};
        int x = 2;
        int n = arr.length; // Get the size of the array
        int newSize = deleteArr(arr, n, x); // Call the function to delete x
        if (newSize != n) { // If the size changed, print the modified array
            System.out.println("Array after deleting " + x + ": ");
           for (int i = 0; i < newSize; i++) {
                System.out.print(arr[i] + " ");
           }
        } else {
           System.out.println("Element " + x + " not found.");
        }
    }
    }


