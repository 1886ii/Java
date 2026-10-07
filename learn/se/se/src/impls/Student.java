package impls;

public class Student implements Comparable<Student>{
    public int age;
    public int score;

    @Override
    public int compareTo(Student o) {
        return this.age > o.age ? 1 : 0;
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 11;
        Student s2 = new Student();
        s2.age = 12;

        int i = s1.compareTo(s2);
        System.out.println(i);
    }
}
