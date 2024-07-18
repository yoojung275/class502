package exam01;

public class Student {
    public static int id;
    private String name;
    private String subject;

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }
    
    public static void staticMethod() {
        System.out.println("정적 메서드!");
        // this.name = 1000; 객체 생성 관련 x, this 존재 x
        // 인스턴스 자원은 정적 메서드에서 접근 불가
        id = 2000; // 정적 자원만 접근 가능
    }

    public void instanceMethod() {
        //System.out.println("name=" + this.name);
        System.out.println("name" + name);
        System.out.println("인스턴스 메서드!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
