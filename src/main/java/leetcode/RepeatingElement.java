package leetcode;

import java.util.HashSet;

/**
 * easy---217存在重复元素
 *
 * @author huang
 * @date 2019/3/29
 */
public class RepeatingElement {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < len; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
