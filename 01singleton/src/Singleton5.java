/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/25 23:12
 */
public class Singleton5 {
    // 对象生成的过程
    // 1、堆内存开辟空间  2、加载信息  3、将地址赋值给栈内存的引用
    // jvm为了提高性能，可能会将 2，3执行顺序重排

    private Singleton5(){}

    //  防止指令重排序  属性上添加volatile
    private static volatile Singleton5 instance = null;

    private static Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }

    //不设计----直接用枚举
}
