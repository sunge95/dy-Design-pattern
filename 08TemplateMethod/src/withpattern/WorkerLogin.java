package withpattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 16:07
 */
public class WorkerLogin extends LoginTemplate {

    @Override
    protected User selectOne(String name) {
        User user = new User();//domain
        user.setUserID(name);
        user.setUserPass("geng");
        return user;
    }

    @Override
    protected String encryptPass(String password){
        System.out.println("给工作人员按照MD5加密啦");
        return password;//理论上应该return一个加密后的密码
    }
}
