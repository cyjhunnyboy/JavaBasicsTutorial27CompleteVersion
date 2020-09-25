package per.cyj.tutorial.day07.privatekeyword;

/**
 * private关键字
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
class Demo {

    // int num = 10;
    // 用private修饰
    private int num = 10;

    public void show() {
        System.out.println(num);
    }

    private void method() {
        System.out.println("method");
    }

    public void function() {
        method();
    }
}
