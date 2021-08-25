package study.blaife.basic.reflect;


import study.blaife.basic.reflect.annotation.CustomerClass;
import study.blaife.basic.reflect.annotation.CustomerField;
import study.blaife.basic.reflect.annotation.CustomerMethod;

/**
 * 基本的测试类 《顾客》
 *
 * @Author: magd39318
 * @Date: 2021/8/10 11:28
 **/
@CustomerClass
public class Customer {

    private long id;
    @CustomerField
    public String name;
    @CustomerField
    public int age;

    public Customer() {
    }

    public Customer(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    @CustomerMethod
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @CustomerMethod
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
