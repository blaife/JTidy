package study.blaife.basic.stream.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 测试group方法
 * @Author: magd39318
 * @Date: 2021/9/23 14:55
 */
public class GroupTest {

    public static void main(String[] args) {
        List<ParamOne> list = initList();
        Map<ParamTop, Double> b = list.stream()
                .collect(Collectors.groupingBy(
                        a -> new ParamTop(a.getCapclearCode(), a.getAgencyNo(), a.getProductCode())
                        , Collectors.averagingInt(a -> Integer.parseInt(a.getDay()))));
        System.out.println(b);
        ParamTop ta = new ParamTop("c2", null, "p1");
        System.out.println(b.get(ta));
    }


    private static List<ParamOne> initList() {
        List<ParamOne> list = new ArrayList<>();
        list.add(new ParamOne("c1", "a1", "p1", "1"));
        list.add(new ParamOne("c2", null, "p1", "2"));
        list.add(new ParamOne("c3", "a1", "p1", "3"));
        list.add(new ParamOne("c4", "a4", "p4", "4"));
        list.add(new ParamOne("c5", "a5", "p2", "5"));
        list.add(new ParamOne("c1", "a7", "p1", "6"));
        list.add(new ParamOne("c1", "a6", "p1", "7"));
        list.add(new ParamOne("c1", "a1", "p7", "8"));
        list.add(new ParamOne("c4", "a2", "p1", "9"));
        list.add(new ParamOne("c1", "a2", "p9", "10"));
        list.add(new ParamOne("c2", "a9", "p1", "12"));
        return list;
    }
}
