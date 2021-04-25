package nopattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 14:28
 */
public class NormalLogin {

    public String login(String name,String password){
        NormalUser user = selectOne(name);
        if (user != null){
            if (password.equals(user.getNormalPass())){
                return "登录成功";
            }
        }
        return "账号名或密码错误";
    }

    private NormalUser selectOne(String name) {
        NormalUser user = new NormalUser();
        user.setNormalName(name);
        user.setNormalPass("123");
        user.setNormalBalance("1234");
        return user;
    }
}
