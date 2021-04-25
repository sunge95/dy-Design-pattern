
//这个外部转换器
//实现了好多不同的规则
//具体的卡去选择性的挑选 可以重写的方法

public abstract class USBCardReader implements SDCard,MiniSDCard{

    @Override
    public void readMini() {

    }
    @Override
    public void writeMini() {

    }
    @Override
    public void readSDCard() {

    }
    @Override
    public void writeSDCard() {

    }
}
