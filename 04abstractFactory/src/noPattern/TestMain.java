package noPattern;

/**
 *  模拟一个组装台式电脑的小案例
 * 	电脑城  买一台组装机
 * 	装机工程师
 * 	电脑主板+noPattern.CPU
 */
public class TestMain {
    public static void main(String[] args) {
        ComputerEngineer engineer1 = new noPattern.ComputerEngineer();
        CPU cpu = new noPattern.CPUInter("inter",123);
        MainBoard mainBoard = new noPattern.MainBoardMSI("msi",123);
        engineer1.assembleComputer(cpu,mainBoard);

        //=====================================================================
        //用户自己没有  两个硬件  所以才会去买
        //电脑城买  某一个店家  装机工程师(卖你硬件的)
        //电脑的两个硬件其实不是用户自己的  工程师才有的(只有工程师知道)
        //用户用硬件的时候  看不见这两个硬件对象  放外面让用户自己new不太合理
        //这两个硬件的对象隐藏起来------工厂模式(简单工厂  工厂方法)
        //想利用简单工厂将那两个具体的硬件对象 隐藏起来

        ComputerEngineer engineer = new ComputerEngineer();
        engineer.assembleComputer(1,2);

        //======================================================
        //以前的简单工厂模式 或者是工厂方法模式
        //更注重的是单个对象的创建
        //每一个工厂 只负责创建当前工厂的对象
        //这个对象与其他工厂或者是其他对象产生的结果不一定匹配
        //就好像CPU工厂 关注CPU对象的创建
        //主板工厂 关注主板对象的创建
        //两个对象之间的关联关系呢？ 两个产品是一个系列的才可以搭配在一起
        //一个系列的对象，产品之间怎么互相约束呢??
        //  抽象工厂模式
        //抽象工厂模式 更注重一系列对象互相之间的依赖关系
        //抽象工厂模式的方法不是随意搭建起来的 一系列或者是相互依赖的方法
        //比如说刚才需要一台电脑  CPU+主板当做一个系列
        //这个系列的目的是为了组装一台电脑
    }
}
