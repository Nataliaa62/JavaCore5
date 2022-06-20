package dz5;

import dz5.tru.SavedGame;

import java.io.IOException;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class AppFile {


    public AppFile() throws IOException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Random random = new Random(1);
        ArrayList<String> header = new ArrayList(Arrays.asList("One", "Two", "Three"));
        int[][] value = new int[3][3];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length; j++) {
                value[i][j] = random.nextInt(32);
            }
        }
        FileClass fileClass = new FileClass(header, value);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/dz5/7.scv"))) {
            for (String b : header) {
                writer.write(b + ";");
            }
            writer.write('\n');

            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value.length; j++) {
                    writer.write(value[i][j] + ";");
                }
                writer.write('\n');
                writer.flush();
            }
        }

        try (FileReader reader = new FileReader("src/dz5/7.scv")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        //это попытка записать объект через сериализацию
      /*  try (
                //создаем 2 потока для сериализации объекта и сохранения его в файл
                FileOutputStream outputStream = new FileOutputStream("src/dz5/8.scv");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

            // сохраняем в файл
            objectOutputStream.writeObject(fileClass);

            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();

        }

        try (FileInputStream fileInputStream = new FileInputStream("src/dz5/8.scv");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            fileClass = (FileClass) objectInputStream.readObject();

            System.out.println(fileClass);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/

    }
}










