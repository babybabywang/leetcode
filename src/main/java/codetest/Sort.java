package codetest;

/**
 * 按照思路练习排序算法
 *
 * @author huang
 * @date 2019/3/29
 */
public class Sort {

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {7, 3, 6, 2, 90, 23, 11};
        int[] ints = quickSort(a, 0, a.length - 1);
        int[] ints1 = chooseSort(a, a.length);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i] + " ");
        }
    }

    /**
     * 冒泡排序
     *
     * @param a
     * @param n
     * @return
     */
    static int[] bufferSort(int[] a, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    /**
     * 快速排序---挖坑加分治法
     *
     * @param a
     * @param low
     * @param high
     * @return
     */
    static int[] quickSort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (start < end) {
            //从右向左比较
            while (start < end && key <= a[end]) {
                end--;
            }
            //如果key>=a[end]，将小于key的a[end]和a[start]替换
            if (key >= a[end]) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //从左到右
            while (start < end && key >= a[start]) {
                start++;
            }
            //如果key<=a[start],则将a[start]和a[end]换位置
            if (key <= a[start]) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
        }
        //结束后得到左边值都小于key，右边都大于key，然后在利用分治算法分别算出左边右边
        if (low < start) {
            quickSort(a, low, start - 1);
        }
        if (high > end) {
            quickSort(a, end + 1, high);
        }
        return a;
    }

    static int[] chooseSort(int[] a, int n) {
        int i, j, minIndex;
        for (i = 0; i < n; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
