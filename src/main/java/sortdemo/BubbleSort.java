package sortdemo;

/**
 * 冒泡排序是非常容易理解和实现，，以从小到大排序举例：
 *
 * 设数组长度为N。
 *
 * 1．比较相邻的前后二个数据，如果前面数据大于后面的数据，就将二个数据交换。
 *
 * 2．这样对数组的第0个数据到N-1个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1个位置。
 *
 * 3．N=N-1，如果N不为0就重复前面二步，否则排序完成。
 * ---------------------
 */
public class BubbleSort {
    /**
     * 冒泡排序
     *
     * @param a
     * @param n
     */
    static int[] bubbleSort1(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < n - i; j++) {
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
     * 优化后的冒泡排序
     *
     * @param a
     * @param n
     * @return
     */
    static int[] bubbleSort2(int[] a, int n) {
        int k = n;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < k; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    flag = true;
                }
            }
            k--;
        }
        return a;
    }

    static int[] bufferTest(int[] a) {
        int n = a.length;
       /* int i, j;
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }*/
        int k = n;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int j = 1; j < k; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            k--;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 1, 3, 8, 5, 9};
        int[] ints = bufferTest(a);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }
}
