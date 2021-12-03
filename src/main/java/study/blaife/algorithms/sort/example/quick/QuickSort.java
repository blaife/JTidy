package study.blaife.algorithms.sort.example.quick;

import com.sun.istack.internal.NotNull;
import study.blaife.algorithms.sort.SortFrame;

/**
 * @Description: 快速排序
 * @Author: magd39318
 * @Date: 2021/12/2 20:10
 */
public class QuickSort extends SortFrame {


    public static void sort(Comparable[] a) {
        sort(a, 0, a.length);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi-1 <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j);
        sort(a, j+1, hi);
    }

    private static int partition(@NotNull Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i >= hi-1) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j <= lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
        Comparable[] compareable = new Comparable[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        sort(compareable);
        assert isSorted(compareable);
        show(compareable);
    }

}
