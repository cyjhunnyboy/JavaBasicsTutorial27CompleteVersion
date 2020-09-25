package per.cyj.tutorial.day07.construction;

/**
 * 构造方法
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    构造方法：给对象的数据进行初始化
    格式
        1、方法名和类名相同
        2、没有返回值类型，连void都没有
        3、没有具体的返回值
 */
public class Construct1 {

    // 姓名
    private String name; // null
    // 年龄
    private int age; // 0

    public Construct1() {
        System.out.println("这是构造方法");
    }
}
