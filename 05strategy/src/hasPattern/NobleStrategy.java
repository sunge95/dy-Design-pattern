package hasPattern;

/**
 * Description:贵族
 *
 * @author:SunG
 * @date 2021/3/26 14:49
 */
public class NobleStrategy implements Strategy {

    @Override
    public double calculatePrice(double goodPrice) {
        System.out.println("哇哟，贵族，优惠大大的有");
        return goodPrice - 3999;
    }
}
