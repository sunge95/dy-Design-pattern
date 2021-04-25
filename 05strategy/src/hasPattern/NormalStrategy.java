package hasPattern;

/**
 * 某一个具体的策略(负责具体计算)
 * 相当于这个类中包含一个刚才独立计算的小方法
 */
public class NormalStrategy implements Strategy {

    @Override
    public double calculatePrice(double goodPrice) {
        System.out.println("炮灰，你没有优惠哦！");
        return goodPrice;
    }
}
