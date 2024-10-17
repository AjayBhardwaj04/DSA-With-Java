package Arrays;

public class largestElmInArr {
    static int getLargestNum(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {//checking all element in Array 
            boolean flag = true;//re

            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return arr[i];

            }


        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 454, 345, 3};
        System.out.println(getLargestNum(arr));
    }
}
