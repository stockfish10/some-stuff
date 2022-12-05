package Day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {
        File fp = new File("src/Day3/Input.txt");
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        List<String> list = br.lines().collect(Collectors.toList());

        int result = 0;

        for (String s : list) {
            String firstPart = s.substring(0,s.length()/2);
            String secondPart = s.substring(s.length()/2);

            char currentCharacter = checkDuplicateCharacter(firstPart,secondPart);

            int value;

            if (currentCharacter == Character.toUpperCase(currentCharacter)){
                value = (int)currentCharacter - 38;
            } else {
                value = (int)currentCharacter - 96;
            }
            result+=value;
        }
        System.out.println(result);
    }

    private static char checkDuplicateCharacter(String firstPart, String secondPart) {
        char myChar = Character.MIN_VALUE;

        for (int i = 0; i < firstPart.length(); i++) {
            char currentChar = firstPart.charAt(i);

            for (int j = 0; j < secondPart.length(); j++) {
                char secondPartCurrentChar = secondPart.charAt(j);

                if (currentChar == secondPartCurrentChar) {
                    myChar = currentChar;
                    break;
                }
            }
        }
        return myChar;
    }
}
