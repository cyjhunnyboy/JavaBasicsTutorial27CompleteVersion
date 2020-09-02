package per.cyj.tutorial.day02;

/**
 * Java注释
 *
 * @author chenyongjun
 * @since 2020-02-05
 */

/*
 *      需求：我准备写一个java程序，把“HelloWord”这句话输出在控制台
 *      分析：
 *        a.要写一个Java程序，必须定义类
 *        b.数据能够输出，说明我们的程序是可以独立运行的，而程序要独立运行，必须定义main方法
 *        c.把数据输出到控制台，必须使用输出语句
 *      实现：
 *        a.java语言提供了一个关键字：class用来定义类，后面跟类名
 *        b.main方法的格式是固定的：
 *          public static void main(String[] args){
 *
 *          }
 *        c.输出语句的格式是固定的：
 *          System.out.println("Hello, World!");
 *          "Hello, World"这个内容是可以改变的
 */
// 这是我的HelloWord案例
public class Day02Demo05 {

    /*
        为了程序能够独立运行，定义了main方法
        main方法是程序的入口，被JVM自动调用
     */
    public static void main(String[] args) {
        // 为了把数据显示在控制台，我们就用了输出语句
        System.out.println("Hello, World!");
    }
}
