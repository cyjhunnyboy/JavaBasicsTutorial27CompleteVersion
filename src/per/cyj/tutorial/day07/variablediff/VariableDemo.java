package per.cyj.tutorial.day07.variablediff;

/**
 * 成员变量和局部变量的区别
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class VariableDemo {

    /*
        成员变量和局部变量的区别？
            A：在类中的位置不同
                成员变量：在类中方法外
                局部变量：在方法定义中或者方法声明上
            B：在内存中的位置不同
                成员变量：在堆内存
                局部变量：在栈内存
            C：生命周期不同
                成员变量：随着对象的创建而存在，随着对象的消失而消失
                布局变量：随着方法的调用而存在，随着方法的调用完毕而消失
            D：初始化不同
                成员变量：有默认初始化值
                局部变量：没有默认初始化值，必须定义，赋值，然后才能使用
        注意事项：
            局部变量名可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则
     */
    public static void main(String[] args) {
        Variable v = new Variable();
        // 访问成员变量
        System.out.println(v.num);
        v.show();
    }
}
