package leetcode;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.function.IntConsumer;

/**
 * 26.删除排序数组中的重复项
 *
 * @author huang
 * @PACKAGE_NAME leetcode
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/22
 */
public class Six {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * 28.实现strStr()
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        if ("".equals(needle)) return 0;
        String c = "";
        for (int i = 0; i < haystack.length(); i++) {
            if (n + i <= haystack.length()) {
                c = haystack.substring(i, n + i);
            }
            if (c.equals(needle)) return i;
        }
        return -1;
    }

    /**
     * 搜索插入位置
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[0] > target) return 0;
            if (nums[nums.length - 1] < target) return nums.length;
            if (nums[i] < target) j = i;
        }
        return j + 1;
    }

    /**
     * 53.最大子序和
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    /**
     * 最后一个单词的长度
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            //过滤末尾空格
            if (s.charAt(i) == ' ' && len == 0) {
                continue;
                //碰到最后一个单词，开始计数
            } else if (s.charAt(i) != ' ') {
                len++;
                //再次碰到空格，单词计数完毕结束循环
            } else {
                break;
            }
        }
        return len;
    }

    /**
     * 66.加一
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int res = 0;
        int index = digits.length - 1;
        if (digits[index] < 9) {
            digits[index] += 1;
            return digits;
        }
        while (digits[index] == 9) {
            digits[index] = 0;
            if (index == 0) {
                int newLen = digits.length + 1;
                int[] newDigits = new int[newLen];
                for (int i = 0; i < newLen; i++) {
                    newDigits[i] = (i == 0) ? 1 : 0;
                }
                return newDigits;
            }
            --index;
            res = 1;
        }
        digits[index] = digits[index] + res;
        return digits;
    }

    /**
     * 只出现一次的数字
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int i = 0;
        int res = 0;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) res = nums[i];
            else {
                nums[i] = nums[j];
                i++;
            }
        }
        return res;
    }

    /**
     * 二进制求和
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        Integer numA = Integer.valueOf(a);
        Integer numB = Integer.valueOf(b);

        return null;
    }

    /**
     * 69.x的平方根
     *
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int result = 0;
        if(x*x/4==x)return x/2;
        for (int i = 1; i <= x / i; i ++) {
            result = i;
        }
        return result;
    }

    /**
     * 70.爬楼梯
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
       if (n<=2)return n;
       int tmp=1;
       int copy;
       int res=2;
        for (int i = 3; i <= n; i++) {
            copy=res;
            res+=tmp;
            tmp=copy;
        }
        return res;
    }

    /**
     * 88.合并两个有序数据
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2,0,nums1,m,n);
            Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 8, 9,0,0,0};
        int[] nums2={3,5,6};
        merge(nums1,3,nums2,3);
        //System.out.println(climbStairs(10));
        //System.out.println(mySqrt(25));
        addBinary("11", "10");


       /* System.out.println(singleNumber(nums));
        System.out.println(lengthOfLastWord("hello "));

        System.out.println(maxSubArray(nums));
        System.out.println(searchInsert(nums, 5));*/
        //  System.out.println(strStr("hello", "ll"));
        //int [] nums={1,1,2,3,4};
        //System.out.println(removeDuplicates(nums));
    }
}
