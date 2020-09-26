package per.cyj.tutorial.day08.inherit.training.training02;

/**
 * 看程序写结果：
 *      A：一个类的静态代码块、构造代码块、构造方法的执行顺序
 *          静态代码块-->构造代码块-->构造方法
 *      B：静态的内容是随着类的加载而加载：静态代码块的内容会优先执行
 *      C：子类初始化之前先会进行父类的初始化
 *
 *      1: 静态代码块Fu
 *      2：静态代码块Zi
 *      3：构造代码块Fu
 *      4：无参构造方法Fu
 *      5：构造代码块Zi
 *      6：无参构造方法Zi
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
public class Extends {

    public static void main(String[] args) {
        Zi z = new Zi();
    }
}
