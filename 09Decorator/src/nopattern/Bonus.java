package nopattern;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 22:05
 */
public class Bonus {

    //设计一个方法 用来计算奖金
    //  是否需要参数???   人名  String
    //  是否需要返回值???  计算后的哪个奖金  double
    public double calcBonusOriginal(String name){
        //1.创建一个变量 用来存储最终结果
        double result = 0;
        //2.获取用户
        User user = UserBox.getUser(name);
        //3.每个人都计算奖金
        result += user.getSalary()*0.03;
        System.out.println(user.getName()+"基本奖金:"+result);
        //4.判断一下 是否超过5k
        if (user.getSalary() >= 5000){
            result += user.getSalary()*0.01;
            System.out.println(user.getName()+"超额奖金:"+result);
        }
        //5.如果这个人是经理
        if ("经理".equals(user.getIdentity())){
            double sum = 0;
            Map<String, User> userBox = UserBox.getUserBox();
            for (String key : userBox.keySet()){
                sum += userBox.get(key).getSalary();
            }
            result += sum*0.01;
            System.out.println(user.getName()+"团队奖金"+result);
        }
        return result;
    }

    //==========================================================================

    //扩展性不好
    //  比如我下个月5月份----促销活动
    //  临时多增加一个销售提成的比例  每一个人多增加0.5%

    //策略模式----解决什么问题????
    //  一个整体的流程是固定
    //  流程中的某一个地方不一样-----抽象(添加不同的策略)
    //  策略模式 同一个时间 几个策略能执行???   只有一个
    //  这个模式解决不了下面的问题

    //手抓饼
    //  每一个人标配  饼+蛋+菜       基本3%
    //  多加一个配置  肠            增加1%
    //  多加一个配置  沙拉酱         增加1%
    //  多加一个配置  辣条

    //装饰者模式 装饰模式 Decorator

    //上面那个方法 中 做了太多的事情了
    //一个方法最好只做一件事情------方法拆分  找小弟
    //设计三个小弟  分别处理三种不同情况的计算
    public double calcBonus(String name){
        double result = 0;
        //三个计算的过程不一定都有  累加在一起  不同的组合

        //计算基本的奖金(所以人都一样 -- 找小弟)
        result += this.monthBonus(name);
        //计算额外奖金
        result += this.extraBonus(name);
        //计算团队奖金
        result += this.teamBonus(name);
        return result;
    }

    private double teamBonus(String name) {
        User user = UserBox.getUser(name);
        if (user.getIdentity().equals("经理")){
            double sum = 0;
            Map<String, User> userBox = UserBox.getUserBox();
            for (String key:userBox.keySet()){
                sum += userBox.get(key).getSalary();
            }
            System.out.println(name+"带领团队奖金"+sum*0.01);
            return sum*0.01;
        }
        return 0;
    }

    private double extraBonus(String name) {
        double result = 0;
        User user = UserBox.getUser(name);
        if (user.getSalary() >= 5000){
            result += user.getSalary()*0.03;
            System.out.println(name+"超额绩效奖金"+result);
        }
        return result;
    }

    private double monthBonus(String name) {
        double result = 0;
        User user = UserBox.getUser(name);
        result += user.getSalary()*0.03;
        System.out.println(name+"当月销售奖金"+result);
        return result;
    }


}
