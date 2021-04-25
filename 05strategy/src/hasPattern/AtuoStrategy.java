package hasPattern;

/**
 * Description:阿拓老师的技有
 *
 * @author:SunG
 * @date 2021/3/26 14:47
 */
public class AtuoStrategy implements Strategy {

    @Override
    public double calculatePrice(double goodPrice) {
        System.out.println("拓哥技有，优惠你有");
        return goodPrice - 1999;
    }
}
