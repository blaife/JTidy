package study.blaife.algorithms.sort;

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
        System.out.println(timeRandomInput(alg1, 1000, 1000));
        System.out.println(timeRandomInput(alg2, 1000, 1000));
    }
}
