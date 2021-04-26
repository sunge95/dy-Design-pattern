package nopattern;

/**
 * 这个类是用来描述一个人的
 * 一个销售员工
 *
 * 员工名字  销售额  身份(普通/经理)
 */
public class User {

    private String name;
    private double salary;
    private String identity;

    public User(String name, double salary, String identity) {
        this.name = name;
        this.salary = salary;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getIdentity() {
        return identity;
    }
}
