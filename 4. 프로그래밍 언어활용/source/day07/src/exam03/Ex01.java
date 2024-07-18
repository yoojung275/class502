package exam03;

public class Ex01 {
    public static void main(String[] args) throws Exception{
        Resources res = new Resources();
            Resources2 res2 = new Resources2();
            try(res; res2) {
            // res가 AutoCloseable 인터페ㅣ스 구현 객체인지 체크-> close() 메서드가 자동 호출

            //
            //AutoCloseable auto = res;
            //auto.close(); //형변환
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
