package per.cyj.tutorial.day07.standantversion;

/**
 * 学生类标准版本
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    一个标准代码的最终版
    学生类：
        成员变量：name， age
        构造方法：无参，带两个参数
        成员方法：
            1、getXxx()/SetXxx()
            2、show()：输出该类的所有成员变量值
    给变量赋值的方式：
        1、setXxx()方法
        2、构造方法
    获取成员变量值的方式：
        1、通过getXxx分别获取然后拼接
        2、通过调用show()方法
 */
public class Student {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 无参构造方法
     */
    public Student() {
    }

    /**
     * 带所有参数构造方法
     *
     * @param name 姓名
     * @param age  年龄
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取姓名
     *
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 成员方法
     * 输出所有的成员变量值
     */
    public void show() {
        System.out.println(name + "---" + age);
    }
}
