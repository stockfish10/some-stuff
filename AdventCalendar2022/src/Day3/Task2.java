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


    }
}
