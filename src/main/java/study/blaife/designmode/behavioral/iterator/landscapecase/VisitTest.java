package study.blaife.designmode.behavioral.iterator.landscapecase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: 游览开始
 * @Author: magd39318
 * @Date: 2021/10/9 14:23
 */
public class VisitTest {

    @Test
    public void goToPark() {
        WuyuanScenicArea scenicArea = initLandscape();
        Scanner scan = new Scanner(System.in);
        ScenicAreaIterator scenicAreaIterator = scenicArea.getIterator();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("-------------------开始游览（任意字符）-------------退出（0）---------------------------");
        System.out.println("----------------------------------------------------------------------------------");
        String str1 = scan.next();
        if ("0".equalsIgnoreCase(str1)) {
            System.out.println("已退出");
            return;
        } else {
            scenicAreaIterator.first().toSee();
            visit(scenicAreaIterator);
        }
    }

    private void visit(ScenicAreaIterator scenicAreaIterator) {
        Scanner scan = new Scanner(System.in);
        Landscape landscape = new Landscape();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("----首页（1）-----尾页（9）------上一张（p）------下一张（n）------------退出（0）---------");
        System.out.println("----------------------------------------------------------------------------------");
        String str1 = scan.next();
        if ("0".equalsIgnoreCase(str1)) {
            System.out.println("已退出");
            return;
        } else if ("1".equalsIgnoreCase(str1)){
            scenicAreaIterator.first().toSee();
        } else if ("9".equalsIgnoreCase(str1)){
            scenicAreaIterator.last().toSee();
        } else if ("p".equalsIgnoreCase(str1)){
            scenicAreaIterator.previous().toSee();
        } else if ("n".equalsIgnoreCase(str1)){
            scenicAreaIterator.next().toSee();
        }
        visit(scenicAreaIterator);
    }


    private WuyuanScenicArea initLandscape() {
        WuyuanScenicArea scenicArea = new WuyuanScenicArea();
        scenicArea.add(new Landscape("江湾", "江湾景区是婺源的一个国家5A级旅游景区，" +
                "景区内有萧江宗祠、永思街、滕家老屋、婺源人家、乡贤园、百工坊等一大批古建筑，精美绝伦，做工精细。"));
        scenicArea.add(new Landscape("李坑", "李坑村是一个以李姓聚居为主的古村落，是国家4A级旅游景区，" +
                "其建筑风格独特，是著名的徽派建筑，给人一种安静、祥和的感觉。"));
        scenicArea.add(new Landscape("思溪延村", "思溪延村位于婺源县思口镇境内，" +
                "始建于南宋庆元五年（1199年），当时建村者俞氏以（鱼）思清溪水而名。"));
        scenicArea.add(new Landscape("晓起村", "晓起有“中国茶文化第一村”与“国家级生态示范村”之美誉，" +
                "村屋多为清代建筑，风格各具特色，村中小巷均铺青石，曲曲折折，回环如棋局。"));
        scenicArea.add(new Landscape("菊径村", "菊径村形状为山环水绕型，小河成大半圆型，绕村庄将近一周，" +
                "四周为高山环绕，符合中国的八卦“后山前水”设计，当地人称“脸盆村”。"));
        scenicArea.add(new Landscape("篁岭", "篁岭是著名的“晒秋”文化起源地，也是一座距今近六百历史的徽州古村；" +
                "篁岭属典型山居村落，民居围绕水口呈扇形梯状错落排布。"));
        scenicArea.add(new Landscape("彩虹桥", "彩虹桥是婺源颇有特色的带顶的桥——廊桥，其不仅造型优美，" +
                "而且它可在雨天里供行人歇脚，其名取自唐诗“两水夹明镜，双桥落彩虹”。"));
        scenicArea.add(new Landscape("卧龙谷", "卧龙谷是国家4A级旅游区，" +
                "这里飞泉瀑流泄银吐玉、彩池幽潭碧绿清新、山峰岩石挺拔奇巧，活脱脱一幅天然泼墨山水画。"));
        return scenicArea;
    }
}
