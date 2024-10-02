package Recusion.Problem;

public class powerSet {
    public static void  powerSetRecursion(String str, int index, String curr){

        int n = str.length();
        if (n == index){
            System.out.println(curr);
            return;
        }
        powerSetRecursion(str, index +1, curr + str.charAt(index));
        powerSetRecursion(str,index + 1,curr);
    }

    public static void main(String[] args) {
        String srt = "abcd";
        int index = 0;
        String curr = " ";
//        System.out.println(powerSetRecursion(srt,index,));
        powerSetRecursion(srt,index,curr);
    }
}
