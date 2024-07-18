package exam01;

public class Ex01 {
    public static void main(String[] args) {

        Student s1 = new Student(); // s1 -> 지역변수

        s1.id = 1000; // 공간을 할당받은 것-> 변수가 됨
        s1.name = "이이름";
        s1.subject = "자바";
        
        s1.study(); // 인스턴스 메서드
        
        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.subject = "자바스크립트";

        s2.study();

        System.out.println(s1 == s2); //== -> 주소비교 (false-> 지역이 다름)
    
        Student s3 = s2; // 주소값 복사
        s3. name = "(수정)김이름";
        s3.study();

        s2.study(); // 같은 객체의 주소값으로 접근하기 때문
        System.out.println(s2 == s3);

        s1 = null; // null값을 대입하여 참조가 끊겨 객체의 자원에 접근할 수 없음
        s1.study();


    }
}
