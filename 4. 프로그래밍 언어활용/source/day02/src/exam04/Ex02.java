package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "자바" );
        // s1 -> 참조변수(스택) / new Student -> 참조 자료형(힙)
        // 모든 클래스 형태는 참조 자료형

        //s1.id = 1000;
       // s1.name = "이이름";
        //s1.subject = "자바";
       s1.study();
        //System.out.println(System.identityHashCode(s1));

        Student s2 = new Student(1001, "김이름", "자바스크립트");
        s2.study();
    }
}
