package leetcode;

import java.util.Collections;
import java.util.concurrent.Semaphore;

/**
 * @author huang
 * @PACKAGE_NAME leetcode
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/21
 */
public class One {
    /**
     * 非公平锁
     */
    static final Semaphore semaphore=new Semaphore(10,false);
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] ints = twoSum(nums, 18);
        System.out.println(ints[0]+","+ints[1]);
    }
}
