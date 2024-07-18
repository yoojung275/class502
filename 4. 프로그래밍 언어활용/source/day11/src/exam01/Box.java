package exam01;
// T는 Fruit의 하위클래스
public class Box<T extends Fruit & Eatable> { //Box<T> -> 지네릭 클래스/ T-> 타입 매개변수/ Box -> 원시타입
    private T item;
    //private static T item2; - 사용 불가

    //private static T[] nums = new T[3]; - 사용 불가

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public String toString() {
        // T == Object
        //iem.get(); -> 아직 오브젝트가 뭐가 될 지 모르는 상태이므로 .get()이 안되는거
        return item.get(); // T는 Fruit의 하위클래스-> 충분한 정보가 있으므로 T는 이제 오브젝트가 아니라 프룻임
    }
}
