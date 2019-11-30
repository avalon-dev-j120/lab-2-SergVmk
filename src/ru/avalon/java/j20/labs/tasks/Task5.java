package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import ru.avalon.java.j20.labs.Task;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.nio.charset.Charset;


/**
 * Задание №5
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
      
        //Язык по умолчанию для ОС может быть и не английским, как у меня.
        //Переставим. Можно было конечно файлы переименовать в title - > title_en , title_ru -> title 
        if (Locale.getDefault() != Locale.ENGLISH)
            Locale.setDefault(Locale.ENGLISH); 
        ResourceBundle resDEF = read("resources/strings/titles");
        ResourceBundle resRU = read("resources/strings/titles",new Locale("ru"));
        ResourceBundle resIT = read("resources/strings/titles",Locale.ITALY);
        
        /*
         * TODO(Студент): Выполнить задание №5
         *
         * 1. Реализовать метод read.
         *
         * 2. Прочитать ресурсы с использованием локализации по умолчанию.
         *
         * 3. Прочитать ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию.
         *
         * 4. С использованием отладчика сравнить полученные ресурсы и
         *    проверить корректность работы программы.
         */
    }
    /**
     * Выполняет чтение локализованных ресурсов с использованием
     * локализации по умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path) {
        ResourceBundle res =  ResourceBundle.getBundle(path);
      
       return res;
    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
       ResourceBundle res =  ResourceBundle.getBundle(path,locale);
       return res; 
    }
}
