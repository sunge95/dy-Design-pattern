/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 11:29
 */
public class KingstonSDCard implements SDCard{

    //这是一张真实的SD卡  大的卡

    @Override
    public void readSDCard(){
        System.out.println("读取 sdscard");
    }

    @Override
    public void writeSDCard(){
        System.out.println("写入 sdscard");
    }
}
