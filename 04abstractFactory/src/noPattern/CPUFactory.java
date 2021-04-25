package noPattern;

/**
 * Description:cpu工厂
 *
 * @author:SunG
 * @date 2021/3/26 11:25
 */
public class CPUFactory {

    public static CPU createCpu(int type){
        CPU cpu = null;
        if(type==1){//inter
            cpu = new CPUInter("Inter",1155);
        }else if(type==2){
            cpu = new CPUAMD("AMD",775);
        }else if(type==3){

        }
        return cpu;
    }
}
