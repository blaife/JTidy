package study.blaife.algorithms.sort;

import study.blaife.algorithms.sort.example.InsertionSort;
import study.blaife.algorithms.sort.example.SelectionSort;
import study.blaife.algorithms.sort.example.ShellSort;
import study.blaife.algorithms.sort.example.merge.BottomUpMergeSort;
import study.blaife.algorithms.sort.example.merge.TopDownMergeSort;
import study.blaife.algorithms.util.RandomUtil;
import study.blaife.algorithms.util.Stopwatch;

/**
 * @Description: 算法比较
 * @Author: magd39318
 * @Date: 2021/10/26 19:27
 */
public class SortCompare {

    public static long time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch(alg);
        timer.start();
        if ("Insertion".equalsIgnoreCase(alg)) {
            InsertionSort.sort(a);
        } else if ("Selection".equalsIgnoreCase(alg)) {
            SelectionSort.sort(a);
        } else if ("Shell".equalsIgnoreCase(alg)) {
            ShellSort.sort(a);
        } else if ("TopDownMerge".equalsIgnoreCase(alg)) {
            TopDownMergeSort.sort(a);
        } else if ("BottomUpMerge".equalsIgnoreCase(alg)) {
            BottomUpMergeSort.sort(a);
        }
        timer.stop();
        return timer.getLastTaskTimeMillis();
    }

    public static long timeRandomInput(String alg, int N, int T) {
        long total = 0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = RandomUtil.uniform(0.1, 0.2);
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = "Insertion";
        String alg2 = "Selection";
        String alg3 = "Shell";
        String alg4 = "TopDownMerge";
        String alg5 = "BottomUpMerge";

        System.out.println(timeRandomInput(alg1, 1000, 1000));
        System.out.println(timeRandomInput(alg2, 1000, 1000));
        System.out.println(timeRandomInput(alg3, 1000, 1000));
        System.out.println(timeRandomInput(alg4, 1000, 1000));
        System.out.println(timeRandomInput(alg5, 1000, 1000));


    }
}
