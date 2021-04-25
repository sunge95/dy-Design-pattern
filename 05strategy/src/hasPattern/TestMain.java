package hasPattern;

import java.io.PrintWriter;
import java.util.Scanner;

/**
*  成功的实现了刚才的扩展
 * 	在不用修改原有程序的基础上
 * 	扩展了新的策略和执行
 *
 * 	策略模式未来就是解决这种
 * 	流程固定 执行不同的情况
 *
 * 	两种策略方案
 */
public class TestMain {
    public static void main(String[] args) {

        // 方案一 依赖关系
        //1.需要创建一个控制流程的对象
        Price p = new Price();
        //2.需要调用price的方法帮我们报价
        Strategy strategy = new NobleStrategy();

        double re = p.buyA(11999,strategy); //可以认为是懒汉式
        System.out.println(re);

        //方案二 组合关系
        Strategy strategy2 = new NormalStrategy();
        Price price = new Price(strategy2);     //饿汉式
        double b = price.buyB(11999);
        System.out.println(b);

        //深耕学习
    }
}
