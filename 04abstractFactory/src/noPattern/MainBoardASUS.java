package noPattern;

/**
 * Description:华硕主板
 *
 * @author:SunG
 * @date 2021/3/26 11:02
 */
public class MainBoardASUS implements MainBoard {

    private String name;
    //主板上CPU针孔数
    private int CPUPinHoles;

    public MainBoardASUS(String name, int CPUPinHoles) {
        this.name = name;
        this.CPUPinHoles = CPUPinHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("这是"+this.name+"主板,CPU的针孔数为"+this.CPUPinHoles);
    }
}
