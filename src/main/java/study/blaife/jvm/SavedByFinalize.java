package study.blaife.jvm;

/**
 * 判断对象是否被GC
 *
 * 一个对象没有引用链不代表它会马上被GC，还要通过判断是否覆盖并执行过Finalize方法来决定是否有必要延迟处死，
 * 只有当它没有执行过Finalize方法并且在Finalize方法中自救成功，才能保证不被GC，
 * 但是当第二次GC的时候因为执行过Finalize方法，所以已经失去了自救的机会，就会被GC，此时才能证明该对象真的死了！
 *
 * @author: magd39318
 * @date: 2022/3/24 10:14
 */
public class SavedByFinalize {

    public static SavedByFinalize sbf = null;

    public void isAlive() {
        System.out.println("I am alive");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalized method is execute");
        SavedByFinalize.sbf = this;// 自救
    }

    public static void main(String[] args) throws Throwable {
        sbf = new SavedByFinalize();

        /**
         * 对象第一次被GC
         */
        sbf = null;// 此时可以被回收
        System.gc();// 第一次进行垃圾回收，此时因为覆盖了Finalized方法并进行自救，所以gc失败
        Thread.sleep(1000);// 因为Finalized优先级低，所以需要等待它执行
        if (sbf != null) {
            sbf.isAlive();
        } else {
            System.out.println("I am dead");
        }

        /**
         * 对象第二次被GC
         */
        sbf = null;// 此时可以被回收
        System.gc();// 第一次进行垃圾回收，此时因为Finalized方法已经执行过了，所以gc成功
        Thread.sleep(1000);// 因为Finalized优先级低，所以需要等待它执行
        if (sbf != null) {
            sbf.isAlive();
        } else {
            System.out.println("I am dead");
        }
    }
}
