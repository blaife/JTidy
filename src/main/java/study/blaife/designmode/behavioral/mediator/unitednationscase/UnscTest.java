package study.blaife.designmode.behavioral.mediator.unitednationscase;

import org.junit.Test;
import study.blaife.designmode.behavioral.mediator.unitednationscase.country.AbdomenBlackRabbit;
import study.blaife.designmode.behavioral.mediator.unitednationscase.country.BaldEagle;
import study.blaife.designmode.behavioral.mediator.unitednationscase.country.PolarBear;

/**
 * @Description: 联合国案例 - 安理会现场
 * @Author: magd39318
 * @Date: 2021/10/9 10:45
 */
public class UnscTest {

    @Test
    public void start() {
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
        AbdomenBlackRabbit abdomenBlackRabbit = new AbdomenBlackRabbit(unsc);
        BaldEagle baldEagle = new BaldEagle(unsc);
        PolarBear polarBear = new PolarBear(unsc);
        unsc.setAbdomenBlackRabbit(abdomenBlackRabbit);
        unsc.setBaldEagle(baldEagle);
        unsc.setPolarBear(polarBear);

        baldEagle.declare("维护世界和平");
        polarBear.declare("我还是更喜欢 ‘川建国’");
        abdomenBlackRabbit.declare("‘拜振华’同志，听说前段时间你拉裤兜了，没事吧");
    }

}
