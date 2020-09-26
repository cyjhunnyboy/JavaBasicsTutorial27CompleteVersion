package per.cyj.tutorial.day08.inherit.training.demo05;

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
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void playGame() {
        System.out.println("猫玩英雄联盟");
    }
}
