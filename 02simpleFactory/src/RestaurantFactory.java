/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 9:47
 */
public class RestaurantFactory {

//    public BasicRestaurant getInstance(String type){
//        //        return new Restaurant1();
//
//        if ("restaurant1".equals(type)){
//            return new Restaurant1();
//        } else if ("restaurant2".equals(type)){
//            return new Restaurant2();
//        } else {
//            return null;
//        }
//    }

    //工厂中用来创建对象的方法可以认为是一个工具
    //static好一些
    public static BasicRestaurant getInstance(String type){
        //        return new Restaurant1();

        if ("restaurant1".equals(type)){
            return new Restaurant1();
        } else if ("restaurant2".equals(type)){
            return new Restaurant2();
        } else {
            return null;
        }
    }
}
