/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 11:33
 */
public class TestMain {

    public static void main(String[] args) {
        //最初的设计
//        //1.创建一个电脑
//        Computer computer = new Computer();
//        //2.创建一张SDCard
//        KingstonSDCard SDCard = new KingstonSDCard();
//        //3.电脑做事 读取SDCard
//        computer.readAndWriteSDCard(SDCard);

        Computer computer = new Computer();
        SDCard sdCard = new KingstonSDCard();
        computer.readAndWriteSDCard(sdCard);

        //对象适配器
        //卡套的方式实现了电脑可以读取小卡
                    // 1.创建一个电脑
        //        //2.需要一张Mini小卡
        MiniSDCard miniSDCard = new KingstonMiniSDCard();
        // 3.需要一个转换器（适配器--卡托）
        SDCard sdCard1 = new CoverForMiniSDCard(miniSDCard);
        // 4.电脑做事，读取SDCard（其实是读取 cover）
        computer.readAndWriteSDCard(sdCard1);


        //特殊小卡(可折叠的小卡)实现的电脑读取
        //1.电脑对象
        //2.创建一张特殊的小卡
        SDCard special = new SpecialMiniSDCard();
        //3.电脑读取
        computer.readAndWriteSDCard(special);

        //缺省适配器
        //  重新定义了一个新的类(USB连接的万能读卡器 拓展坞)
    }
}
