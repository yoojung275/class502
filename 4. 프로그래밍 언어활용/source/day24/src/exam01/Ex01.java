package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Ex01_01 th = new Ex01_01();
        //th.run();
        th.start();

        for(int i=0; i<5; i++) {
            System.out.println("메인 쓰레드 - " + i);
        }
    }
}

class Ex01_01 extends Thread {
    public void run() {
        for (int i =0; i<5; i++) {
            System.out.println(getName() + " - " + i);
        }
    }
}