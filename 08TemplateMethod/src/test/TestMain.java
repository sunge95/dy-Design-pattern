package test;

import withpattern.LoginTemplate;
import withpattern.NormalLogin;
import withpattern.WorkerLogin;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/4/25 14:37
 */
public class TestMain {

    public static void main(String[] args) {
//        NormalLogin login = new NormalLogin();
//        String result = login.login("xx", "xx");
//        System.out.println(result);

//        WorkerLogin wl = new WorkerLogin();
//        String result = wl.login("zzt","workerPass");
//        System.out.println(result);

        LoginTemplate template = new NormalLogin();
        String login = template.login("sun", "geng");
        System.out.println(login);

        LoginTemplate template2 = new WorkerLogin();
        String l = template.login("sun","geng");
        System.out.println(l);
    }
}
