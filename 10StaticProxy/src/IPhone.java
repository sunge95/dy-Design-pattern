/**
 * 这个类用来描述手机
 * 就是自己的一些描述
 * 这些是电话的一些功能描述----方法
 */
public class IPhone implements Phone{

    private String name;
    private String color;

    public IPhone() {
    }

    public IPhone(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //打电话
    @Override
    public void call(){
        System.out.println("真的iPhone 打电话很流畅");
    }
    //玩游戏
    @Override
    public void play(){
        System.out.println("真的iPhone 玩游戏不卡顿");
    }
    //拍照片
    @Override
    public void photo(){
        System.out.println("真的iPhone 拍照片很清晰");
    }
}
