package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * easy--118杨辉三角
 *
 * @author huang
 * @date 2019/3/29
 */
public class Pascal {
    public int numPairsDivisibleBy60(int[] time) {
        int[] record = new int[60];
        int count = 0;
        for(int t : time){
            t %= 60;        //求这个时间的余数
            if(t != 0)
                count += record[60 - t];    //如果时间余数不为0，找出相加为0的余数总和相加
            else count += record[t];        //如果为0，加其他为0的数
            record[t] ++;
        }
        return count;
    }
}
