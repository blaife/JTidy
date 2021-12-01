package study.blaife.algorithms.sort.example.merge;

import study.blaife.algorithms.sort.SortFrame;

import java.util.Arrays;

/**
 * @Description: 自底向上的归并算法
 * @Author: magd39318
 * @Date: 2021/12/1 18:48
 */
public class BottomUpMergeSort extends SortFrame {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz=sz+sz) {
            for (int lo = 0; lo < N-sz; lo+=sz+sz) {
                OnSideSort.merge(a, lo, lo+sz, Math.min(lo+sz+sz, N));
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] compareable = new Comparable[]{'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X','A', 'M', 'P', 'L', 'E',};
        sort(compareable);
        assert isSorted(compareable);
        show(compareable);
    }
}
