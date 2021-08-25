package study.blaife.basic.lambda;

/**
 *
 * 关于lambda表达式的学习
 *
 * @Author: magd39318
 * @Date: 2021/7/27 14:02
 **/
public class LambdaBasicStudy {

    /*----------------------------------------------------------------*/
    /*                     一个lambda表达式分为三部分                    */
    /*                     参数列表、操作符、lambda体                    */
    /*                  (parameters) -> {statements;}                 */
    /*----------------------------------------------------------------*/

    public static void main(String[] args) {
        /* 基本的使用， 通过lambad表达式*/

        /* 类型声明且有大括号的返回与语句 */
        MathOperation addition = (int x, int y) -> { return x + y; };
        /* 无类型声明且无大括号的返回与语句 */
        MathOperation subtraction = (x, y) ->  x - y; ;

        System.out.println(addition.operation(1, 2));
        System.out.println(subtraction.operation(3, 2));
    }

    /**
     * 数学操作接口
     * Lambda表达式只支持函数式接口  也就是只有一个抽象方法的接口
     * 可以使用注解 @FunctionalInterface 进行编译期的校验
     */
    interface MathOperation {
        /**
         * 比较方法
         * @param x
         * @param y
         * @return
         */
        int operation(int x, int y);
    }

}
