package ru.geekbrains.java_one.lesson_f.online;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;




public class Main {

     private static void copypaste (String FILE_IN1, String FILE_IN2, String FILE_OUT) throws IOException {

         FileOutputStream fos = new FileOutputStream(FILE_OUT);
         int ch;
         FileInputStream fis = new FileInputStream(FILE_IN1);
         while ((ch = fis.read()) != -1)
             fos.write(ch);
         fis.close();

         fis = new FileInputStream(FILE_IN2);
         while ((ch = fis.read()) != -1)
             fos.write(ch);
         fis.close();

         fos.flush();
         fos.close();
     }
 /*
Вопрс, почему файлы читаются из корневой директории src, а не из пекеджа ru.geekbrains.java_one.lesson_f.online?
По логике файлы должны браться из директории где программа запускается, по умолчанию. А если нужно из конкретной
директории запускать то жестко путь прописывать.
* */

    private static boolean isInFile(String fileName, String search) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        byte[] searchSequence = search.getBytes();
        int ch;
        int i = 0;              // geekgeekbrains
        while ((ch = fis.read()) != -1) {
            if (ch == searchSequence[i])
                i++;
            else {
                i = 0;
                if (ch == searchSequence[i]) i++;
            }
            if (i == searchSequence.length) {
                fis.close();
                return true;
            }
        }
        fis.close();
        return false;
    }
    private static String[] searchMatch(String[] files, String search) throws IOException {
        String[] list = new String[files.length];
        int count = 0;
        File path = new File( new File(".").getCanonicalPath() );
        File[] dir = path.listFiles();
        /*
        Я правильно понимаю, что тут мы ищем по всей директории в поисках файлов с любым разрешением(.txt, .jpg)?
        из них составляем список и идем по нему.
        Еще такой вопрос, как такая функция поведёт себя со скрытыми папками, которые в линуксе с "." начинаются?
        И как и в предыдущем методе, как выбирается директория откуда нужно начинать поиск?
         */
        for (int i = 0; i < dir.length; i++) {
            if (dir[i].isDirectory()) continue;
            for (int j = 0; j < files.length; j++)
                if (dir[i].getName().equals(files[j]))
                    if (isInFile(dir[i].getName(), search)) {
                        list[count] = dir[i].getName();
                        count++;
                        break;
                    }
        }
        return list;
    }

    public static void main(String[] args) {
        try {
               copypaste("file1.txt", "file2.txt", "fileOut.txt");
               System.out.println("данные из двух файлов в  fileOut.");
               isInFile("fileOut.txt", "Aces high");
            System.out.println("Check result in file_2 for third task is: " + isInFile("fileOut.txt", "Aces high"));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}