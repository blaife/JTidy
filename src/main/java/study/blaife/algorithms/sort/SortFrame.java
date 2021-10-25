package study.blaife.algorithms.sort;

import study.blaife.algorithms.util.In;


/**
 * @Description: 排序框架
 * @Author: magd39318
 * @Date: 2021/10/19 18:29
 */
public abstract class SortFrame {

    /**
     * 排序方法
     * @param a
     */
    public static void sort(Comparable[] a) {

    }

    /**
     * 比较
     * @param v
     * @param w
     * @return
     */
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换位置
     * @param a
     * @param i
     * @param j
     */
    protected static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 展示
     * @param a
     */
    protected static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    /**
     * 测试数组元素是否有序
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        // assert 断言
        assert isSorted(a);
        show(a);
    }

}
