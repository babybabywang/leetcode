package leetcode;


/**
 * 回文数
 * @author huang
 * @PACKAGE_NAME leetcode
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/21
 */
public class Two {
    public static boolean isPalindrome(int x) {
        int old=x;
        int res=0;
        if (x<0)
            return false;
        while (x!=0){
            int pop=x%10;
            x/=10;
            res=res*10+pop;
        }
        if (res==old){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
