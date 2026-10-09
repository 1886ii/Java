package impls;

import java.util.Arrays;
import java.util.Comparator;


public class People implements Comparable<People> {
    public String people;
    public int age;

    public People(String people, int age) {
        this.people = people;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "people='" + people + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        People[] peoples = new People[]{new People("lisi", 12), new People("lisiwu", 45), new People("wuyi",6)};
        Arrays.sort(peoples, new Comparator<People>() {
            @Override
            public int compare(People  o1, People o2) {
                return o2.age - o1.age;
            }
        }); // 方法重载 sort(int[] a)  sort(Object[] a)

       for (People x : peoples)
           System.out.println(x);
    }

    @Override
    public int compareTo(People o) {
        return this.age - o.age;
    }
}
