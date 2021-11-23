package study.blaife.algorithms.sort.example.merge;

import study.blaife.algorithms.sort.SortFrame;

import java.util.Arrays;

/**
 * @Description: 自顶向下的归并排序
 * @Author: magd39318
 * @Date: 2021/11/23 19:18
 */
public class TopDownMergeSort extends SortFrame {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        // 对小规模的数组使用其他排序方式来提高程序的运行速度
        if (hi - lo < 15) {
            // 这里是调用 jdk 对应的指定位置排序的方式，
            // 也可以使用插入排序（在小规模数据时插入排序速度比较好）
            Arrays.parallelSort(a, lo, hi);
        } else {
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);
            sort(a, mid, hi);
            OnSideSort.merge(a, lo, mid, hi);
        }
    }

    public static void main(String[] args) {
        Comparable[] compareable = new Comparable[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E','S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P',};
        sort(compareable);
        assert isSorted(compareable);
        show(compareable);
    }
}
