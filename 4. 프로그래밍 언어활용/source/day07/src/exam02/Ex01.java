package exam02;

public class Ex01 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; //ArithmeticException

            String str = null;
            System.out.println(str.toUpperCase()); //NullPointerException

            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) { // Exception e = new NullPointerException
            System.out.println("유입!");
            e.printStackTrace();
        }
        System.out.println("매우 중요한 코드...");


    }
}
