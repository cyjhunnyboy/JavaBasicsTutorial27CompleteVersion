package per.cyj.tutorial.day07.statickeyword;

/**
 * static关键字
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class StudentDemo {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.num);

        System.out.println(Student.num2);
        System.out.println(s.num2);
    }
}
