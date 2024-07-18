package exam01;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Ex01 {
    public static void main(String[] args) {
        Transportation tran1 = Transportation.BUS;
        Transportation tran2 = Transportation.BUS;

        System.out.println(tran1 == tran2);
    }
}
