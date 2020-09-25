package per.cyj.tutorial.day07.encapsulation;

/**
 * 封装概述
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class StudentDemo {

    /*
        我们在使用这个案例的过程中，发现了一个问题
            通过对象去给成员变量赋值，可以赋值一些非法的数据
            这是不合理的
            应该是这个样子的：在赋值之前，先对数据进行判断
            判断到底在哪里做比较合适呢？
            StudentDemo类是一个测试类，测试类一般只创建对象，调用方法。
            所以，这个判断应该定义在Student类中。
            而我们在成员变量的位置可不可以进行数据判断呢？
            是不可以的，因为做数据校验，必须要依靠一些逻辑语句。
            逻辑语句是应该定义在方法中，所以，我们最终决定在Student类中提供一个方法

        按照我们前面的分析，我们给出了一个方法进行校验。
        但是呢，它偏偏不调用方法来赋值，还是直接赋值了
        这样我们的方法就没有起到作用。
        我就应该要求你必须使用我的方法，而不能直接调用成员变量赋值。
        怎么去强制要求不能直接使用成员变量呢？

            针对这种情况，Java提供了一个关键字 private

        private：私有的。可以修饰成员变量和成员方法。
        注意：被private修饰的成员只能在本类中访问
        其实，我讲到现在讲解的是一种封装的思想
     */
    public static void main(String[] args) {
        // 创建学生对象
        Student s = new Student();
        s.show();
        System.out.println("--------------");

        // 给成员变量赋值
        s.name = "林青霞";
        // s.age = 27;
        s.setAge(27);
        s.show();
        System.out.println("--------------");

        // 给age赋值
        // 这个数据是不合理的
        // s.age = -27;

        // 通过方法给值
        // s.setAge(-27);

        // 我就是不调用赋值方法，直接赋值
        // s.age = -27;

        // 在Student中，设置age成员变量为私有的，即private int age;
        // 报错：age 在 Student 中是 private 访问控制
        // s.age = -27;

        // age变成了私有的了，只能通过调用赋值方法
        s.setAge(-27);
        s.show();
        System.out.println("--------------");
    }
}
