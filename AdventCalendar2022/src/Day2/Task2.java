package Day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fp = new File("src/Day2/Input.txt");
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        List<String> list = br.lines().collect(Collectors.toList());

        Map<String, Integer> enemy = Map.of(
                "A", 1,
                "B", 2,
                "C", 3);

        int score = 0;

        for (String s : list) {
            String currSignForEnemy = s.trim().split(" ")[0];
            String outcome = s.trim().split(" ")[1];

            int enemyScore = enemy.get(currSignForEnemy);

            if (outcome.equals("X")){
                if (enemyScore == 1){
                    score+=3;
                } else if (enemyScore == 2) {
                    score+=1;
                } else {
                    score+=2;
                }
            } else if (outcome.equals("Y")) {
                if (enemyScore == 1){
                    score+=4;
                } else if (enemyScore == 2) {
                    score+=5;
                } else {
                    score+=6;
                }
            } else {
                if (enemyScore == 1){
                    score+=8;
                } else if (enemyScore == 2) {
                    score+=9;
                } else {
                    score+=7;
                }
            }


        }

        System.out.println(score);
    }
}
