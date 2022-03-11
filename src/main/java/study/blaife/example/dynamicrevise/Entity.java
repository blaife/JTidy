package study.blaife.example.dynamicrevise;

/**
 * 实体类模拟
 *
 * @author: magd39318
 * @date: 2022/3/10 13:35
 */
public class Entity {
    @SetField("value1")
    private String value1;

    @SetField("value2")
    private String value2;

    @SetField
    private String valueBlank;

    @Override
    public String toString() {
        return "Entity{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", valueBlank='" + valueBlank + '\'' +
                '}';
    }
}
