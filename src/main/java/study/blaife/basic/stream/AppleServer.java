package study.blaife.basic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author: magd39318
 * @Date: 2021/8/6 15:16
 **/
public class AppleServer {

    private static List<Apple> appleStore = new ArrayList<>();

    static {
        appleStore.add(new Apple(1, "red", 100, "长沙"));
        appleStore.add(new Apple(2, "red", 84, "长沙"));
        appleStore.add(new Apple(3, "green", 48, "长沙"));
        appleStore.add(new Apple(4, "yellow", 99, "长沙"));
        appleStore.add(new Apple(5, "block", 75, "长沙"));
        appleStore.add(new Apple(6, "red", 16, "长沙"));
    }

    public static void main(String[] args) {
        AppleServer groupStatisticalCase  = new AppleServer();
        groupStatisticalCase.groupTest();
    }

    /**
     * 得到列表中所有颜色为红色，重量大于50的数据
     */
    private void filterTest1() {
        List<Apple> redApple = appleStore.stream()
                .filter(a -> "red".equals(a.getColor()))
                .filter(a -> 50 < a.getWeight())
                .collect(Collectors.toList());
        redApple.stream().forEach(System.out::println);
    }

    /**
     * 将过滤条件提取出来便于定制，作为参数传递进来
     * @param st 例如： a -> "red".equals(a.getColor()) && a.getWeight() > 50
     */
    private void filterTest2(Predicate<? super Apple> st) {
        List<Apple> redApple = appleStore.stream().filter(st).collect(Collectors.toList());
        redApple.forEach(System.out::println);
    }

    private void groupTest() {
        Map<Object, Double> appleGroup = appleStore.stream()
                .collect(Collectors.groupingBy(a -> a.getColor(),
                        Collectors.averagingDouble(a -> a.getWeight())));
        appleGroup.keySet().forEach(a -> System.out.println(a + ":" + appleGroup.get(a)));
    }
}


class Apple {

    private int id;
    private String color;
    private int weight;
    private String origin;

    public Apple() {
    }

    public Apple(int id, String color, int weight, String origin) {
        this.id = id;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
