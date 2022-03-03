package study.blaife.basic.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * parallelStream 测试
 *
 * @author: magd39318
 * @date: 2022/2/28 13:25
 */
public class ParallelStreamTest {

    /**
     * 执行顺序测试
     */
    public void orderTest() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("3");

        list.parallelStream().forEach(a-> System.out.println(a));
        System.out.println("x");
    }


    /**
     * 多线程中对 公共arrayList 处理的测试
     * 最终得到的 addList 会小于等于原List
     */
    @Test
    public void ForEachAddTest() {
        List<String> basicList = new ArrayList<>();
        for (int i = 0; i < 100; i ++) {
            basicList.add("B" + i);
        }

        List<String> addList = new ArrayList<>();
        basicList.parallelStream().forEach(basic -> {
            addList.add(basic + "_ADD");
        });
        System.out.println(basicList.size());
        System.out.println(addList.size());
    }
}
