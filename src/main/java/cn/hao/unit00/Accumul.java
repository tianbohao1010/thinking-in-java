package cn.hao.unit00;

import java.util.Arrays;

/**
 * Created by Tianbohao on 2018/6/12.
 */
public class Accumul {

    public static String accum(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        for(int i = 0; i < chars.length; i++){
            String upperChar =  String.valueOf(chars[i]).toUpperCase();
            String lowerChar =  String.valueOf(chars[i]).toLowerCase();

            result += upperChar;
            int j = i;
            while (j-->0){
                result+=lowerChar;
            }

            if(i != chars.length-1){
                result+="-";
            }
        }

        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result = new int[]{i,j};
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(Accumul.accum("tAnk"));
        int[] nums = new int[]{2, 9, 11, 7, 15};
        int target = 9;
        System.out.println(Accumul.twoSum(nums,target)[0]+","+Accumul.twoSum(nums,target)[1]);
    }
}
