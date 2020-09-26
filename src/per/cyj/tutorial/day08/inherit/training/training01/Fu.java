package per.cyj.tutorial.day08.inherit.training.training01;

/**
 * 看程序写结果：
 *      A：成员变量 就近原则
 *      B：this和super的问题：this访问本类的成员；super访问父类的成员
 *      C：子类构造方法执行前默认先执行父类的无参构造方法
 *      D：一个类的初始化过程：
 *          成员变量进行初始化
 *          1）默认初始化
 *          2）显式初始化
 *          3）构造方法初始化
 *      1：Fu
 *      2：Zi
 *      3：30
 *      4：20
 *      5：10
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
public class Fu {

    public int num = 10;

    public Fu() {
        System.out.println("Fu");
    }
}
