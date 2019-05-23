package com;

/**
 * @program: test
 * @description:
 * @author: zxb
 * @create: 2019-04-24 15:55
 **/
public class Suber2 extends Super {
    @Override
    void test() {
        System.out.println("打印子类2");
    }
    public static void main(String[] args) {
        Super s = new Suber2();
        s.test();
    }
}

