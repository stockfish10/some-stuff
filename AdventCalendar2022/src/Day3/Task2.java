package Day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fp = new File("src/Day3/Input.txt");
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        List<String> list = br.lines().collect(Collectors.toList());

        int value = 0;

        for (int i = 0; i < list.size(); i += 3) {
            String firstBackpack = list.get(i);
            String secondBackpack = list.get(i + 1);
            String thirdBackpack = list.get(i + 2);

            char badge = findCurrentBadge(firstBackpack, secondBackpack, thirdBackpack);


            if (badge == Character.toUpperCase(badge)) {
                value += (int) badge - 38;
            } else {
                value += (int) badge - 96;
            }
        }
        System.out.println(value);
    }

    private static char findCurrentBadge(String firstBackpack, String secondBackpack, String thirdBackpack) {
        char myChar = Character.MIN_VALUE;

        for (int i = 0; i < firstBackpack.length(); i++) {
            char current = firstBackpack.charAt(i);

            if (secondBackpack.contains(String.valueOf(current)) && thirdBackpack.contains(String.valueOf(current))) {
                myChar = current;
            }
        }

        return myChar;
    }
}
