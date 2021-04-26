package withPattern;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 23:34
 */
public abstract class Boss {

    //定级的规则 目的是为了让
    //原始对象的方法  和Decorator的方法名字统一
    //统一了以后 用户就分不清了 用起来方便些
    abstract public double calcBonus(String name);
}
