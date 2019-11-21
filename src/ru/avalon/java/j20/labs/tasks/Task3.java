package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import ru.avalon.java.j20.labs.Task;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Задание №3
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных с
 * использованием буферизованных типов данных".
 */
public class Task3 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("C:\\sk\\Laba2\\lab-2-SergVmk\\assets\\countries.txt");
        File output = new File("C:\\sk\\Laba2\\lab-2-SergVmk\\assets\\countries_buffered_mode_outputtask3.txt");
        Collection<String> lines = read(input);
        write(output, lines);

        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Реализовать метод read.
         *
         *    При чтении файла следует пользоваться типами данных:
         *    FileReader и BufferedReader.
         *
         * 2. Реализовать метод write.
         *
         *    При реализации метода следует пользоваться типами данных:
         *    PrintWriter.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в коллекцию строк.
     *
     * <p>Каждый элемент коллекции представляет собой
     * отдельную строку файла.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private Collection<String> read(File file) throws IOException 
    {
        FileReader reader = null;
        BufferedReader buffer = null; 
        Collection<String> rezultsting = new ArrayList<>(1000);
        try
        {
            reader = new FileReader(file);
            buffer = new BufferedReader(reader);
            String line;
	    while((line = buffer.readLine()) != null)
            {
		rezultsting.add(line);
	    }
        }
        catch(IOException e)
        {
            System.out.println("Error "+e.toString());
        }
        finally
        {
            if(reader != null)
                reader.close();
            if(buffer != null)
                buffer.close();
            return rezultsting;
        }
    }

    /**
     * Выполняет запись коллекции строковых элементов в файл.
     *
     * <p>Каждый элемент коллекции должен быть записан в
     * файл отдельной строкой.
     *
     * @param file файл
     * @param collection коллекция строк
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, Collection<String> collection) throws IOException
    {
        PrintWriter writer  = null;
        try
        {
            writer = new PrintWriter(file);
            for (String str : collection)
            {
                writer.println(str);
            }
        }
        catch(IOException e)
        {
            System.out.println("Error "+e.toString());
        }
        finally
        {
            if (writer != null)
                writer.close();
        }
        
    }
}
