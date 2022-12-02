package Day1;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) throws IOException {
        File fp = new File("src/Day1/Input.txt");
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        List<String> list = br.lines().collect(Collectors.toList());

        List<Integer> numList = new ArrayList<>();

        int current = 0;

        for (String s : list) {
            if (!s.equals("")){
                int cals = Integer.parseInt(s);
                current+=cals;
                continue;
            }
            numList.add(current);
            current=0;
        }

        Collections.sort(numList,Collections.reverseOrder());

        System.out.println(numList.get(0) + numList.get(1) + numList.get(2));

    }
}
