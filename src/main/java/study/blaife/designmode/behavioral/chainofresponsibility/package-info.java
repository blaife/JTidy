/**
 * @Description: 责任链模式
 *
 * 为了避免请求发送者与多个请求处理者耦合在一起
 *  于是将所有请求的处理者通过前一对象记住下一个对象的引用而连城一条链；当有请求发生时，可将请求沿着这条链传递，知道有对象处理它为止
 *
 * 优点：
 *  1）降低了对象之间的耦合度，该模式使得一个对象无须知道到底哪一个对象处理其请求以及链的结构，发送者和接收者也无须拥有对方的明确信息
 *  2）曾倩了系统的可扩展性，可以根据需要增加新的请求处理类，满足开闭原则
 *  3）增强了给对象指派职责的灵活性，当工作流程发生变化，可以动态地改变链内的成员或者调用他们的次序，也可动态地新增或删除责任
 *  4）责任链简化了对象之间的连接，每个对象只需爆出一个指向其后继者的引用，不需爆出其他所有处理者的引用
 *  5）责任分担，每个类只需处理自己该处理的工作，不处理的传递给下一个对象完成，明确各类的责任范围，符合类的单一职责原则
 *
 * 缺点：
 *  1）不能保证每个请求一定被处理，由于一个请求没有明确的接收者，所以不能保证它一定会被处理，该请求可能一直传到链的尾端都得不到处理
 *  2）对比较长的责任链，请求的处理可能设计多个处理对象，系统性能将受到一定影响
 *  3）职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于指责链的错误设置而倒置系统出错，如可能造成循环调用
 *
 * 结构：
 *  抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 *  具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 *  客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 *
 * 责任链模式的本质使解耦请求与处理，让请求在处理链中能进行传递与被处理；
 * 理解责任链模式应当理解其模式，而不是其具体体现；
 * 责任链模式的独到指出是将其节点处理者合成了链式结构，并允许自身决定是否进行请求处理或转发，相当于让请求流动起来；
 *
 *
 * @Author: magd39318
 * @Date: 2021/9/28 11:08
 */
package study.blaife.designmode.behavioral.chainofresponsibility;