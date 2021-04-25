/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 13:32
 */
//类适配器
//  适配器类自己就是那个需要转化的对象
public class SpecialMiniSDCard extends KingstonMiniSDCard implements SDCard {

    //这是用来描述特别的小卡(金士顿研发的特别技术)
    //是一张特别的小卡  本质上是一个小卡 具有小卡的芯片(继承过来的)
    //同时这个卡特别    特别体现在可以折叠--->折叠后长得跟大卡一样(遵循规则)
    @Override
    public void readSDCard() {
        this.readMini();
    }

    @Override
    public void writeSDCard() {
        this.writeMini();
    }
}
