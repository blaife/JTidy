package study.blaife.example.fixedlengthfileparsing;

import study.blaife.example.fixedlengthfileparsing.entity.ProductF1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * @author: magd39318
 * @date: 2022/3/31 10:34
 */
public class Start {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String fileLine = "004      130001              20190503121234678             130001              110000100000000000000000 11000000000000000000000000020190426   15611200000000000000001050000000100000000000000000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000A00 000000000200000                                30000000000900001100000开放净值130001                                                                  3                               000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000156002000000000000000000000000000000000000000000000000000000002019011520190116201901171200000000000000000000000000000000000000000000000000000000000000000HS00000000826416542A00001000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                        万玲胧                                                                                                                                                                    1 20190503HS       00000000010000000020190117000000000500000000000000000000000000000000000000000000000000000000000000000000000000010103650                    1300     20190117000000000000000000000000000000000000000000000000000000                                                            00000000000100010100000000000000000000030 00000000                                                                                            0000  00000000000000000000000 000000000000000000000000000000000000";

        byte[] lineBytes = fileLine.getBytes();
        fileLine = new String(lineBytes, "GBK");
        System.out.println(fileLine);
        Parser parser = new Parser();
        ProductF1 result = parser.getFileTransition(lineBytes);


        System.out.println(result);
    }
}
