package homework11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;

public class Sales {
    public static void main(String[] args) {
        String fileName = "D:\\DB.txt";
        File file = new File(fileName);
        List<String> list = new ArrayList<>();
        try (Stream<String> linesStream = Files.lines(file.toPath())) {
            linesStream.forEach(line -> {

                list.add(line);
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(list.toString());
        HashMap<String, Integer> map = new HashMap<>();
        TreeMap<String, HashMap<String, Integer>> tMapp = new TreeMap<>();
        String[] buff = {" ", " ", " "};
        for (int i = 0; i < list.size(); i++) {
            buff = list.get(i).split(" ");
            if (map.containsKey(buff[1])) {
                int buf = map.get(buff[1]) + Integer.parseInt(buff[2]);
                map.put(buff[1], buf);
            } else {
                map.put(buff[1], Integer.parseInt(buff[2]));
            }
            tMapp.put(buff[0], map);
        }
        System.out.println(tMapp.toString());

    }
}
