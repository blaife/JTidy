package study.blaife.designmode.behavioral.memento.undocase;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Description: 悔棋案例 - 客户端
 * @Author: magd39318
 * @Date: 2021/10/11 10:45
 */
public class ClientTest {

    private static final String WHITE_CHESS = "W";
    private static final String BLACK_CHESS = "B";
    private static final int LEAST_LENGTH = 2;

    private static final String AFFIRM = "1";
    private static final String UNDO = "0";

    private static MementoCaretaker mc = new MementoCaretaker();

    @Test
    public void init() {
        System.out.println("五子棋大赛开始：");
        System.out.println("---------------------------------------------------------");
        System.out.println("黑子先行：");
        agent(BLACK_CHESS);
    }

    public void agent(String color) {
        Scanner sc = new Scanner(System.in);
        String index = sc.next();
        try {
            String[] indexs = index.split(",");
            if (indexs.length < LEAST_LENGTH) {
                throw new Exception("");
            }
            int x = Integer.parseInt(indexs[0]);
            int y = Integer.parseInt(indexs[1]);
            if (BLACK_CHESS.equalsIgnoreCase(color)) {
                followingForBlack(x, y);
            } else {
                followingForWhite(x, y);
            }
        } catch (Exception e) {
            System.out.println("下子有误，请重新下子");
            agent(color);
        }
    }

    public void followingForWhite(int x, int y) {
        mc.addMemento(new Chessman(WHITE_CHESS, x, y).save());
        System.out.println("当前棋盘：" );
        mc.getMessage();
        System.out.println();
        System.out.println("悔棋（0）， 确认（任意键）");
        Scanner sc = new Scanner(System.in);
        String flag = sc.next();
        if (UNDO.equalsIgnoreCase(flag)) {
            System.out.println("悔棋：请重新下子");
            agent(WHITE_CHESS);
        } else {
            System.out.println("黑子，下");
            agent(BLACK_CHESS);
        }
    }

    public void followingForBlack(int x, int y) {
        mc.addMemento(new Chessman(BLACK_CHESS, x, y).save());
        System.out.println("当前棋盘：" );
        mc.getMessage();
        System.out.println();
        System.out.println("悔棋（0）， 确认（任意键）");
        Scanner sc = new Scanner(System.in);
        String flag = sc.next();
        if (UNDO.equalsIgnoreCase(flag)) {
            System.out.println("悔棋：请重新下子");
            agent(BLACK_CHESS);
        } else {
            System.out.println("白子，下");
            agent(WHITE_CHESS);
        }
    }

}
