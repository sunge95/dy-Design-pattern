/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 11:10
 */
public class TestMain {
    //高内聚(设计一个类的时候 类中的成员不能是别人做的)
    //低耦合(设计类的关系时候 尽量松弛)
    public static void main(String[] args) {
        //        //创建报社对象
//        BaoShe bs = new BaoShe("新华社");
//        //创建读者对象
//        ReaderOne one = new ReaderOne("读者甲");
//        ReaderTwo two = new ReaderTwo("读者乙");
//        ReaderThree three = new ReaderThree("读者丙");
//        //读者主动做事
//        one.readPaper(bs);
//        two.readPaper(bs);
//        three.readPaper(bs);

        //创建对象好麻烦
        //  (目前为止处理不了 以后可以通过IOC设计思想体现)
        //  对象不需要我们创建  让别人帮我们创建好IOC  属性自动的注入DI  Spring(IOC-DI AOP)
        //  IOC思想有了反射  AOP基础可以实现  Filter(JavaWEB 过滤器 动态代理)
        //每一个对象都需要主动做事  读者做事(读者多)
        //  观察者设计模式(思想) 解决 一个对象和一堆对象的关系  一个对象做事情  一堆对象自动的做事情
        //  观察者(一堆)读者   目标对象(一个)报社
        //  理清关系后需要改变一下类的设计

        BaoShe baoShe = new BaoShe("新华社");
        Reader one = new ReaderOne("大卫");
        Reader two = new ReaderTwo("小李");
        baoShe.addObservers(one);
        baoShe.addObservers(two);

        baoShe.sendPaper();

        //仔细看我的课程(类和类的关系)
        //留了一个小任务(警察追击问题  警车 小汽车 测速器)
        //另一个任务(卫星 基站 气象台)
    }
}
