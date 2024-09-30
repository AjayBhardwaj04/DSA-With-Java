package Recusion;
//Subset Sum Problem (Recursive Solution) (Medium)
public class subsetSumProb {
    public static int subsetSum(int arr[], int num,int sum){
        if (num == 0 || sum == 0){
            return (sum == 0) ? 1 : 0;
        }
        if (arr[num - 1] > sum){
            return subsetSum(arr,num-1,sum);

        }
        return subsetSum(arr, num-1,sum)+
        subsetSum(arr,num-1,sum-arr[num-1]);
    }

    public static void main(String[] args) {
        int arr[] = {10,15,20};
        int sum = 25;
        int num = arr.length;

        System.out.println(subsetSum(arr,sum,num));
    }

}
