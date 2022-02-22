package testTask;

import java.util.HashMap;
import java.util.Map;

public class WorkingMassive {

    private static final FillingMassive fillingMassive = new FillingMassive();
    private static final Map<Integer, String> stringMap = new HashMap<>();
    private int count = -1;

    private String findString() {
        getAmountOfRepeats(fillingMassive.fillingMas());
        int flag = getTheMostRepeated();
        if (flag != 0) {
            return stringMap.get(flag);
        }
        return null;
    }

    private int getTheMostRepeated() {
        int repeat = 0;
        for (Map.Entry<Integer, String> item : stringMap.entrySet()) {
            if (repeat < item.getKey()) {
                repeat = item.getKey();
            }
        }
        return repeat;
    }

    private void getAmountOfRepeats(String[] mass) {
        for (String string : mass) {
            for (String string1 : mass) {
                if (string.equals(string1)) {
                    count++;
                }
            }
            stringMap.put(count, string);
            count = -1;
        }
    }

    public int getAmountOfWords() {
        String s = findString();
        if (s == null) {
            return -1;
        }
        String[] strings = s.split("\\s");
        return strings.length;
    }
}
