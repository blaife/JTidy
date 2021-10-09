package study.blaife.designmode.behavioral.iterator.landscapecase;

/**
 * @Description: 抽象迭代器类 ： 景区
 * @Author: magd39318
 * @Date: 2021/10/9 14:09
 */
public interface ScenicAreaIterator {

    /**
     * 判断是否依旧存在数据
     * @return
     */
    boolean hasNext();

    /**
     * 首位
     * @return
     */
    Landscape first();

    /**
     * 下一个
     * @return
     */
    Landscape next();

    /**
     * 上一个
     * @return
     */
    Landscape previous();

    /**
     * 末位
     * @return
     */
    Landscape last();

}
