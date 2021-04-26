package nopattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 22:05
 */
public class TestMain {

    public static void main(String[] args) {
        Bonus bonus = new Bonus();
        double atuo = bonus.calcBonusOriginal("ATuo");
        System.out.println(atuo);

        double atuo2 = bonus.calcBonus("BoGe");
        System.out.println(atuo2);

    }
}
