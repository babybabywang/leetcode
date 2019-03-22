package leetcode;

/**
 * 14.最长公共前缀
 * @author huang
 * @PACKAGE_NAME leetcode
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/21
 */
public class Four {
    public String longestCommonPrefix(String[] strs) {
        int count;
        for (int i = 0; i < strs.length; i++) {
            for (int j=i+1;j<strs.length;j++){
                boolean contains = strs[i].contains(strs[j].substring(i));
            }
        }
        //TODO 待续
        return null;
    }
}
