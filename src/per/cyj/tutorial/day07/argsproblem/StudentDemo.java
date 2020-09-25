package per.cyj.tutorial.day07.argsproblem;

/**
 * 形式参数问题
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class StudentDemo {

    // 如果你看到了一个方法的形式参数是一个类类型（引用类型）
    // 这里其实需要的是该类的对象。
    public void method(Student s) { // 调用的时候，把main方法中的s的地址传递到了这里 Students s = new Studenets();
        s.show();
    }
}
