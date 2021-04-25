package noPattern;

/**
 * Description:msi主板
 *
 * @author:SunG
 * @date 2021/3/26 11:02
 */
public class MainBoardMSI implements MainBoard {

    private String name;
    private int CPUPinHoles;

    public MainBoardMSI(String name, int CPUPinHoles) {
        this.name = name;
        this.CPUPinHoles = CPUPinHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("这是"+this.name+"主板,CPU的针孔数为"+this.CPUPinHoles);
    }
}
