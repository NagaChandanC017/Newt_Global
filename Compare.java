import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student s) {
        return this.age>s.age?1:-1;
    } 
}

public class Compare {
    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        st.add(new Student(24, "Mokshit"));
        st.add(new Student(21, "Chandan"));
        st.add(new Student(22, "Koushik"));
        st.add(new Student(20, "Abhi"));
        st.add(new Student(19, "Harika"));

        Comparator<Student> com=(i,j)-> (i.name).length()>(j.name).length()?1:-1;

        Collections.sort(st);
        
        for(Student n:st){
            System.out.println(n);
        }
    }
}
