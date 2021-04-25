/**
 * Description:单列模式1
 *
 * @author:SunG
 * @date 2021/3/25 22:13
 */
public class Singleton1 {

    // 对象的存储结构是怎样的  方法执行是在栈内存开辟的临时执行空间

    //方式一   饿汉式(立即加载)
    //1.私有构造方法
    private Singleton1(){}
    //2.私有的静态的当前类的对象作为属性
    //  私有 保护属性的安全  静态 保证属性对象只创建一份 否则内存溢出(sStackOverflowError)
    private static Singleton1 instance = new Singleton1();
    //3.共有的静态的方法 返回当前唯一属性
    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
