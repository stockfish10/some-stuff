package Day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {
        File fp = new File("src/Day2/Input.txt");
        FileReader fr = new FileReader(fp);
        BufferedReader br = new BufferedReader(fr);

        List<String> list = br.lines().collect(Collectors.toList());

        Map<String, Integer> me = Map.of(
                "X", 1,
                "Y", 2,
                "Z", 3);

        Map<String, Integer> enemy = Map.of(
                "A", 1,
                "B", 2,
                "C", 3);

        int score = 0;

        for (String s : list) {
            String currSignForEnemy = s.trim().split(" ")[0];
            String currSignForMe = s.trim().split(" ")[1];

            int enemyScore = enemy.get(currSignForEnemy);
            int myScore = me.get(currSignForMe);

            if (enemyScore == myScore) {
                score += myScore + 3;
            } else if (myScore == 1) {
                score = enemyScore == 2 ? score + myScore : score + myScore + 6;
            } else if (myScore == 2) {
                score = enemyScore == 3 ? score + myScore : score + myScore + 6;

            } else if (myScore == 3) {
                score = enemyScore == 1 ? score + myScore : score + myScore + 6;
            }
        }

        System.out.println(score);
    }
}
