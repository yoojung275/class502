package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Human human = new Human();
        human.move();

        //Animal animal = new Animal();
        //animal.move();

        Human human2 = new Human();
        human2.move();

        Human human3 = new Human();
        human3.move(); // human, human2, human3 다 같은 값
    }
}
