package withPattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 23:49
 */
public class TestMain {

    public static void main(String[] args) {
        Boss bonus = new Bonus(); //原始对象是不能装别人的


        MonthBonus mb = new MonthBonus(bonus);
        ExtraBonus eb = new ExtraBonus(mb);
        TeamBonus tb = new TeamBonus(eb);
        double aTuo = tb.calcBonus("ATuo");
        System.out.println(aTuo);

    }
}
