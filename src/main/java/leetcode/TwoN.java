package leetcode;

/**
 * @author huang
 * @PACKAGE_NAME leetcode
 * @PROJECT_NAME leetcodetest
 * @date 2019/3/28
 */
public class TwoN {
    static int panduan(int i) {
        int x = 0;
        while (i > 1) {
            i = i >> 1;
            x++;
        }
        return x;
    }



    /**
     * 快排
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int[] quit(int arr[], int low, int high) {
        int l = low;
        int h = high;
        int key = arr[l];  //先找出一个数作为基准数（这里取数组最中间的一位）

        while (l < h) {
            while (l < h && arr[h] >= key) h--; //从后向前：寻找比基准数小的数据，如果找到，停下来
            if (l < h) {  //“探测”到了符合要求的数据，则交换数据，继续顺着方向寻找
                arr[l] = arr[h];
                l++;
            }
            while (l < h && arr[l] <= key) l++; //从前向后：寻找比基准数大的数据，如果找到，停下来
            if (l < h) { ////“探测”到了符合要求的数据，则交换数据，继续顺着方向寻找
                arr[h] = arr[l];
                h--;
            }
        }
        arr[l] = key;
        if (l > low) quit(arr, low, l - 1);
        if (h < high) quit(arr, h + 1, high);
        return arr;
    }

    public static void main(String[] args) {
        int [] a={1,4,2,6,3,9,7,10};
        System.out.println(panduan(8));
    }
}
