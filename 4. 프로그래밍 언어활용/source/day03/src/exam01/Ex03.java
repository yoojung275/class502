package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024, 3, 20);
        System.out.println(s1);
        //s1.toString(); -> (자동으로 출력된것) 멤버변수를 값을 확인하는 용도로 재정의
        //System.out.println(System.identityHashCode(s1));
        System.out.println(s1.toString());
    }
}
