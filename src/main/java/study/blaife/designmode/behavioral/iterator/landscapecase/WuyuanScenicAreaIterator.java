package study.blaife.designmode.behavioral.iterator.landscapecase;

import java.util.ArrayList;

/**
 * @Description: 具体迭代器 ： 婺源
 * @Author: magd39318
 * @Date: 2021/10/9 14:13
 */
public class WuyuanScenicAreaIterator implements ScenicAreaIterator {

    private ArrayList<Landscape> list = null;
    private int index = -1;
    Landscape landscape = null;

    public WuyuanScenicAreaIterator(ArrayList<Landscape> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Landscape first() {
        index = 0;
        landscape = list.get(index);
        return landscape;
    }

    @Override
    public Landscape next() {
        if (this.hasNext()) {
            landscape = list.get(++ index);
        }
        return landscape;
    }

    @Override
    public Landscape previous() {
        if (index > 0) {
            landscape = list.get(-- index);
        }
        return landscape;
    }

    @Override
    public Landscape last() {
        index = list.size() - 1;
        return list.get(index);
    }
}
