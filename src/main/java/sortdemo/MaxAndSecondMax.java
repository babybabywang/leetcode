package sortdemo;

/**
 * 快速找出数组中的最大数、第二大数
 * @author huang
 * @date 2019/3/29
 */
public class MaxAndSecondMax {
    static void getSecondMaxNumber(int []a,int n){
        int i,max,secondMax;
        max=a[0];
        secondMax=0;
        for ( i = 1; i < n; i++) {
            if (max<a[i]){
                secondMax=max;
                max=a[i];
            }else {
                if (a[i]>secondMax){
                    secondMax=a[i];
                }
            }
        }
        System.out.println(max+":"+secondMax);
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 1, 3, 8, 5, 9};
        getSecondMaxNumber(a,a.length);
    }
}
