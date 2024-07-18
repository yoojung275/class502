package exam01;

public class Student {
    int id; //학번 -> 아직 변수아님
    String name; // 이름
    String subject; // 과목

    public Student() { //생성자 오버로드
        id= 1000;
        name = "이이름";
        subject = "자바";
    }

    public Student(int _id, String _name, String _subject) {
        id= _id;
        name = _name;
        subject = _subject;

        // 기본 생성자(Default 생성자) -> 없으면 안되니까 컴파일러가 자동 추가해줌
        // 객체가 생성된 이후 실행 코드
        // 반환값이 객체의 주소값으로 존재 -> return 코드는 못씀(내가 통제를 못하니까)
        // 실행 시점? id, name, subject에 공간을 할당 받은 상태
        // System.out.println("객체 생성 이후 실행");
        // 인스턴스 변수의 초기화 작업을 주로 수행
        //id = 1000;
        //name = "이이름";
        //subject = "자바";

    }

    void study() {
        // void-> 반환값(return) 따로 정의 하지 않음
        // 1) 객체 생성 2) 호출 - 호출 시점에는 이미 공간 할당
        System.out.printf("학번:%d, %s(이)가 %s(을)를 공부한다.\n", id, name, subject);
    }
}
