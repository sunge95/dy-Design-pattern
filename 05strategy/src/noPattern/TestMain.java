package noPattern;

import java.util.Scanner;

/**
 * Description:策略模式
 *
 * @author:SunG
 * @date 2021/3/26 13:27
 */
public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入课程价格");
        String  price = scanner.nextLine();
        System.out.println("输入身份：");
        String s = scanner.nextLine();

//        double a = Price.buyA(Double.parseDouble(price), Integer.parseInt(s));
//        System.out.println(a);

        double b = Price.buyB(Double.parseDouble(price), Integer.parseInt(s));
        System.out.println(b);


    }
}
