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
public class Extends {

    public static void main(String[] args) {
        // 测试猫
        // 方式1
        Cat c1 = new Cat();
        c1.setName("Tom");
        c1.setAge(3);
        c1.setColor("白色");
        System.out.println("猫的名字是'" + c1.getName() + "'，的年龄是'" + c1.getAge() + "'，的颜色是'" + c1.getColor() + "'。");
        c1.eat();
        c1.playGame();
        System.out.println("------------------------------------");

        // 方式2
        Cat c2 = new Cat("杰瑞", 5, "土豪金");
        System.out.println("猫的名字是'" + c2.getName() + "'，的年龄是'" + c2.getAge() + "'，的颜色是'" + c2.getColor() + "'。");
        c2.eat();
        c2.playGame();
        System.out.println("------------------------------------");

        // 测试狗
        // 方式1
        Dog d1 = new Dog();
        d1.setName("Catty");
        d1.setAge(2);
        d1.setColor("白色");
        System.out.println("狗的名字是'" + d1.getName() + "'，的年龄是'" + d1.getAge() + "'，的颜色是'" + d1.getColor() + "'。");
        d1.eat();
        d1.lookDoor();
        System.out.println("------------------------------------");

        // 方式2
        Dog d2 = new Dog("哈士奇", 5, "灰色");
        System.out.println("狗的名字是'" + d2.getName() + "'，的年龄是'" + d2.getAge() + "'，的颜色是'" + d2.getColor() + "'。");
        d2.eat();
        d2.lookDoor();
    }
}
