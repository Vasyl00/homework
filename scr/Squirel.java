
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Squirel {

    private static final String SAMPLE_CSV_FILE_PATH = "journalEvents_ru.csv";

    public static void main(String[] args) {
        int lines = count("\\n");
        int all_words = count(",");
        String[] isSquirel = new String[lines];
        String[] actions_line = new String[lines];
        String[][] actions_all = new String[lines][];
        String[] events = new String[lines];
        int amount = 1;
        try {

            Scanner scan = new Scanner(new File(SAMPLE_CSV_FILE_PATH));
            scan.useDelimiter("\\n");
            for (int i = 0; i < lines; i++) {
                actions_line[i] = scan.next();
            }
            int len_array;
            for (int i = 0; i < lines; i++) {
                len_array = count_len(actions_line[i]);
                actions_all[i] = new String[len_array];
                for (int j = 0; j < len_array; j++) {
                    if (j != len_array) {
                        actions_all[i][j] = take_word(actions_line[i], j, len_array);
                    }
                }
                isSquirel[i] = take_word(actions_line[i], len_array, len_array);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Scanner sca = new Scanner(new File(SAMPLE_CSV_FILE_PATH));
            sca.useDelimiter(",");
            boolean isContain = false;
            String[] temp = new String[all_words];
            for (int i = 0; i < all_words; i++) {
                temp[i] = sca.next();
            }
            for (int i = 0; i < lines; i++) {
                events[i] = "";
            }
            events[0] = temp[0];
            for (int i = 1; i < all_words; i++) {
                isContain = false;
                if (temp[i].contains("false") || temp[i].contains("true")) {
                } else {
                    for (int j = 0; j < lines; j++) {
                        if (temp[i].equals(events[j])) {
                            isContain = true;
                        }
                    }
                    if (isContain == false) {
                        for (int j = 0; j < lines; j++) {

                            if (events[j].equals("")) {
                                events[j] = temp[i];
                                amount++;
                                j = lines;
                                break;
                            }
                        }

                    }
                }

            }

            for (int i = 0; i < lines; i++) {
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int[][] koef = new int[amount][4];
        for (int k = 0; k < amount; k++) {
            for (int i = 0; i < lines; i++) {
                if (actions_line[i].contains(events[k]) && isSquirel[i].equals("true")) {
                    koef[k][0]++;
                }
                if (actions_line[i].contains(events[k]) && isSquirel[i].equals("false")) {
                    koef[k][1]++;
                }
                if (!(actions_line[i].contains(events[k])) && isSquirel[i].equals("true")) {
                    koef[k][2]++;
                }
                if (!(actions_line[i].contains(events[k])) && isSquirel[i].equals("false")) {
                    koef[k][3]++;
                }
            }
        }

        double[] fi = new double[amount];
        for (int k = 0; k < amount; k++) {
            fi[k] = (koef[k][0] * koef[k][3] - koef[k][1] * koef[k][2]) / (Math.sqrt(((koef[k][0] + koef[k][1]) * (koef[k][2] + koef[k][3]) * (koef[k][0] + koef[k][2]) * (koef[k][1] + koef[k][3]))));
        }


        for (int k = 0; k < amount; k++) {
            if (fi[k] > 0.1D || fi[k] < -0.1D) {
                System.out.println("event - " + events[k] + "  fi=" + fi[k]);
            }

        }

    }

    static int count(String delimit) {
        int lines = 0;
        try {
            Scanner sc = new Scanner(new File(SAMPLE_CSV_FILE_PATH));
            sc.useDelimiter(delimit);
            while (sc.hasNext()) {
                lines++;
                sc.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }

    static int count_len(String lin) {
        int count_le = 0;
        char[] arr = lin.toCharArray();
        for (int ii = 0; ii < lin.length(); ii++) {
            if (arr[ii] == ',') {
                count_le++;
            }
        }
        return count_le;
    }

    static String take_word(String line, int i, int len) {
        int count = 0;
        int start = 0;
        int end = 0;
        String[] stroka = new String[99];
        char[] arr = line.toCharArray();
        for (int ii = 0; ii < line.length(); ii++) {
            if (arr[ii] == ',') {
                start = end;
                if (start != 0) {
                    start++;
                }
                end = ii;
                stroka[count] = line.substring(start, end);
                count++;
            } else if (ii == line.length() - 1) {
                start = end + 1;
                end = line.length() - 1;
                stroka[count] = line.substring(start, end);
            }
        }
        return stroka[i];
    }
}


