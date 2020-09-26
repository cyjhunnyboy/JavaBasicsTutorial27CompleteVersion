package per.cyj.tutorial.day08.inherit.extend.extend02;

/**
 * Java中继承的特点：
 * A：Java只支持单继承，不支持多继承
 * 有些语言是支持多继承，格式：extends 类1，类2,...
 * B：Java支持多层继承（继承体系）
 *
 * @author chenyongjun
 * @since 2020-02-10
 */
public class Extends {

    public static void main(String[] args) {
        Son s = new Son();
        s.method();
        s.show();
    }
}

/*
class Father {}

class Mather {}

// 正确的，Java只支持单继承
class Son extends Father {}

// 错误的，Java不支持多继承
class Son extends Father, Mather {}
*/

