/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/25 22:57
 */
public class Singleton4 {

    private Singleton4(){}
    private static Singleton4 instance = null;

    private static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                instance = new Singleton4();
            }
        }
        return instance;
    }
    //  方法双重判定  懒加载
    //  方法上不加锁，解决了创建性能的问题
    //  JVM虚拟机 对象的开辟和赋值的过程中 可能会产生指令重排序

}
