package hasPattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 13:19
 */
public class PlanB implements AbstractFactory {

    @Override
    public MainBoard createMainBoard() {
        MainBoard mainBoard = new MainBoardMSI("msi",123);
        return mainBoard;
    }

    @Override
    public CPU createCPU() {
        CPU cpu = new CPUAMD("amd",123);
        return cpu;
    }
}
