package per.cyj.tutorial.day08.inherit.extend.demo04;

/**
 * 问题：
 * 1、我不仅仅要输出局部范围的num，还要输出本类成员范围的num。怎么办呢？
 * 2、我还想要输出父类成员范围的num。怎么办呢？
 * 如果有一个东西和this相似，但是可以直接访问父类的数据就好了。
 * 恭喜你，这个关键字是存在的：super。
 * <p>
 * this和super的区别？
 * 分别是什么呢？
 * this代表本类对应的引用。
 * super代表父类存储空间的表示（可以理解为父类引用，可以操作父类的成员）
 * <p>
 * 怎么用呢？
 * A：调用成员变量
 * this.成员变量 调用本类的成员变量
 * super.成员变量 调用父类的成员变量
 * B：调用构造方法
 * this(...) 调用本类构造方法
 * super(...) 调用父类构造方法
 * C：调用成员方法
 * this.成员方法 调用本类成员方法
 * super.成员方法 调用父类的成员方法
 * </p>
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
public class Extends {

    public static void main(String[] args) {
        Son s = new Son();
        s.show();
    }
}

