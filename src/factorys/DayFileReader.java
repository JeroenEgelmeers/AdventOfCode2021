package factorys;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayFileReader {
    public List<Integer>    fileToIntegerList(String filepath, String delimiter)    {
        try(Scanner scanner = new Scanner(new File(filepath)).useDelimiter(delimiter)) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNext()) { list.add(Integer.valueOf(scanner.next())); }
            return list;
        } catch (FileNotFoundException e) { e.printStackTrace(); }

        return null;
    }

    public List<Long>    fileToLongList(String filepath, String delimiter)    {
        try(Scanner scanner = new Scanner(new File(filepath)).useDelimiter(delimiter)) {
            List<Long> list = new ArrayList<>();
            while (scanner.hasNext()) { list.add(Long.valueOf(scanner.next())); }
            return list;
        } catch (FileNotFoundException e) { e.printStackTrace(); }

        return null;
    }

    public List<String>     fileToStringList(String filepath, String delimiter)     {
        try(Scanner scanner = new Scanner(new File(filepath)).useDelimiter(delimiter)) {
            List<String> list = new ArrayList<>();
            while (scanner.hasNext()) { list.add(scanner.next()); }
            return list;
        } catch (FileNotFoundException e) { e.printStackTrace(); }

        return null;
    }
}