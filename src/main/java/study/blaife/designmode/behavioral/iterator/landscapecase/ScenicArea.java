package study.blaife.designmode.behavioral.iterator.landscapecase;

/**
 * @Description: 抽象聚合：景区
 * @Author: magd39318
 * @Date: 2021/10/9 14:04
 */
public interface ScenicArea {

    /**
     * 新增
     * @param landscape
     */
    void add(Landscape landscape);

    /**
     * 删除
     * @param landscape
     */
    void remove(Landscape landscape);

    /**
     * 获取迭代
     * @return
     */
    ScenicAreaIterator getIterator();

}
