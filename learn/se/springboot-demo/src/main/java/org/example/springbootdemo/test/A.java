package org.example.springbootdemo.test;

class C {
    public B b;
}

class B {
    public A a;
}

public class A {
    public C c;

    public B b;

    public static void main(String[] args) {
        A a = new A();
    }
}
