package hasPattern;

/**
 * Description:电脑组装师
 *
 * @author:SunG
 * @date 2021/3/26 13:14
 */
public class ComputerEngineer {

    public static void assembleComputer(CPU cpu,MainBoard mainBoard){
        cpu.centerCalculate();
        mainBoard.installCPU();
    }

    // 只需要客户给一个组装计划
    public static void assembleComputer(AbstractFactory plan){
        CPU cpu = plan.createCPU();
        MainBoard mainBoard = plan.createMainBoard();

        cpu.centerCalculate();
        mainBoard.installCPU();
    }
}
