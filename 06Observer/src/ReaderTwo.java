/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 10:59
 */
public class ReaderTwo implements Reader {

    //属性
    private String name;
    public ReaderTwo(String name){
        this.name=name;
    }

    @Override
    public void readPaper(NewsPaper paper) {
        System.out.println(this.name+".读者 "+paper.getName());
    }
}
