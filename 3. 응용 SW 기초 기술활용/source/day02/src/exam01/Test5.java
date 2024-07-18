package exam01;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {

            System.out.println(i + "단===========");
            for (int j = 1; j <= 9; j++) {
                if (i <= j) {
                    System.out.printf("%d X %d = %d\n", i, j, i * j);
                }
            }
        }
    }
}
