package hasPattern;

/**
 * Description:inter noPattern.CPU
 *
 * @author:SunG
 * @date 2021/3/26 11:06
 */
public class CPUInter implements CPU {

    private String name;
    //属性针脚数
    private int pins;

    public CPUInter(String name, int pins) {
        this.name = name;
        this.pins = pins;
    }

    @Override
    public void centerCalculate() {
        System.out.println("这是"+this.name+"noPattern.CPU,配有"+this.pins+"针脚");
    }
}
