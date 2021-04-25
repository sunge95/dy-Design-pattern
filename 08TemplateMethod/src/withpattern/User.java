package withpattern;

/**
 * 前提两个表格可以放置在一起存储
 * 中间做一个区分就可以了
 * 将刚才的两个domain合并成一个的
 */
public class User {

    private String userID;
    private String userPass;
    private String userBalance;//只有用户才有数据   工作人员这个数据为null
    //自己多设计一个列  身份的区分---扩展

    public User() {
    }

    public User(String userID, String userPass, String userBalance) {
        this.userID = userID;
        this.userPass = userPass;
        this.userBalance = userBalance;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(String userBalance) {
        this.userBalance = userBalance;
    }
}
