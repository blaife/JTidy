/**
 * @Description: 解释器
 *
 * 给分析对象定义一个语言，并定义该语言的文法表示，在设计一公分解析器来解释语言中的句子
 *      也就是说，用编译语言的方式来分析应用中的实例，这种模式实现了文法表达式处理的接口，该接口解释了一个特定的上下文
 *
 * 优点：
 *  扩展性好，由于在解释器模式种使用类来表示语言的文法规则，由此可以通过继承等机制来改变或扩展文法
 *  容易实现，在语法树种的每个表达式节点类都是相似的，所以实现其文法比较容易
 *
 * 缺点：
 *  执行效率低，解释器模式种通常使用大量的循环和递归调用，当要解释的句子较复杂时，其运行速度很慢，且代码的调用过程也比较麻烦
 *  会引起类膨胀，解释器模式中的每条规则，至少需要定义一个类，当包含的文法规则很多时，类的个数将极具增加，导致系统难以管理和维护
 *  可应用的场景比较少，在软件开发中，需要定义语言文法的应用实例非常少，所以这种模式很少被使用到
 *
 * 结构：
 *  抽象表达式（Abstract Expression）角色：定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。
 *  终结符表达式（Terminal Expression）角色：是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。
 *  非终结符表达式（Nonterminal Expression）角色：也是抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 *  环境（Context）角色：通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 *  客户端（Client）：主要任务是将需要分析的句子或表达式转换成使用解释器对象描述的抽象语法树，然后调用解释器的解释方法，当然也可以通过环境角色间接访问解释器的解释方法。
 *
 * @Author: magd39318
 * @Date: 2021/10/11 14:10
 */
package study.blaife.designmode.behavioral.interpreter;