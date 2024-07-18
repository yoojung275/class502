package exam05;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        int result1 = cal.add(10, 20);
        System.out.println(result1);

        ComplexityCalculator cal2 = new ComplexityCalculator();
        int result2 = cal2.add(40, 50);
        System.out.println(result2);

        System.out.println(cal.num);
    }
}




