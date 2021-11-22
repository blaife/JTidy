package study.blaife.algorithms.sort.example;

import study.blaife.algorithms.sort.SortFrame;

/**
 * @Description: 插入排序
 *
 * 将其余所有元素都在插入之前向右移动一位
 *
 * 如果数组中倒置的数量小于数据大小的某个倍数，我们说这个数据是部分有序的
 * 典型的部分有序的数据：
 *  数组中的每个元素距离它的最终位置都不远
 *  一个有序的大数组接一个小数组
 *  数组中之后几个元素的位置不正确
 *
 * 平均：比较次数：(N^2)/4  交换次数：(N^2)/4
 * 最坏：比较次数：(N^2)/2  交换次数：(N^2)/2
 * 最好：比较次数：N-1      交换次数：0
 *
 * ***改进，将较大的元素都向右移动而不总是交换两个元素***
 *
 * @Author: magd39318
 * @Date: 2021/10/25 19:16
 */
public class InsertionSort extends SortFrame {

    /**
     * 排序方法
     * @param a
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] compareable = new Comparable[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        sort(compareable);
        assert isSorted(compareable);
        show(compareable);
    }
}
