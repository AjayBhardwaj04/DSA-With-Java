package Bit_Magic.LeetCodes;

public class leetCode2 {
    public  static int findeNum(int[] nums){
        int ans = 0;
        for (int num : nums){
            ans = ans ^ num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {12,12,1,2,13,2,2,3,};
        System.out.println(findeNum(ans));
    }
}
