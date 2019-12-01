package ru.avalon.java.j20.labs.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Задание №4
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение файлов конфигурации".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        Properties properties = read("src/resources/database");

        /*
         * TODO(Студент): Выполнить задание №4
         *
         * 1. Реализовать метод read.
         *
         * 2. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение файла конфигураций описанного
     * параметром {@code path}.
     *
     * @param path путь к конфигурации
     * @return новый экземпляр типа {@link Properties}
     */
    private Properties read(String path) //throws FileNotFoundException,IOException 
    {
        Properties prop = new Properties();
        FileReader reader = null; 
        try
        {
            reader = new FileReader(path);
            prop.load(reader);
            
        }
        catch(FileNotFoundException e)
        {
          System.out.println("Error FileNotFound "+e.toString());
        }
        catch(IOException e)
        {
          System.out.println("Error IOException "+e.toString());
        }
        finally
        {
            try
            {
                if (reader != null)
                reader.close();
            }
            catch(IOException e)
            {
                System.out.println("Error IOException "+e.toString());
            }
            return prop;
        }
    }
}
