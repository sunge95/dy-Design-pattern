package withPattern;

import nopattern.User;
import nopattern.UserBox;

import java.util.Map;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 23:26
 */
public class TeamBonus extends Decorator {

    public TeamBonus(Boss d) {
        super(d);
    }

    @Override
    public double calcBonus(String name) {
        //原始对象做事
        double momey = d.calcBonus(name);

        double sum = 0;
        Map<String, User> userBox = UserBox.getUserBox();
        for (String key : userBox.keySet()){
            sum += userBox.get(key).getSalary() * 0.01;
        }
        System.out.println(name+"带领团队奖金"+sum);
        //返回总金额
        return sum + momey;
    }
}
