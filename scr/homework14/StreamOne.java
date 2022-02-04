package homework14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {

    public static void main(String[] args) throws IOException {
        String fileName = "d:\\text.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(Paths.get(fileName));

        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {

            String buffer = list.get(i);
            buffer = buffer.toLowerCase();
            if (buffer.contains("«")) {
                StringBuffer buf = new StringBuffer(buffer);
                int index = buf.indexOf("«");
                buf.delete(index, index + 1);
                list2.add(buf.toString());
            }
            else {
                list2.add(buffer);
            }
        }
        list2.stream()
                .map(s -> s.split(" "))
                .collect(Collectors.toList()).stream()
                .flatMap(strings -> Arrays.stream(strings).sorted())
                .flatMap(String::lines).sorted()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


}
