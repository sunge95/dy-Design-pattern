package withPattern;

import nopattern.User;
import nopattern.UserBox;

/**
 * 这是刚才那个核心计算的类
 * 这个类中有一个计算的方法
 */
public class Bonus extends Boss{//A

    //原始对象的方法 名字随意
    @Override
    public double calcBonus(String name){
        //我们认为3%的奖金以后也有可能不发     底薪额外的部分
        //想要把所有额外的部分都拆分出去
        System.out.println("默认没有奖金");
        return 0;
    }

    //=========================================================
    //a对象  一个方法testA
    //b对象  一个自己的方法testB
    //b对象拥有b和a两个方法???
    //B extends A    b.testA()  b.testB();  继承A的方法 不能修改A的方法

    //a和b对象组合
    //public class B{
    //      一个属性
    //      private A a = new A();
    //
    //      public void testA(){
    //          多点事情
    //          a.testA();
    //          多点事情
    //      }
    //      public void testB(){
    //          自己干
    //      }
    //}
}
