/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/26 0:30
 */
public class TestMain {

    public static void main(String[] args) {
//        AppleStore store = new AppleStore();
//        store.selliPhone();
//        
        //1.有一个代理店
        Store store = new ProxyStore();
        //2.代理店卖手机
        Phone iPhone = store.sellPhone();
        //3.用户使用
        iPhone.call();
        iPhone.play();
        iPhone.photo();

        //TODO 静态代理 静态代理对象 代理的东西不变 只能代理卖手机
        // 动态代理可以帮你 干其他的事  代理的是方法
    }
}
