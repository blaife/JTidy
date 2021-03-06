/**
 * @Description: 建造者模式
 *
 * 将一个复杂对象的构造与它的标识分离，使同样的构建过程可以创建不同的表示
 *
 * 优点：
 *  1）封装性好，构建与表示分离
 *  2）扩展性好，各个具体的建造者相互独立，有利于系统的解耦
 *  3）客户不必知道产品内部组成的细节，建造者可以对创建过程逐步细化，而不对其他模块产生任何影响，以便于控制细节风险
 *
 * 缺点：
 *  1）产品的组成部分必须相同，这限制了其使用范围
 *  2）如果产品的内部变化复杂，入宫产品内部发生变化，则建造者也要同步修改，后期维护成本较大
 *
 * 结构：
 *  建造者：创建和提供实例
 *  导演：管理建造出来的实例的依赖关系。
 *
 * 应用场景
 *  1)相同的方法，不同的执行顺序，产生不同的结果。
 *  2)多个部件或零件，都可以装配到一个对象中，但是产生的结果又不相同。
 *  3)产品类非常复杂，或者产品类中不同的调用顺序产生不同的作用。
 *  4)初始化一个对象特别复杂，参数多，而且很多参数都具有默认值。
 *
 * @Author: magd39318
 * @Date: 2021/8/25 11:12
 */
package study.blaife.designmode.creational.builder;