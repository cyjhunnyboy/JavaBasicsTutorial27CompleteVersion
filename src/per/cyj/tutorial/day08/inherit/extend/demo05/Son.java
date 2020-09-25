package per.cyj.tutorial.day08.inherit.extend.demo05;

/**
 * 继承中构造方法的关系
 * A：子类中所有的构造方法默认都会访问父类中无参构造方法
 * B：为什么呢？
 * 因为子类继承父类中的数据，可能还会使用父类中的数据。
 * 所以，子类初始化之前，一定要先完成父类数据的初始化
 * <p>
 * 注意：子类每一条构造方法的第一条语句默认是：super();
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
class Son extends Father {

    public Son() {
        // 默认调用父类无参构造方法，可以不写
        // super();
        System.out.println("Son的无参构造方法");
    }

    public Son(String name) {
        // 默认调用父类无参构造方法，可以不写
        // super();
        System.out.println("Son的带参（name）构造方法");
    }
}
