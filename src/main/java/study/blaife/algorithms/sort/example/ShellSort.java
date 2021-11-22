package study.blaife.algorithms.sort.example;

import study.blaife.algorithms.sort.SortFrame;

/**
 * @Description: 希尔排序 - 一种基于插入排序的快速排序算法
 *
 * 交换不相邻的元素以对数组的局部进行排序，并最终用插入排序将局部有序的数组排序
 *      任意间隔为 h 的元素都是有序的
 *
 * 希尔排序是唯一无法准确描述其对于乱序的数组的性能特征的排序方法
 *
 * @Author: magd39318
 * @Date: 2021/11/3 18:40
 */
public class ShellSort extends SortFrame {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                show(a);
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Comparable[] compareable = new Comparable[]{'1', '4', '8', '7', '6', '9', '4', '3', '5'};
        sort(compareable);
        assert isSorted(compareable);
        show(compareable);

        /*  1 4 8 7 6 9 4 3 5
            1 4 8 7 6 9 4 3 5
            1 4 8 7 6 9 4 3 5
            1 4 4 7 6 9 8 3 5
            1 4 4 3 6 9 8 7 5
            1 4 4 3 5 9 8 7 6
            1 4 4 3 5 9 8 7 6
            1 4 4 3 5 9 8 7 6
            1 3 4 4 5 9 8 7 6
            1 3 4 4 5 9 8 7 6
            1 3 4 4 5 9 8 7 6
            1 3 4 4 5 8 9 7 6
            1 3 4 4 5 7 8 9 6
            1 3 4 4 5 6 7 8 9  */
    }
}
