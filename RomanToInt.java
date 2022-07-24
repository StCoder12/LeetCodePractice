package practice.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt { //Code to convert roman to integer
    public int romanToInt(String roman){
        Integer sum = 0;
        String[] arr = roman.split(""); //create a string array
        for(int i=arr.length-1 ; i >= 0; i--){ //start from the unit's place
            int  eleVal = romanConversion().get(arr[i]) ;
            if(i == arr.length -1){ //for first lement just add up with sum
                sum = sum + eleVal;
                continue;
            }
                if(eleVal < romanConversion().get(arr[i+1])) { //if current element is smaller than the right side element,
                sum = sum - eleVal; //subtract the value from sum
                continue;
                }else {
                sum = eleVal + sum; // else add in the sum
                continue;
                }
        }
        System.out.println(sum);
        return sum;
    }
    private HashMap<String,Integer> romanConversion(){ // create a hashmap with the keys as roman numbers and value as integer
        HashMap<String,Integer> romanValues = new HashMap<String,Integer>();
        romanValues.put("I",1);
        romanValues.put("V",5);
        romanValues.put("X",10);
        romanValues.put("L",50);
        romanValues.put("C",100);
        romanValues.put("D",500);
        romanValues.put("M",1000);
        return romanValues;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String num = sc.nextLine();
            RomanToInt obj = new RomanToInt();
            obj.romanToInt(num);
        }

}