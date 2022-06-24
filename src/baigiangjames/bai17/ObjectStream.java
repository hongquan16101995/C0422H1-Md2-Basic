package baigiangjames.bai17;

import java.io.*;
import java.util.ArrayList;

public class ObjectStream {
    public static void main(String[] args) {
        Human human = new Human("Quân", 27);
        Human human1 = new Human("Khoa", 22);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(human);
        humans.add(human1);
        writerObject(humans);
        ArrayList<Human> humanRead = readerObject();
        for (Human h : humanRead) {
            System.out.println(h);
        }
    }

    public static void writerObject(ArrayList<Human> humans) {
        try {
            File file = new File("test1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(humans);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Human> readerObject() {
        ArrayList<Human> humans = new ArrayList<>();
        try {
            File file = new File("test1.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            humans = (ArrayList<Human>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return humans;
    }
}
