package nopattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个集合
 * 为了装好多员工  (数据应该存储在数据库中)
 * 这个类可以当做数据库理解
 */
public class UserBox {

    //集合    存储用户    泛型???
    private static Map<String,User> userBox;

    //静态块  在创建当前类时  初始化集合  集合里面存入好多用户
    static{
        userBox = new HashMap<>();
        userBox.put("Andy",new User("安迪",4000,"普通"));
        userBox.put("BoGe",new User("博哥",6000,"普通"));
        userBox.put("ATuo",new User("阿拓",8000,"经理"));
    }

    public static User getUser(String name) {
        return userBox.get(name);
    }

    public static Map<String,User> getUserBox(){
        return userBox;
    }
}
