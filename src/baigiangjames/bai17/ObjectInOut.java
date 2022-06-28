package baigiangjames.bai17;

import java.io.*;
import java.util.ArrayList;

public class ObjectInOut {
    public static void main(String[] args) {
        writerObject();
        readerObject();
    }

    public static void writerObject() {
        try {
            File file = new File("test1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            Human human = new Human("quân", 1);
            Human human1 = new Human("quân", 2);
            objectOutputStream.writeObject(human);
            objectOutputStream.writeObject(human1);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readerObject() {
        try {
            File file = new File("test1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object object ;
            while ((object = objectInputStream.readObject()) != null) {
                Human human = (Human) object;
                System.out.println(human);
            }
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println();
        }
    }
}
