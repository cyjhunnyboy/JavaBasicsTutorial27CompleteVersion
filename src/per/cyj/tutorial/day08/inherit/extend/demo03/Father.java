package per.cyj.tutorial.day08.inherit.extend.demo03;

/**
 * 继承注意事项：
 * A：子类只能继承父类所有非私有的成员（成员方法和成员变量）
 * B：子类不能继承父类的构造方法，但是可以通过super（后面讲）关键字去访问父类构造方法。
 * C：不能为了部分功能而去继承
 * <p>
 * class A {
 * public void show1() {}
 * public void show2() {}
 * }
 * <p>
 * class B {
 * public void show2() {}
 * public void show3() {}
 * }
 * <p>
 * 我们发现B类中出现了和A类一样的show2()方法，所以，我们就用继承来体现
 * class B extends A {
 * public void show3() {}
 * }
 * 这样其实不好，因为这样你不但有了show2()，还多了show1()，可能show1()不是你想要的。
 * <p>
 * 那么，我们什么时候考虑使用继承呢？
 * 继承体现的是一种关系："is a"
 * Person
 * Student
 * LittleTeacher
 * 水果
 * 苹果
 * 香蕉
 * 橘子
 * 采用假设法：如果有两个类A，B。只要它们符合A是B的一种，或者B是A的一种，就可以考虑使用继承。
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
class Father {

    private int num = 10;
    public int num2 = 20;

    // 私有方法，子类不能继承
    private void method() {
        System.out.println(num);
        System.out.println(num2);
    }

    public void show() {
        System.out.println(num);
        System.out.println(num2);
    }
}
