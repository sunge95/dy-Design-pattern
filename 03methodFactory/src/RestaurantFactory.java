/**
 * Description: 工厂方法模式，指的是 下面的抽象方法，让子工厂干活
 *
 * @author:SunG
 * @date 2021/3/26 9:47
 */
public abstract class RestaurantFactory {

    //这个方法是工厂的方法
    //工厂的方法需要创建一个对象
    //工厂在创建对象的时候---->不知道该创建哪个具体的对象
    //采用的解决方案是-->不解决(无为而治)
    abstract protected BasicRestaurant chooseRestaurant(); //为了选择具体对象用的 不想让用户知道

    //这个方法就是一个空壳 为了给用户看的 让用户觉得对象是此工厂创建的
    public  BasicRestaurant getInstance(){
        return chooseRestaurant();
    }
}
