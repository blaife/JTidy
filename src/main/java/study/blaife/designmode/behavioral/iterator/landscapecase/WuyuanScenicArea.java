package study.blaife.designmode.behavioral.iterator.landscapecase;

import java.util.ArrayList;

/**
 * @Description: 具体景点 ： 婺源
 * @Author: magd39318
 * @Date: 2021/10/9 14:12
 */
public class WuyuanScenicArea implements ScenicArea {
    ArrayList<Landscape> list = new ArrayList<>();

    @Override
    public void add(Landscape landscape) {
        list.add(landscape);
    }

    @Override
    public void remove(Landscape landscape) {
        list.remove(landscape);
    }

    @Override
    public ScenicAreaIterator getIterator() {
        return new WuyuanScenicAreaIterator(list);
    }

}
