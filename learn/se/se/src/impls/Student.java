package impls;

import java.util.Comparator;

class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.score - o2.score;
    }
}

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

        ScoreComparator scoreComparator = new ScoreComparator();
        int j = scoreComparator.compare(s1, s2);
        System.out.println(j);

        String s = "abcd";
        System.out.println(s.compareTo("abc"));
    }
}
