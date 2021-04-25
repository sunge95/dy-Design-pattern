package nopattern;

/**
 * 这个类可以理解为一个普通用户的domain实体
 * 用来存储在数据库中查询出来的一行记录
 * 账号  密码  余额
 * 三个属性对应存储
 */
public class NormalUser {

    private String normalName;
    private String normalPass;
    private String normalBalance;

    public NormalUser() {
    }

    public NormalUser(String normalName, String normalPass, String normalBalance) {
        this.normalName = normalName;
        this.normalPass = normalPass;
        this.normalBalance = normalBalance;
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

    public String getNormalBalance() {
        return normalBalance;
    }

    public void setNormalBalance(String normalBalance) {
        this.normalBalance = normalBalance;
    }
}
