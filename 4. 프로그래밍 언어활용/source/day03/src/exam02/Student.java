package exam02;

public class Student {
    public static int id;
    private String name = "이이름"; // 공간이 할당되어야만 변수, 아직 변수 아님
    private String subject;

    public Student() {}


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;

    }

    public static void staticMethod() {
        // 객체와 상관없음-> this 지역변수가 없음-> 객체의 자원에 접근 x
        // 정적자원만 접근 가능
        System.out.println("정적메서드!!");
        //this.name = "이이름";
        //this.instanceMethod();\
        id = 1000;
    }

    public void instanceMethod() {
        //this 지약뱐수 존재-> 객체 자원 접근 가능
        System.out.println("인스턴스메서드!!");
        System.out.println(this.name);
        // 정적 자원은 객체 생성 이전부터 존재
        staticMethod();
        id = 1000;
    }
}
