/**
 * 这个类是苹果专卖店
 * 理解为苹果的工厂-----苹果专卖店销售
 * 前店后厂
 */
public class AppleStore implements Store{

    //这是一个工厂店-----手机    关系  依赖
    //依赖关系体现  一个类的方法中使用到了另一个类的对象(传参数 方法内创建)

    //生产真机
    //  做事情之前是否需要提供什么条件---参数
    //  做事情之后是否需要留下什么结果---返回值
    private IPhone producePhone(){ //可以理解为这个方法是工厂店自己的
        IPhone iPhone = new IPhone("华为","red");
        return iPhone;
    }

    //卖手机
    //  做事情之前是否需要条件---参数
    //  做事情之后是否需要结果---返回值
    @Override
    public IPhone sellPhone(){
        //找自己的工厂生产一台手机
        IPhone iPhone = this.producePhone();
        //将工厂方法生产的手机返回出去
        return iPhone;
    }

}
