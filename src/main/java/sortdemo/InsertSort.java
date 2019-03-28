package sortdemo;

/**
 * 手撕算法---插入排序
 * 直接插入排序(Insertion Sort)的基本思想是：每次将一个待排序的记录，按其关键字大小插入到前面已经排好序的子序列中的适当位置，直到全部记录插入完成为止。
 *
 *  
 *
 * 设数组为a[0…n-1]。
 *
 * 1.      初始时，a[0]自成1个有序区，无序区为a[1..n-1]。令i=1
 *
 * 2.      将a[i]并入当前的有序区a[0…i-1]中形成a[0…i]的有序区间。
 *
 * 3.      i++并重复第二步直到i==n-1。排序完成。
 */
public class InsertSort {
    static int[] insertSort(int[] a, int n) {
        int i, j;
        for (i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                int temp = a[i];
                for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                    a[j + 1] = a[j];
                }
                a[j + 1] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 1, 3, 8, 5, 9};
        int[] ints = insertSort(a, a.length);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }
}
