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
