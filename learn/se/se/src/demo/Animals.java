package demo;

public interface Animals {
    // 默认public static final修饰
//    public static final int SIZE = 10;
    int SIZE = 10;

    // 默认public static修饰
    void eat();

    // 可以有方法体
    public static void test() {
        System.out.println("t");
    }

    default void test1() {
        System.out.println(1);
    }
}


class B {
    public void a() {
        System.out.println(11);
    }
}

class C  extends B implements Animals{
    public static void main(String[] args) {
        C c = new C();
        c.a();
    }

    @Override
    public void eat() {

    }
}




