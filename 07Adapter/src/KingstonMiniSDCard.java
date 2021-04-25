/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 11:34
 */
public class KingstonMiniSDCard implements MiniSDCard{

    //用来描述那种手机用的MiniSDCard 小的sdcard

    //读取数据
    @Override
    public void readMini(){
        System.out.println("读取MiniSDCard");
    }
    //写入数据
    @Override
    public void writeMini(){
        System.out.println("写入MiniSDCard");
    }
}
