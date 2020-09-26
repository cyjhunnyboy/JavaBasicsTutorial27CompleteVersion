package per.cyj.tutorial.day08.inherit.training.training05;

/**
 * 猫狗案例讲解
 * 先找到具体的事物，然后发现具体的事物有共性，才提取出一个父类
 * 猫：
 *      成员变量：姓名，年龄，颜色
 *      构造方法：无参，带参
 *      成员方法：getXxx()/setXxx()，eat()，playGame()
 * 狗：
 *      成员变量：姓名，年龄，颜色
 *      构造方法：无参，带参
 *      成员方法：getXxx()/setXxx()，eat()，lookDoor()
 * 共性：
 *      成员变量：姓名，年龄，颜色
 *      构造方法：无参，带参
 *      成员方法：getXxx()/setXxx()，eat()
 * 把共性定义到一个类中，这个类叫：动物类
 * 动物类：
 *      成员变量：姓名，年龄，颜色
 *      构造方法：无参，带参
 *      成员方法：getXxx()/setXxx()，eat()
 *      猫：
 *          构造方法：无参、带参
 *          成员方法：playGame()
 *      狗：构造方法：无参、带参
 *          成员方法：lookDoor()
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
public class Animal {

    // 姓名
    private String name;
    // 年龄
    private int age;
    // 颜色
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("不要睡了，该吃饭了！");
    }
}
