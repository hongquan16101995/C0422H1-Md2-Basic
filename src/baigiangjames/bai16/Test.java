package baigiangjames.bai16;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Classes classes1 = new Classes("Phương", 20);
        Classes classes2 = new Classes("Khoa", 22);
        Classes classes3 = new Classes("Chiến", 18);
        Classes classes4 = new Classes("Hà", 18);
        ArrayList<Classes> classes = new ArrayList<>();
        classes.add(classes1);
        classes.add(classes2);
        classes.add(classes3);
        classes.add(classes4);

//        writeListClasses(classes);
//        writeClasses(classes4);
        for (Classes c : readClasses()) {
            System.out.println(c);
        }
    }

    public static void writeListClasses(ArrayList<Classes> classes) {
        File file = new File("classes.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            for (Classes c : classes) {
                bufferedWriter.write(c.getName() + ", " + c.getAge() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeClasses(Classes classes) {
        File file = new File("classes1.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(classes.getName() + ", " + classes.getAge() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Classes> readClasses() {
        File file = new File("classes1.txt");
        ArrayList<Classes> classes = new ArrayList<>();
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while((value = bufferedReader.readLine()) != null){
                System.out.println(value);
                String[] strings = value.split(", ");
                Classes cl = new Classes(strings[0], Integer.parseInt(strings[1]));
                classes.add(cl);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return classes;
    }
}
