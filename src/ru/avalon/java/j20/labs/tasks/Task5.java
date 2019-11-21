package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.ResourceBundle;

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
       // ResourceBundle res = read("C:\\sk\\Laba2\\lab-2-SergVmk\\src\\resources\\strings\\titles.properties");
     //   ResourceBundle resru = read("C:\\sk\\Laba2\\lab-2-SergVmk\\src\\resources\\strings\\titles_ru.properties");
        
        Locale locale = Locale.FRANCE;
        ResourceBundle res2 = read("C:\\sk\\Laba2\\lab-2-SergVmk\\src\\resources\\strings\\titles.properties",locale);
        ResourceBundle res2ru = read("C:\\sk\\Laba2\\lab-2-SergVmk\\src\\resources\\strings\\titles_ru.properties",locale);
        
        
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
       FileReader reader = null; 
       BufferedReader buffer = null; 
       ResourceBundle res =  ResourceBundle.getBundle(path,Locale.CANADA);
       
       return res;
        
    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
       FileReader reader = null; 
       BufferedReader buffer = null; 
       ResourceBundle res =  ResourceBundle.getBundle(path,locale);
       return res; 
    }
}
