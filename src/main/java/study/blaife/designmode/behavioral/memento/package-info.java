/**
 * @Description: 备忘录模式（快照模式）
 *
 * 在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复原先保存的状态
 *
 * 优点：
 *  提供了一种可以恢复装填的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态
 *  是西安了内部状态的封装，除了创建它的发起人之外，其他对象都不能访问这些状态信息
 *  简化了发起人，发起人不需要管理和保存器内部状态的各个备份，所有状态信息都保存在备忘录中，并由管理者进行管理，这符合单一职责原则
 *
 * 缺点：
 *  资源消耗大，如果要保存的内部状态信息过多或者频繁，这将会占用比较大的内存资源
 *
 * 结构：
 *  发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 *  备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 *  管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * @Author: magd39318
 * @Date: 2021/10/11 10:23
 */
package study.blaife.designmode.behavioral.memento;