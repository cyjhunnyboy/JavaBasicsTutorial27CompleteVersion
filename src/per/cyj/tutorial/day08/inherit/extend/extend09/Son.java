package per.cyj.tutorial.day08.inherit.extend.extend09;

/**
 * 方法重写的注意事项
 * A：父类中私有方法不能被重写（因为父类私有方法子类根本就无法继承）
 * B：子类重写父类方法时，访问权限不能更低（最好就一致）
 * C：类静态方法，子类也必须通过静态方法进行重写
 * 其实这个算不上方法重写，但是现象确实如此，至于为什么算不上方法重写，多态中我会讲解
 * <p>
 * 子类重写父类方法的时候，最好声明一模一样
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
class Son extends Father {

    // private void show() {}

    /*
    public void show() {
        System.out.println("Son-->show()");
    }
     */

    /*
        Error:(37, 10) java: per.cyj.day08.inherit.Son中的show()
        无法覆盖per.cyj.day08.inherit.Father中的show()
        正在尝试分配更低的访问权限; 以前为public
     */
    /*
    void show() {
        System.out.println("Son-->show()");
    }
     */

    public void show() {
        System.out.println("Son-->show()");
    }

    public static void method() {
    }

    /*
        Error:(64, 17) java: per.cyj.day08.inherit.Son0中的method()无法覆盖
        per.cyj.day08.inherit.Father中的method()
        被覆盖的方法为static
     */
    // public void method() {}
}
