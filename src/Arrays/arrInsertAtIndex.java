package Arrays;

import java.util.ArrayList;

public class arrInsertAtIndex {
    public static void insertAtIndex  (int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        if (index < 0 || index >= sizeOfArray) {
            System.out.println("Invalid index!");
            return;
        }

        int[] newArr = new int[sizeOfArray + 1];

        for (int i = 0; i < sizeOfArray; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        arr = newArr;


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sizeOfArray = arr.length;
        int element = 90;
        int index = 5;



        insertAtIndex(arr, sizeOfArray, element, index);

        System.out.println("Array after insertion:");
        for (int i = 0; i < sizeOfArray + 1; i++) {
            System.out.print(arr[i] + " ");

        }


    }
}
