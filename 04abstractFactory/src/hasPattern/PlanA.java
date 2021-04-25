package hasPattern;

/**
 * Description: 装机方案a
 *
 * @author:SunG
 * @date 2021/3/26 13:07
 */
public class PlanA implements AbstractFactory {

    @Override
    public MainBoard createMainBoard() {
        MainBoard mainBoard = new MainBoardASUS("asus",1155);
        return mainBoard;
    }

    @Override
    public CPU createCPU() {
        CPU cpu = new CPUAMD("amd",1155);
        return cpu;
    }
}
