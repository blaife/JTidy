package study.blaife.algorithms.sort.example.basic;

import study.blaife.algorithms.sort.SortFrame;

/**
 * @Description: 选择排序
 *
 * 1. 找到数组中最小的那个元素
 * 2. 将它和数组中的第一个元素交换位置
 * 3. 再次，在剩下的元素中找到最小的元素
 *
 * 交换次数： N
 * 比较次数： (N^2)/2 --> (N-1)+(N-2)+(N-3)+(N-4)+...+3+2+1 = N(N-1)/2 ~ (N^2)/2
 *
 * @Author: magd39318
 * @Date: 2021/10/25 18:51
 */
public class SelectionSort extends SortFrame {

    /**
     * 排序方法
     * @param a
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }


    public static void main(String[] args) {
        Comparable[] compareable = new Comparable[]{'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E'};
        sort(compareable);
        assert isSorted(compareable);
        show(compareable);
    }
}
