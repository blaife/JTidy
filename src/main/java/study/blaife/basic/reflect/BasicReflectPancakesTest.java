package study.blaife.basic.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 反射基础使用的测试类
 * @Author: magd39318
 * @Date: 2021/8/10 11:30
 **/
public class BasicReflectPancakesTest {

    @Test
    public void getClassTest() {
        Customer customer = new Customer();

        // 获取类的基本信息
        Class<? extends Customer> customerClass = customer.getClass();
        System.out.println("简单类名为：" + customerClass.getSimpleName());
        System.out.println("包名为：" + customerClass.getPackage());
        System.out.println("类名为：" + customerClass.getName());
    }

    @Test
    public void getFieldTest() {

        Customer customer = new Customer(100000001,"张三", 17);

        // 获取类的基本信息
        Class<? extends Customer> customerClass = customer.getClass();

        // 获取字段列表信息
        /** @notice 不加参数的getFields只能获取public类型的参数 */
        System.out.println("所有字段为：" + Arrays.asList(customerClass.getFields()));
        /** @notice 含有Declared的方法不会获取其父类中的参数 */
        System.out.println("所有字段为：" + Arrays.asList(customerClass.getDeclaredFields()));

        // 获取对应字段并取值
        try {
            Field id = customerClass.getDeclaredField("id");
            System.out.println("id 字段格式为：" + id);
            id.setAccessible(true);
            System.out.println("customer 对象中 id 的值为：" + id.get(customer));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getMethodTest() {
        Customer customer = new Customer(100000001,"张三", 17);

        // 获取类的基本信息
        Class<? extends Customer> customerClass = customer.getClass();

        // 获取方法列表
        System.out.println("方法列表为：" + Arrays.asList(customerClass.getMethods()));
        System.out.println("方法列表为：" + Arrays.asList(customerClass.getDeclaredMethods()));

        // 执行方法内容
        try {
            Method getName = customerClass.getMethod("getName");
            Class<?> returnType = getName.getReturnType();
            System.out.println("getName返回值类型为：" + returnType);
            Class<?>[] paramType = getName.getParameterTypes();
            System.out.println("getName的参数列表为：" + Arrays.asList(paramType));
            Object getNameResult = getName.invoke(customer);
            System.out.println("getName执行返回值为：" + getNameResult);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAnnotationTest() {
        Customer customer = new Customer(100000001,"张三", 17);

        // 获取类的基本信息
        Class<? extends Customer> customerClass = customer.getClass();
        // 只会获取类上的注解
        System.out.println(Arrays.asList("类上的注解为：" + customerClass.getAnnotations()));

        // 获取字段上的注解
        Field[] fields = customerClass.getFields();
        for (Field field : fields) {
            System.out.println("字段上"+ field.getName() +"的注解为：" + Arrays.asList(field.getAnnotations()));
        }

        // 获取方法上的注解
        Method[] methods = customerClass.getMethods();
        for (Method method : methods) {
            System.out.println("方法"+ method.getName() +"的注解为：" + Arrays.asList(method.getAnnotations()));
        }
    }

}
