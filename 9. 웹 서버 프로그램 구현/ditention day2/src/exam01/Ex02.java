package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student(); //객체 생성
        s1.id = 1000;
        s1.name = "이이름";
        s1.subject = "과목";

        s1.showInfo();

        Student s2 = s1; //s2에는 s1이 가지고 있는 값(객체의 주소값)을 대이

        s2.name = "김이름";
        s2.showInfo();
        s1.showInfo();
    }
}
