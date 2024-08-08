package Bit_Magic.LeetCodes;

public class leetCode {
    public static  String addBinary(String a , String b){
        // Create a StringBuilder to efficiently construct the result
        StringBuilder sb = new StringBuilder();

        // Initialize a carry variable to track carryover
        int carry = 0;

        // Pointers to iterate through the strings from the end
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Iterate while there are still digits to process or a carry exists
        while (i >= 0 || j >= 0 || carry == 1) {
            // Calculate the current sum, including the carry
            int sum = carry;

            // Add the corresponding digit from string a if available
            if (i >= 0) {
                carry += a.charAt(i--) - '0'; // Convert char to int
            }

            // Add the corresponding digit from string b if available
            if (j >= 0) {
                carry += b.charAt(j--) - '0'; // Convert char to int
            }

            // Append the least significant bit of the sum to the result
            sb.append(carry % 2);

            // Calculate the carry for the next iteration
            carry /= 2;
        }

        // Reverse the StringBuilder to get the correct order of bits
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
    }


