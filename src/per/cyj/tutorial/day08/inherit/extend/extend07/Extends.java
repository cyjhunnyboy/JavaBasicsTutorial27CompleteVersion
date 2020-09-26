package per.cyj.tutorial.day08.inherit.extend.extend07;

/**
 * 继承中成员方法的关系：
 * A：子类中的方法和父类中的方法声明不一样
 * B: 子类中的方法和父类中的方法声明一样，这个该怎么玩呢？
 * 通过子类对象调用方法：
 * 1）先找子类中，如果有，就调用
 * 2）再找父类中，如果有，就调用
 * 3）如果都没有就报错
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
public class Extends {

    public static void main(String[] args) {
        Son s = new Son();
        s.show();
        s.method();
        // 找不到符号
        // s.function();
    }
}
