/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 10:06
 */
public class Restaurant1Factory extends RestaurantFactory{

    @Override
    protected BasicRestaurant chooseRestaurant() {
        return new Restaurant1();
    }
}
