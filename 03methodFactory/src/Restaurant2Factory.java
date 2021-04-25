/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 10:09
 */
public class Restaurant2Factory extends RestaurantFactory {

    @Override
    protected BasicRestaurant chooseRestaurant() {
        return new Restaurant2();
    }
}
