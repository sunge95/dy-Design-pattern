/**
 * Description: 简单工厂与 工厂方法的区别
 *
 * @author:SunG
 * @date 2021/3/26 9:45
 */
public class Main {
    public static void main(String[] args) {
        //不但知道了接口(规则)，还暴露了具体的实现类(用户不应该知道是哪个具体类实现的)
        //违背了一个封装隔离的思想 （Restaurant1暴露出来了）
//        BasicRestaurant br = new Restaurant1();
//        br.saleFood();

        // 简单工厂模式
        //0.先创建一个工厂对象
//        RestaurantFactory factory = new RestaurantFactory();
//        //1.找饭店
//        BasicRestaurant restaurant = factory.getInstance("restaurant1");   //具体是谁 工厂如何管理对象(机制)
//        //2.调用方法
//        restaurant.saleFood();

        BasicRestaurant restaurant = RestaurantFactory.getInstance("restaurant1");
        restaurant.saleFood();

    }
}
