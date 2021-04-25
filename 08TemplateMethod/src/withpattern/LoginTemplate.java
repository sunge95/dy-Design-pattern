package withpattern;

/**
 * 这是一个抽象类
 * 用来规定登录模板的
 * 一个登录的整体流程---流程可以复用
 */
public abstract class LoginTemplate {

    //模板中肯定就一个主要的方法   登录
    //保证模板方法的固定  不让子类修改
    public final String login(String name,String password){
        //1.需要让dao小弟帮我们负责数据读取
        User user = selectOne(name);
        //2.判断user是否存在
        if (user != null){
            //有可能会出现一个单独的加密???
            //单独写一个方法  默认的什么也没操作
            String encryptPass = this.encryptPass(password);
            if (encryptPass.equals(user.getUserPass())){
                return "login success";
            }
        }
        return "login fail";
    }

    //为了让他们统一 就来一个加密方法
    protected String encryptPass(String password) {
        //不加密 直接返回传进来的参数
        System.out.println("默认没加密");
        return password;
    }

    //===========================================

    //设计一个dao层的小弟方法  负责查询单条记录
    //(流程一样 可以写在这里--具体)
    //(流程不一样 可以设计成抽象方法--让子类实现)
    protected abstract User selectOne(String name);
}
