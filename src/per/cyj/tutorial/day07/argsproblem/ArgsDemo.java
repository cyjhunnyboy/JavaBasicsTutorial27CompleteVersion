package per.cyj.tutorial.day07.argsproblem;

/**
 * 形式参数问题
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class ArgsDemo {

    /*
        形式参数的问题：
            基本类型：形式参数的改变不影响实际参数
            引用类型：形式参数的改变直接影响实际参数
     */
    public static void main(String[] args) {
        // 形式参数是基本类型的调用
        Demo d = new Demo();
        int result = d.sum(10, 20);
        System.out.println("result = " + result);
        System.out.println("---------------------");

        // 形式参数是引用类型的调用
        // 需求：我要调用StudentDemos类中的method()方法
        StudentDemo sd = new StudentDemo();
        // 创建学生对象
        Student s = new Student();
        sd.method(s);   // 把s的地址给到了这里
    }
}
