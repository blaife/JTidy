package study.blaife.algorithms.sort.example.merge;

import study.blaife.algorithms.sort.SortFrame;

/**
 * @Description: 原地归并方法案例
 * @Author: magd39318
 * @Date: 2021/11/19 19:04
 */
public class OnSideSort extends SortFrame {

    /**
     * 位置为 含左不含右
     * 即：设传入值为 [1,3,5,1,4,3,2,5,1] 0 4 9
     * 则合并 [1,3,5,1] [4,3,2,5,1]
     * @param a 数组
     * @param lo 初始位置
     * @param mid 分割位置
     * @param hi 结束位置
     */
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid;
        Comparable[] aux = a.clone();
        for (int k = lo; k < hi; k++) {
            if (i >= mid) {
                a[k] = aux[j++];
            } else if (j >= hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] a = new Comparable[]{1, 3, 4, 2, 5, 7};
        merge(a, 0, 3, 6);
        for (Object o : a) {
            System.out.print(o);
            System.out.print(", ");
        }
    }

}
