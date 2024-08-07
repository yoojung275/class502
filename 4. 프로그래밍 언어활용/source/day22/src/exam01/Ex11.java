package exam01;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.obj");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            HashMap<String, Object> data = (HashMap<String, Object>)ois.readObject();

            List<Book> books = (List<Book>)data.get("books");
            String str = (String)data.get("str");

            books.forEach(System.out::println);
            System.out.println(str);

        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
