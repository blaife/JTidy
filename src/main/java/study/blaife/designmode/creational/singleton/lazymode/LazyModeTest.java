package study.blaife.designmode.creational.singleton.lazymode;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @Description: 单例模式-懒汉模式-测试
 * @Author: magd39318
 * @Date: 2021/8/25 14:10
 */
public class LazyModeTest {

    @Test
    public void getNumberForLazyAndUnSafeSingleton() {
        int threadNumber = 10;

        ExecutorService executor = new ThreadPoolExecutor(3, 5, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(10), new LazyModeThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < threadNumber; i++) {
            int finalI = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    LazyAndUnsafeSingleton lazyAndUnsafeSingleton = LazyAndUnsafeSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + ":" + lazyAndUnsafeSingleton);
                }
            });
        }
        executor.shutdown();
    }

    @Test
    public void getNumberForLazyAndSafeSingleton() {
        int threadNumber = 10;

        ExecutorService executor = new ThreadPoolExecutor(10, 20, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5),new LazyModeThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < threadNumber; i++) {
            int finalI = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    LazyAndSafeSingleton lazyAndSafeSingleton = LazyAndSafeSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName() + ":" + lazyAndSafeSingleton);
                }
            });
        }
        executor.shutdown();
    }

    public static void main(String[] args) {
        LazyModeTest lazyModeTest = new LazyModeTest();
        lazyModeTest.getNumberForLazyAndSafeSingleton();
        lazyModeTest.getNumberForLazyAndUnSafeSingleton();
    }
}
