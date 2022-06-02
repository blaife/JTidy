package study.blaife.test.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * asList 测试
 *
 * @author: magd39318
 * @date: 2022/3/7 13:19
 */
public class AsListTest {

    @Test
    public void asListTest() {
        List<String> capClearCodeList = Arrays.asList(new String[]{"104", "105", "405"});
        HashSet set = new HashSet(capClearCodeList);
        if (set.contains("104")) {
            System.out.println("104");
        }

    }

    @Test
    public void listForSubList() {
        List<String> capClearCodeList = Arrays.asList(new String[]{"104", "105", "405"});
        System.out.println(capClearCodeList.subList(1, capClearCodeList.size()-1));
    }
}
