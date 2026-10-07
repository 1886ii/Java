package demo;

abstract class A implements Animals{}

interface dogs extends Animals {}


class Cat implements Animals {

    @Override
    public void eat() {

    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(1);
    }
}
