package study.blaife.basic.container.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

/**
 * CopyOnWriteArrayList 测试
 *
 * @author: magd39318
 * @date: 2022/3/3 13:09
 */
public class CopyOnWriteArrayListTest {

   /**
    * 迭代中删除 测试
    */
   @Test
   public void ListRemoveTest() {
      List<String> basicList = new ArrayList();
      List<String> securityList = new CopyOnWriteArrayList<>();
      Stream.iterate(0, t -> ++t).limit(10).forEach(t -> {
         basicList.add("B" + t);
         securityList.add("C" + t);
      });

      securityList.remove("C1");

      /*
         普通 arrayList 的迭代中删除操作
       */

      Iterator<String> basicIterator = basicList.iterator();
      while (basicIterator.hasNext()) {

         // 会报错ConcurrentModificationException
         // String thisString = basicIterator.next();
         // basicList.remove(thisString);

         // 需要使用 迭代器的删除
         basicIterator.remove();
      }

      Iterator<String> securityIterator = securityList.iterator();
      while (securityIterator.hasNext()) {
         String thisString = securityIterator.next();

         // 报错，在迭代之前做了一个快照，所以iter是不可变的
         // securityIterator.remove();

         // 正因其做了备份所以可以使用下述的删除方式，而不会与iter冲突
         securityList.remove(thisString);
      }
      System.out.println(basicList.size());

      System.out.println(securityList.size());

      System.out.println(basicList.getClass().getTypeParameters());
      basicList.addAll(securityList);
      System.out.println(basicList.getClass().getTypeName());
   }

}
