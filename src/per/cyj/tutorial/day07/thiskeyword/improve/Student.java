package per.cyj.tutorial.day07.thiskeyword.improve;

/**
 * Student类改进版
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    标准的代码改进版
    this: 哪个对象调用那个方法，this就代表那个对象
 */
public class Student {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    public String getName() {
        // 这里其实是隐含了this
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        // 这里其实是隐含了this
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
