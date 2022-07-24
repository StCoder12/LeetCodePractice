package practice.leetcode;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int orgNum = x;
        int reverse = 0;
        if (x < 0) { // for negative numbers, it is always false
            return false;
        }
        while (x != 0) {
            Integer rem = x % 10; //find mod of number to extract the digit
            System.out.println("remainder  " + rem + "  num value " + x);
            reverse = reverse * 10 + rem; // add the digit to the sum and in the next iteration multiply the sum by 10 to shift the placeholder
            System.out.println("reversed num " + reverse); // of the digit
            x = x / 10; // go to the next digit on your left
        }
        if (orgNum == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        Palindrome obj = new Palindrome();
        obj.isPalindrome(num);
    }
}
