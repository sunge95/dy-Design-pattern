package withPattern;

import nopattern.UserBox;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 23:01
 */
public class ExtraBonus extends Decorator {

    public ExtraBonus(Boss d) {
        super(d);
    }

    @Override
    public double calcBonus(String name) {

        //1.现有基本方法
        double money = d.calcBonus(name);
        //2.计算额外的奖金
        double bonus = UserBox.getUser(name).getSalary();

//        if (bonus >= 5000) {
//            bonus = bonus * 0.01;
//            System.out.println(name+"超额绩效奖金"+bonus);
//        }
        // 2.1 不需要判断 le？
        bonus = bonus *0.01;
        System.out.println(name+"超额绩效奖金"+bonus);
        //3.返回总额
        return bonus + money;
    }
}
