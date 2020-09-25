package per.cyj.tutorial.day07.privatekeyword;

/**
 * 学生类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    封装和private的使用
        1、把成员变量用private修饰
        2、提供对应的getXxx()和setXxx()方法
 */
class Student {

    // 姓名
    private String name;

    // 年龄
    private int age;

    // 姓名获取值
    public String getName() {
        return name;
    }

    // 姓名设置值
    public void setName(String n) {
        name = n;
    }

    // 年龄获取值
    public int getAge() {
        return age;
    }

    // 年龄设置值
    public void setAge(int a) {
        age = a;
    }
}
