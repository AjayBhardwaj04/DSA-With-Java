package Recursion;

public class subsetSumProb {
    public static boolean subsetSum(int arr[], int num, int sum) {
        if (sum == 0) {
            return true;
        }
        if (num == 0) {
            return false;
        }

        if (arr[num - 1] > sum) {
            return subsetSum(arr, num - 1, sum);
        }

        return subsetSum(arr, num - 1, sum) ||
                subsetSum(arr, num - 1, sum - arr[num - 1]);
    }

    public static void main(String[] args) {
        int arr[] = {10, 15, 20};
        int sum = 25;
        int num = arr.length;

        System.out.println(subsetSum(arr, num, sum));
    }
}