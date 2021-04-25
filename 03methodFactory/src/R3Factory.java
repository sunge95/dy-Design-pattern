/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 10:28
 */
public class R3Factory extends RestaurantFactory {

    @Override
    protected BasicRestaurant chooseRestaurant() {
        return new R3();
    }
}
