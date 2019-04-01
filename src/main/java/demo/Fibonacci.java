package demo;

/**
 * 斐波那契数列
 *
 * @author huang
 * @date 2019/3/29
 */
public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return n;
        int third = 0;
        int first = 1, second = 2;
        for (int i = 3; i < n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     *
     * @param number
     */
    int JumpFloorII(int number) {
        return 1 << --number;//2^(number-1)用位移操作进行，更快
    }

    public static String replaceSpace(String str) {
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")) {
                out.append("%20");
            } else {
                out.append(b);
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("wo shuai bu shuai"));
        System.out.println(fibonacci(-1));
    }
}
