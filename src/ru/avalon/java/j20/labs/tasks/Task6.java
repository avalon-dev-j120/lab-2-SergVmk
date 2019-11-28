package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);

        /*
         * TODO(Студент): Выполнить задание №6
         *
         * 1. Реализовать метод read.
         *
         * 2. При реализации следует пользоваться классами:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country}
     * из указанного файла.
     *
     * <p>Выполняет чтение файла построчно. Преобразование
     * из текста в объект выполняется с использованием
     * метода {@code valueOf} класса {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     */
    private Collection<Country> read(File file) throws IOException {
        BufferedReader buf = null;
        InputStreamReader input = null;
        FileInputStream finput = null;
        
        try
        {
            finput = new FileInputStream(file); 
            input = new InputStreamReader(finput);
            buf = new BufferedReader(input);
            Collection<Country> buffer = new LinkedList<>();
            String line;
            while((line = buf.readLine()) != null) {
                String[] splitstr = line.split(":"); 
                buffer.add(new Country(splitstr[0],splitstr[1]));
            }
            
        }
        catch (IOException e)
        {
            System.out.println("Error IOException "+e.toString());
        }
        finally
        {
            if (buf != null)
                buf.close();
            if (input != null)
                input.close();
            if (finput != null)
                finput.close();
            return Collections.unmodifiableCollection(buffer);
        }
     
    }
}
