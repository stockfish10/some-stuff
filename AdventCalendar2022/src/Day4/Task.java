package Day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {
        File fp = new File("src/Day4/Input.txt");
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        List<String> list = br.lines().collect(Collectors.toList());

        int counter = 0;

        for (String s : list) {
            String firstPair = s.split(",")[0];
            String secondPair = s.split(",")[1];

            int firstPairStart = Integer.parseInt(firstPair.split("-")[0]);
            int firstPairEnd = Integer.parseInt(firstPair.split("-")[1]);

            int secondPairStart = Integer.parseInt(secondPair.split("-")[0]);
            int secondPairEnd = Integer.parseInt(secondPair.split("-")[1]);

            if ((firstPairStart <= secondPairStart) && (firstPairEnd>=secondPairEnd) ||
                    (secondPairStart<=firstPairStart) && (secondPairEnd>= firstPairEnd)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
