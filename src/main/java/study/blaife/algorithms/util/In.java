package study.blaife.algorithms.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 从标准输入中取值
 * @Author: magd39318
 * @Date: 2021/10/19 18:43
 */
public class In {

    /**
     * 从控制台标准输入获取一个String[] 【按 q 终止】
     * @return
     */
    public static String[] readStrings() {
        List<String> strings = new ArrayList<>();
        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter something : ");
        String input = null;
        try {
            while (true) {
                input = br.readLine();
                if ("q".equals(input)) {
                    System.out.println("Exit!");
                    break;
                } else {
                    strings.add(input);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings.toArray(new String[strings.size()]);
    }


}
