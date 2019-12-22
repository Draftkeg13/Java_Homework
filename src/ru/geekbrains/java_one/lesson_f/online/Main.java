package ru.geekbrains.java_one.lesson_f.online;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
    //        FileOutputStream fos = new FileOutputStream("test3.txt", true);
    //        PrintStream ps = new PrintStream(fos);
//            byte[] i = {'H', 'e', 'l', 'l', 'o', '\n'};
//            String str = "World!";
//            fos.write(str.getBytes());
     //       ps.println("Hello world123!");
     //       fos.close();

            FileInputStream fis = new FileInputStream("file1.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNext()) {
                String transfer = sc.nextLine();
                //System.out.println(sc.nextLine());

            FileOutputStream fos = new FileOutputStream("merged_file.txt", true);
            PrintStream ps = new PrintStream(fos);
            ps.println(transfer);
            fos.close();


            }
//            int b;
//            while ((b = fis.read()) != -1) {
//                System.out.print((char) b);
//            }
            fis.close();
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
