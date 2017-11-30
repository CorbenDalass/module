package Zadacha4;

import java.io.*;

public class FileUtils {public static String read(String fileName) throws FileNotFoundException {
    //Этот спец. объект для построения строки
    StringBuilder sb = new StringBuilder();

    exists(fileName);
    File file=new File(fileName);
    try {
        //Объект для чтения файла в буфер
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName)),"windows-1251"));
        try {
            //В цикле построчно считываем файл
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } finally {
            //Также не забываем закрыть файл
            in.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }

    //Возвращаем полученный текст с файла
    return sb.toString();
}
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
}
