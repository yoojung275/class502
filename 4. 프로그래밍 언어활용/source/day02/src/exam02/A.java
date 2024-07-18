package exam02;

public class A { // public-> 모든 패키지에서 접근 가능
    // exam02.A -> 진짜 클래스명(패키지명을 포함해야 함)
    public int numA;
    int numAA; // default 접근 제어자 (앞에 굳이 default 안씀)

    private int numAAA;

    protected int numB;

    void printNum() {
        numAAA = 100;
        System.out.println(numAAA);

    }



}
