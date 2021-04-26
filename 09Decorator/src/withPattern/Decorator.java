package withPattern;

/**
 * 这个规则的出现就是装饰者
 * 规则的出现是为了让所有添加的对象都可以随意
 * 而非按照某种顺序来
 */
public abstract class Decorator extends Boss{

    protected Boss d;

    public Decorator(Boss d){
        this.d = d;
    }

    //装饰者对象的方法名是随意的
    @Override
    public abstract double calcBonus(String name);

}
