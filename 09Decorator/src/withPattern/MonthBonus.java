package withPattern;

import nopattern.User;
import nopattern.UserBox;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 22:49
 */
public class MonthBonus extends Decorator {

    public MonthBonus(Boss d){
        super(d);
    }

    @Override
    public double calcBonus(String name){
        //1.现有一个基本方法 TODO java.lang.StackOverflowError
//        double money = this.calcBonus(name);
        double money = d.calcBonus(name);

        //2.基本结果之上 添加自己的
        double result =UserBox.getUser(name).getSalary()*0.03;
        System.out.println(name+"当月基本奖金"+result);

        //返回总奖金
        return result + money;
    }
}
