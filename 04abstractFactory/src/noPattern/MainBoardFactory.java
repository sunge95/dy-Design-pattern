package noPattern;

/**
 * Description: 主板工厂
 *
 * @author:SunG
 * @date 2021/3/26 11:12
 */
public class MainBoardFactory {

    public static MainBoard createMainBoard(int type){
        MainBoard mainBoard = null;
        if (type == 1){
            mainBoard = new MainBoardASUS("华硕",1155);
        } else if (type ==2){
            mainBoard = new MainBoardMSI("msi",775);
        } else {
            return null;
        }
        return mainBoard;
    }
}
