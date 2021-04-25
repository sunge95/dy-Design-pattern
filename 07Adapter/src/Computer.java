/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 11:28
 */
public class Computer {

    //可以读写SDCard
    //方法是否需要参数(一张卡)
    //电脑和SDCard 依赖关系(方法内使用了另一个类的对象)
    public void readAndWriteSDCard(SDCard SDCard){
        SDCard.readSDCard();
        SDCard.writeSDCard();
    }

    //让电脑可以读取mini卡 不想改变电脑的主板设计(加方法)

    //刚才的思路这个不好 todo 从现实生活中考虑，每增加一个sdcard 就要让电脑新增加一个卡槽
//    //可以想到的第一点  电脑里面添加一个方法
//    public void readAndWriteMini(KingstonMiniSDCard miniSDCard){
//        miniSDCard.read();
//        miniSDCard.write();
//    }
}
