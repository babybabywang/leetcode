package leetcode;

import java.util.HashMap;

/**
 * 20.有效的括号
 * @author huang
 * @PACKAGE_NAME leetcode
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/21
 */
public class Five {
    public static boolean isValid(String s) {
        HashMap<Character,Character>rule=new HashMap<Character, Character>();
        rule.put('(',')');
        rule.put('{','}');
        rule.put('[',']');
        boolean flag=false;
        if (s.equals("")){
            return true;
        }
        char[] cs = s.toCharArray();
        if (cs.length%2!=0){
            return false;
        }
        for (int i = 0; i < cs.length/2; i++) {
            Character c = rule.get(cs[i]);
            if (c==null)
                return false;
            if (i+1<(cs.length/2)&&cs[i+1]==c){
                flag=true;
            }else if (cs[cs.length-1]==c){
                flag=true;
            }else {
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
}
