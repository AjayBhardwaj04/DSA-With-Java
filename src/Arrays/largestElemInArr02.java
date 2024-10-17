package Arrays;

public class largestElemInArr02 {
    static int largestElement(int arr[]){
        int n = arr.length;
    int lar = arr[0];
        for (int i=0; i<arr.length;i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }

        }
        return lar;
    }

    public static void main(String[] args) {
        int arr[] = {12,23,341,45,65};
        int rep = largestElement(arr);
        System.out.println(rep);
//        System.out.println(largestElement(arr));
//        largestElement();
    }


//    static int getLargestNum(int arr[]) {
//        int n = arr.length;
//        int largest = arr[0]; // Assume the first element is the largest
//
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 23, 454, 345, 3};
//        System.out.println(getLargestNum(arr));
//    }


}
