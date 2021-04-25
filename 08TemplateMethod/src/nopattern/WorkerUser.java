package nopattern;


/**
 * 这个类可以理解为一个工作人员的domain实体
 * 用来存储在数据库中查询出来的一行记录
 * 账号  密码  余额
 * 三个属性对应存储
 */
public class WorkerUser {

    private String normalName;
    private String normalPass;

    public WorkerUser() {
    }

    public WorkerUser(String normalName, String normalPass) {
        this.normalName = normalName;
        this.normalPass = normalPass;
    }

    public String getNormalName() {
        return normalName;
    }

    public void setNormalName(String normalName) {
        this.normalName = normalName;
    }

    public String getNormalPass() {
        return normalPass;
    }

    public void setNormalPass(String normalPass) {
        this.normalPass = normalPass;
    }

}
