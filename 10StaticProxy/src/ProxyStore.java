/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/26 0:32
 */
public class ProxyStore implements Store{

    //聚合关系  代理店--工厂店
    private Store appleStore = new AppleStore();

    //如果想要造假    自己在山沟沟里造一个山寨工厂
    private LPhone producePhone(){
        LPhone lPhone = new LPhone();
        return lPhone;
    }

    @Override
    //代购  代理------卖手机
    public Phone sellPhone(){//可以在真正用户不知情的情况下修改执行的过程
        //1.有一台手机????  真机  找工厂店
        Phone iPhone = this.appleStore.sellPhone();
        //2.有一个山寨工厂     山寨手机
        Phone lPhone = this.producePhone();
        //3.手机卖出去
//        return iPhone;
        return lPhone;
    }
}
