package per.cyj.tutorial.day08.inherit.extend.extend01;

/**
 * 继承概述：把多个类中相同的内容给提取出来定义到一个类中。
 * 如何实现继承呢？
 * Java提供了关键字：extends
 * 格式：
 * class 子类名 extends 父类名 {}
 * 好处：
 * A：提高了代码的复用性
 * B：提高了代码的可维护性
 * C：让类与类之间产生了关系，是多态的前提
 * 类与类产生了关系，其实也是继承的一个弊端：类的耦合性增强
 * 开发的原则：低耦合，高内聚。
 * 耦合：类与类的关系
 * 内聚：就是自己完成某件事情的能力
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
class Student extends Person {
}
