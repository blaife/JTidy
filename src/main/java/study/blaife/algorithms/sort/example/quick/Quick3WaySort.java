package study.blaife.algorithms.sort.example.quick;

import study.blaife.algorithms.sort.SortFrame;

/**
 * @Description: 三项切分的快速排序
 * @Author: magd39318
 * @Date: 2021/12/30 19:47
 */
public class Quick3WaySort extends SortFrame {



    public static void sort(Comparable[] a) {
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            } else if (cmp > 0) {
                exch(a, i, gt--);
            } else {
                i++;
            }
            sort(a, lo, lt - 1);
            sort(a, gt + 1, hi);
        }
    }


    public static void main(String[] args) {
        Comparable[] compareable = new Comparable[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        sort(compareable);
        assert isSorted(compareable);
        show(compareable);
    }
}
