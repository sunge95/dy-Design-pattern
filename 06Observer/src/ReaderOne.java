/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 10:58
 */
public class ReaderOne implements Reader {

    //属性
    private String name;
    public ReaderOne(String name){
        this.name=name;
    }

    //读报纸
    //这是一个方法----好比是一件事情
    //是否需要参数-----参数(报纸 报社)  报社设置为单例
    //是否需要返回值---不需要
    @Override
    public void readPaper(NewsPaper paper) {
        System.out.println(this.name+".读者 "+paper.getName());
    }
}
