import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JtoJava {
    private static final String filePath = "D:\\journal_ru.json";

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        List<String> list = new ArrayList<>();
        List<DayJournal> listDay = new ArrayList<>();
        try {

            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filePath));
            for (int j = 0; j < jsonArray.size(); j++) {
                JSONObject obj = (JSONObject) jsonArray.get(j);
                boolean b = (boolean) obj.get("squirrel");
                String a = obj.get("events").toString();
                String[] ar = a.split(",");
                for (int i = 0; i < ar.length; i++) {
                    list.add(ar[i]);
                }
                DayJournal day = new DayJournal(list, b);
                listDay.add(day);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(listDay.toString());
    }
}

class DayJournal {
    List<String> list;
    boolean squirel;
    public DayJournal(List<String> list, boolean squirel) {
        this.list = list;
        this.squirel = squirel;
    }

    @Override
    public String toString() {
        return "DayJournal{" +
                "list=" + list +
                ", squirel=" + squirel +
                '}';
    }
}
