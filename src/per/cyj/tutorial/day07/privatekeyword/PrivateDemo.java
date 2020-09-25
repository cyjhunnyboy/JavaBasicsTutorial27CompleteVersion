package per.cyj.tutorial.day07.privatekeyword;

/**
 * private关键字
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class PrivateDemo {

    /*
        private：
            是一个权限修饰符
            可以修饰成员变量和成员方法
            被其修饰的成员只能在本类中访问
     */
    public static void main(String[] args) {
        Demo demo = new Demo();
        // 不能访问私有的成员变量
        // Error: num 在 Demo 中是 private 访问控制
        // System.out.println(demo.num);
        demo.show();

        // 不能访问私有的成员方法
        // Error: method() 在 Demo 中是 private 访问控制
        // demo.method();
        demo.function();
    }
}
