package per.cyj.tutorial.day08.inherit.extend.demo06;

/**
 * 如果父类没有无参构造方法，那么子类的构造方法会出现什么现象呢？-----报错
 * 如何解决呢？
 * A：在父类中加一个无参构造方法
 * B：通过使用super关键字去显式调用父类其他的带参的构造方法
 * C：子类通过this去调用本类的其他构造方法
 * 子类中一定要有一个去访问了父类的构造方法，否则父类数据没有被初始化
 * <p>
 * 注意事项：
 * this(...)或者super(...)必须出现在第一条语句上
 * 如果不是放在第一条语句上，就可能对父类的数据进行了多次初始化，所以必须放在第一条语句上。
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
class Son extends Father {

    public Son() {
        // 通过使用super关键字去显式调用父类其他的带参的构造方法
        super("随便给");
        System.out.println("Son6的无参构造方法");

        //  Error:对super的调用必须是构造器中的第一个语句
        // super("随便给");
    }

    public Son(String name) {
        // 通过使用super关键字去显式调用父类其他的带参的构造方法
        // super("随便给");

        // 子类通过this去调用本类的其他构造方法
        // 但是，本类其他构造也必须首先访问了父类构造
        this();
        System.out.println("Son6的带参（name）构造方法");

        // Error:对this的调用必须是构造器中的第一个语句
        // this();
    }
}
