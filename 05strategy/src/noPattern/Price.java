package noPattern;

import sun.awt.datatransfer.DataTransferer;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/26 13:42
 */
public class Price {

    //用 数字来做身份识别， 缺点，不知道在描述什么
    public static double buyA(double goodsPrice,int customerType){
        double result = 0;//存储最终计算后的返回值
        System.out.println("同学，决定好学习了么???");

        switch (customerType){
            case 0:
                System.out.println("对于新客户或者是普通用户来说，对不起，没有折扣");
                result = goodsPrice;
                break;
            case 1:
                System.out.println("认识阿拓老师，给你便宜点儿");
                result = goodsPrice - 1999;
                break;
            case 2:
                System.out.println("认识agen老师，给你便宜点儿");
                result = goodsPrice -3999;
                break;
            default:
                System.out.println("笨蛋！ 给你个惊喜");
                result = 999999999;
                break;
        }
        return result;
    }

    // 用类常量来 做识别
    public static double buyB(double goodsPrice,int customerType){
        double result = 0;//存储最终计算后的返回值
        System.out.println("同学，决定好学习了么???");

        switch (customerType){
            case ClassType.NORMAL:
                result = normal(goodsPrice);
                break;
            case ClassType.ATUO:
                result = atuo(goodsPrice);
                break;
            case ClassType.A_GENG:
                result =a_gen(goodsPrice);
                break;
            default:
                result = def(goodsPrice);
                break;
        }
        return result;
    }

    //将方法中用来计算的核心拆分出去
    //单一原则  每一个方法只负责一件事情
    //以下这几个小弟都是只做一件事    计算的核心
    private static double normal(double goodsPrice){
        System.out.println("对于新客户或者是普通用户来说，对不起，没有折扣");
        return goodsPrice;
    }

    private static double atuo(double goodsPrice){
        System.out.println("认识阿拓老师，给你便宜点儿");
        return goodsPrice -1999;
    }

    private static double a_gen(double goodsPrice){
        System.out.println("认识agen老师，给你便宜点儿");
        return goodsPrice -3999;
    }

    private static double def(double goodsPrice){
        System.out.println("笨蛋！ 给你个惊喜");
        return 999999;
    }

    // 用枚举来 做识别
//    public static double buyC(double goodsPrice,int customerType){
//        double result = 0;//存储最终计算后的返回值
//        System.out.println("同学，决定好学习了么???");
//
//        switch (customerType){
//            case EnumType.Normal:
//                System.out.println("对于新客户或者是普通用户来说，对不起，没有折扣");
//                result = goodsPrice;
//                break;
//            case ClassType.ATUO:
//                System.out.println("认识阿拓老师，给你便宜点儿");
//                result = goodsPrice - 1999;
//                break;
//            case ClassType.A_GENG:
//                System.out.println("认识agen老师，给你便宜点儿");
//                result = goodsPrice -3999;
//                break;
//            default:
//                System.out.println("笨蛋！ 给你个惊喜");
//                result = 999999999;
//                break;
//        }
//        return result;
//    }


}
