package study.blaife.basic.stream;

import java.util.Arrays;
import java.util.List;

/**
 * stream 流式编程学习
 *
 * @Author: magd39318
 * @Date: 2021/7/28 10:43
 **/
public class StreamGeneral {

    /*
    * Stream 并不是容器，它只是对容器的功能进行可强化
    * 一个Stream中分为三个部分，分别是创建，中间操作，终端操作
    *   可以由集合、数组、值、函数创建
    *   中间操作包括断言、排序、截断、跳过、转换等
    *   终端操作包括内部迭代、收集等
    */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3");
        System.out.println(list.stream().skip(1).limit(1).findFirst().get());
    }


}
