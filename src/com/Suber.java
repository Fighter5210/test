package com;

/**
 * @program: test
 * @description:
 * @author: zxb
 * @create: 2019-04-24 15:55
 **/
public class Suber extends Super {
    @Override
    void test() {
        System.out.println("打印子类1");
    }
    public static void main(String[] args) {
        Super s = new Suber();
        s.test();
    }
}

