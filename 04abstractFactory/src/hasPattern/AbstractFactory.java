package hasPattern;

/**
 * 一个抽象工厂的规则(接口)
 * 这个工厂中定义 两个产生具体硬件的方法
 * 两个方法分别产生主板+CPU对象
 * 两个方法的具体实现是配套的  互相关联
 */
public interface AbstractFactory {
    MainBoard createMainBoard();

    CPU createCPU();
}
