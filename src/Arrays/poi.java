package Arrays;

public class poi {
    static int deleteArr(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) { // Loop through the array to find the element x
            if (arr[i] == x) {
                break; // Break the loop if x is found
            }
        }
        if (i == n) { // If x is not found, return the original size
            return n;
        }
        for (int j = i; j < n - 1; j++) { // Shift elements to the left
            arr[j] = arr[j + 1];
        }
        return n - 1; // Return the new size of the array
    }

    public static void main(String[] args) {
        int arr[] = {1, 2,3,4,5,6};
        int x = 3;
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
