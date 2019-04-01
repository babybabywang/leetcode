package sortdemo;

/**
 * 直接选择排序
 * 直接选择排序和直接插入排序类似，都将数据分为有序区和无序区，所不同的是直接插入排序是将无序区的第一个元素直接插入到有序区以形成一个更大的有序区，
 * 而直接选择排序是从无序区选一个最小的元素直接放到有序区的最后。
 * <p>
 *  
 * <p>
 * 设数组为a[0…n-1]。
 * <p>
 * 1.      初始时，数组全为无序区为a[0..n-1]。令i=0
 * <p>
 * 2.      在无序区a[i…n-1]中选取一个最小的元素，将其与a[i]交换。交换之后a[0…i]就形成了一个有序区。
 * <p>
 * 3.      i++并重复第二步直到i==n-1。排序完成。
 */
public class ChooseSort {
    static int[] chooseSort(int[] a, int n) {
        int i, j, minIndex;
        for (i = 0; i < n; i++) {
            //将i设为最小索引值
            minIndex = i;
            for (j = i + 1; j < n; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 1, 8, 6, 9};
        int[] arr = chooseSort(a, a.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
