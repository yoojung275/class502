package exam01;

public class Ex02 {
    public static void main(String[] args) { // main -> 시작점인 함수
        // 가장 먼저 들어간 main이 다른 함수 작동할때까지 기다림 (스택구조)
        int n1 = 10;
        int n2 = 20;
        // 변수명이 같지만 main의 지역변수이기에 static의 지역변수(n1, n2)와 다른거
        int r = add(10, 20); // 두번째 실행되는 함수
        //System.out.println(r);
    }

    static int add(int n1, int n2) { // 함수지역
        // n1, n2 -> 아직 변수가 아님
        int result = n1 + n2;

        return result; // 함수 종료 -> 할당된 메모리 삭제(임시 메모리=스택 메모리)

    }
}
