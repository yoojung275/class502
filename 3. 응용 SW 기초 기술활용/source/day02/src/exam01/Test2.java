package exam01;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            int roomNo = i % 10; // 나머지 0 ~ 9
            System.out.printf("학생%d, 방번호 %d번\n", i, roomNo);
    }

    }
}
