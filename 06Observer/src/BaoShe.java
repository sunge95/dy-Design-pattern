import java.util.ArrayList;
import java.util.List;

/**
 这个类是用来描述报社的

 隐藏的关系
 报纸
 报社----依赖
 */
public class BaoShe {

    private String name ;


    public BaoShe(String name){
        this.name = name;
    }
    public String getName() {//获取名字
        return name;
    }

    //============================================
    //1.改变报社和读者关系
    //新增的读者
    private List<Reader> observers = new ArrayList<>();
    //2.集合里面是没有读者的
    //设计一个方法 目的是添加读者
    public void addObservers(Reader reader){
        observers.add(reader);
    }
    public void removeObserver(Reader reader){
        this.observers.remove(reader);
    }

    //4.通知所有的观察者去做自己该做的事情(读报纸)
    public void notifyObservers(NewsPaper paper){
        for (Reader reader:observers){
            reader.readPaper(paper);
        }
    }
    //============================================

    //生产 刊发报纸
    //分析这应该是一个方法----好比是一件事情
    //有没有参数-----没有参数
    //有没有返回值---有返回值(报纸)

    //3.让目标对象做事情(通常是观察者感兴趣的)
    public void sendPaper(){
        System.out.println(this.name + "发报纸了");
        NewsPaper paper = new NewsPaper("新华日报");
        this.notifyObservers(paper);
    }


}
