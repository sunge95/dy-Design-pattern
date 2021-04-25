package withpattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 15:20
 */
public class NormalLogin extends LoginTemplate{

    //如果两个业务中查询也都一样 这个方法也没有了 都在模板里
    @Override
    protected User selectOne(String name) {
        User user = new User();//domain
        user.setUserID(name);
        user.setUserPass("geng");
        user.setUserBalance("222222");
        return user;
    }
}
