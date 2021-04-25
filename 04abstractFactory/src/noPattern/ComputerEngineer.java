package noPattern;

/**
 * Description:电脑工程师组装电脑
 *
 * @author:SunG
 * @date 2021/3/26 11:17
 */
public class ComputerEngineer {

    //方法 组装电脑
    //  组装电脑是否需要条件? 主板 noPattern.CPU
    public void assembleComputer(CPU cpu,MainBoard mainBoard){
        cpu.centerCalculate();
        mainBoard.installCPU();
    }

    public void assembleComputer(int cputype,int mboardtype){
        CPU cpu = CPUFactory.createCpu(cputype);
        MainBoard mainBoard = MainBoardFactory.createMainBoard(mboardtype);

        cpu.centerCalculate();
        mainBoard.installCPU();
    }
}
