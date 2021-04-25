package hasPattern;

/**
 * Description:AMD 的 cpu
 *
 * @author:SunG
 * @date 2021/3/26 11:07
 */
public class CPUAMD implements CPU {

    private String name;
    private int pins;

    public CPUAMD(String name, int pins) {
        this.name = name;
        this.pins = pins;
    }

    @Override
    public void centerCalculate() {
        System.out.println("这是"+this.name+"noPattern.CPU,配有"+this.pins+"针脚");
    }
}
