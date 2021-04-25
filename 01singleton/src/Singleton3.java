/**
 * Description:单例模式3
 *
 * @author:SunG
 * @date 2021/3/25 22:54
 */
public class Singleton3 {

    //方式三  加锁
    private Singleton3(){}

    private static Singleton3 instance = null;

    public synchronized static Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
    //  添加锁 解决上述线程安全的问题
    //  缺点  整个方法的执行过程中 不能有其他线程操作
    //        效率慢
}
