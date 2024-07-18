package exam01;

public class Student {
    int id;
    String name;
    String subject;

    void showInfo() {
        System.out.printf("학번: %d, 이름: %s, 과목: %s\n", id, name, subject);
    }
}
