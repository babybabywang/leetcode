package leetcode;

import java.util.HashMap;

/**
 * 13.罗马数字转整数
 *
 * @author huang
 * @PACKAGE_NAME leetcode
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/21
 */
public class Three {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res=0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            Integer x = map.get(cs[i]);
            if (i+1<cs.length&&map.get(cs[i+1])>x){
                res-=x;
            }else{
                res+=x;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XMXX"));
    }
}
