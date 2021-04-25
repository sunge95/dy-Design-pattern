package hasPattern;

/**
 * 这个类还是之前最早我们设计的类
 * 这个类主要是为了规定执行的流程(buy方法)  流程
 */
public class Price {

    //方案一
    //这种是将策略当做执行的参数传递
    //这个方法是根据身份控制逻辑流程的那个方法
    //这个方法在这个类中没有动
    public double buyA(double goodPrice,Strategy strategy){
        double result = 0;
        System.out.println("准备号，学习了吗？");
        //执行一个计算的方法啦(具体是哪一个方法(计算策略) 不知道 由参数决定)
        result = strategy.calculatePrice(goodPrice);//多态的效果

        return result;
    }

    //方案二
    //除上述之外 还可以将策略当做当前类的属性(策略包含在当前对象中 组合在一起)
    public Price(){}

    private Strategy strategy;  //将策略组合在当前对象中
    public Price(Strategy strategy){
        this.strategy = strategy;
    }

    public double buyB(double goodPrice){
        double result = 0;
        System.out.println("准备号，学习了吗？");
        // 执行一个计算的方法啦(具体是哪一个方法(计算策略) 不知道 由参数决定)
        return strategy.calculatePrice(goodPrice);
    }
}
