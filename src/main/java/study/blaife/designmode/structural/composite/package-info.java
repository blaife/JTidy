/**
 * @Description: 组合模式
 *
 * 有时又叫做 “部分-整体（Part-Whole）模式”
 * 它是一种将对象组合成树状的层级结构的模式，用来标识“整体-部分”的关系，使用于对单个对象和组合对象具有一致的访问性
 *
 * 优点：
 *  1）组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象还是组合对象，这简化了客户端代码
 *  2）更容易再组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，符合 “开闭原则”
 *
 * 缺点：
 *  1）设计较复杂，客户端需要花费更多时间清理类之间的层级关系
 *  2）不容易限制容器中的构件
 *  3）不容易用继承的方法来增加构建的新工能
 *
 * 结构：
 *  1）抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。
 *      在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，
 *      管理工作由树枝构件完成。（总的抽象类或接口，定义一些通用的方法，比如新增、删除）
 *  2）树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
 *  3）树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。
 *      它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 *
 * *************************************************************
 * 组合模式分为透明式和安全式
 * *************************************************************
 *
 * 透明式：
 *  在抽象构建中声明了子类中的全部方法，所以客户端无须区别树叶对象还是树枝对象，对客户端来说是透明的；
 *  但其缺点是：树叶节点中存在某些不需要的方法（空实现或抛异常），这样会带来一些安全性的问题
 *
 * 安全式：
 *  将管理子构件的方法移到树枝构建中，抽象构件和树叶构件没有对子对象的管理方法，这样就避免了上一种方式的安全性问题；
 *  但是由于叶子和分支有不同的接口，客户端在调用时要知道树叶对象和树枝对象的存在
 *
 * @Author: magd39318
 * @Date: 2021/9/24 9:40
 */
package study.blaife.designmode.structural.composite;