package study.blaife.designmode.structural.flyweight.gobangcase;

import java.util.ArrayList;

/**
 * @Description: 五子棋工厂
 * @Author: magd39318
 * @Date: 2021/9/23 16:16
 */
public class GobangFactory {

    private ArrayList<ChessPieces> chessPiecesList;

    public GobangFactory() {
        chessPiecesList = new ArrayList<>();
        ChessPieces whitePieces = new WhitePieces();
        chessPiecesList.add(whitePieces);
        ChessPieces blackPieces = new BlackPieces();
        chessPiecesList.add(blackPieces);
    }

    public ChessPieces getChessPieces(String type) {
        if ("w".equalsIgnoreCase(type)) {
            return chessPiecesList.get(0);
        } else if ("b".equalsIgnoreCase(type)) {
            return chessPiecesList.get(1);
        } else {
            return null;
        }
    }

}
