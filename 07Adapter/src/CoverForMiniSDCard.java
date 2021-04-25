/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 13:25
 */
//适配器(转换器)
//对象适配器模式
//  在适配器的类中(Cover类)存有一个需要转换的真实对象(MiniCard)作为属性
public class CoverForMiniSDCard implements SDCard {

    //因为这是一个大的SD卡形状 设计的时候需要遵循大的SD卡规则
    //这是一个mini卡的 卡套
    //卡套里面是没有数据(空壳)
    //外观长得跟SDCard一样
    //内部可以容纳一张MiniSDCard

    //这个卡套和那个MiniSDCard什么关系？？？  包含
    //卡托 has a 小卡
    private MiniSDCard miniSDCard;
    public CoverForMiniSDCard(MiniSDCard miniSDCard){
        this.miniSDCard = miniSDCard;
    }

    @Override
    public void readSDCard() {
        this.miniSDCard.readMini();
    }

    @Override
    public void writeSDCard() {
        this.miniSDCard.writeMini();
    }
}
