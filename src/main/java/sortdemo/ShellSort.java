package sortdemo;

/**
 * 手撕算法---希尔排序
 *
 * @author huang
 * @date 2019/3/29
 */
public class ShellSort {
    void shellSort(int[] a, int n) {
        int i, j, gap;
        //步长
        for (gap = n / 2; gap > 0; gap /= 2) {
            for (i = 0; i < gap; i++) {
                for (j = i + gap; j < n; j += gap) {
                    if (a[j] < a[j - gap]) {
                        int temp = a[j];
                        int k = j - gap;
                        while (k >= 0 && a[k] > temp) {
                            a[k + gap] = a[k];
                            k -= gap;
                        }
                        a[k + gap] = temp;
                    }
                }
            }
        }
    }

    /**
     * 冒泡排序
     */
   static void bufferSort(int[] a, int n) {
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
    }

    public static void main(String[] args) {
        int [] a={7,3,8,9,10,21,2};
        bufferSort(a,a.length);
    }
}
