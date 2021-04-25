package hasPattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 11:35
 */
public class TestMain {
    public static void main(String[] args) {

        //这个不好
        AbstractFactory planA = new PlanA();
        CPU cpu = planA.createCPU();
        MainBoard mainBoard = planA.createMainBoard();
        ComputerEngineer.assembleComputer(cpu,mainBoard);

        //电脑组装师不需要cpu，mainBoard ，只需要客户给他一个组装计划
        AbstractFactory planB = new PlanB();
        ComputerEngineer.assembleComputer(planB);
    }
}
