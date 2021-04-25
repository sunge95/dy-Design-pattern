package nopattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 14:32
 */
public class WorkerLogin {

    public String login(String name,String password){
        WorkerUser user = selectOne(name);
        if (user != null){
            String encryptPass = this.encryptPassword(password);
            if (encryptPass.equals(user.getNormalPass())){
                return "success";
            }
        }
        return "login fail";
    }

    //设计一个单独的方法 给工作人员密码做一个加密  秘钥 加密狗 (小U盘)
    private String encryptPassword(String password) {
        System.out.println("给工作人员的密码加密啦");
        //理论上应该return一个加密后的密码
        return password;
    }

    private WorkerUser selectOne(String name) {
        WorkerUser user = new WorkerUser();
        user.setNormalName(name);
        user.setNormalPass("111");
        return user;
    }
}
