/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 9:45
 */
public class Main {
    public static void main(String[] args) {
        //0.先创建一个工厂对象
        RestaurantFactory factory1 = new Restaurant1Factory();

//        RestaurantFactory factory2 = new Restaurant2Factory();
        //1.找饭店(隐藏的是具体对象 而不是工厂对象)
        BasicRestaurant restaurant = factory1.getInstance();
        //2.调用方法
        restaurant.saleFood();

        // new一个抽象类
//        RestaurantFactory factory = new RestaurantFactory() {
//            @Override
//            protected BasicRestaurant chooseRestaurant() {
//                return null;
//            }
//        };

        RestaurantFactory r3 = new R3Factory();
        BasicRestaurant instance = r3.getInstance();
        instance.saleFood();
    }
}
