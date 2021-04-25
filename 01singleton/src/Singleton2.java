/**
 * Description:单例模式2
 *
 * @author:SunG
 * @date 2021/3/25 22:51
 */
public class Singleton2 {
    //方式二   懒汉式(延迟加载)
    private Singleton2(){}

    private static Singleton2 instance = null;

    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
    //会产生的问题： 多个线程并发执行  冲突

}
