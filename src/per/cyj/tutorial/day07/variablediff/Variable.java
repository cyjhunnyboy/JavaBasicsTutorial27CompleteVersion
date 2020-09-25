package per.cyj.tutorial.day07.variablediff;

/**
 * 定义一个变量类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class Variable {

    // 成员变量
    // int num = 10;
    int num;

    public void show() {
        int num2 = 20;  // 局部变量
        // int num2;
        // Error:(43, 28) java: 可能尚未初始化变量num2
        System.out.println(num2);

        // 局部变量名可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则
        // int num = 100;
        // System.out.println(num); // 打印100

        System.out.println(num);    // 打印0
    }
}
