import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {
    public static int task(int task) throws IOException {

        int score = 0;
        BufferedReader bi = new BufferedReader(new FileReader("input/2.txt"));
        while(bi.ready()){
            String line = bi.readLine();
            String[] play = line.split(" ", 2);
            if (play.length == 2){
                score += (task == 1) ? getScoreTask1(play[0], play[1]): getScoreTask2(play[0], play[1]);
            }
        }
        return score;
    }

    public static int getScoreTask1(String x, String y) {
        int score = 0;
        switch (x) {
            case "A" -> {
                switch (y) {
                    case "X" -> score += 4;
                    case "Y" -> score += 8;
                    case "Z" -> score += 3;
                }
            }
            case "B" -> {
                switch (y) {
                    case "X" -> score += 1;
                    case "Y" -> score += 5;
                    case "Z" -> score += 9;
                }
            }
            case "C" -> {
                switch (y) {
                    case "X" -> score += 7;
                    case "Y" -> score += 2;
                    case "Z" -> score += 6;
                }
            }
        }
        return score;
    }

    public static int getScoreTask2(String x, String y) {
        int score = 0;
        switch (x) {
            case "A" -> {
                switch (y) {
                    case "X" -> score += 3;
                    case "Y" -> score += 4;
                    case "Z" -> score += 8;
                }
            }
            case "B" -> {
                switch (y) {
                    case "X" -> score += 1;
                    case "Y" -> score += 5;
                    case "Z" -> score += 9;
                }
            }
            case "C" -> {
                switch (y) {
                    case "X" -> score += 2;
                    case "Y" -> score += 6;
                    case "Z" -> score += 7;
                }
            }
        }
        return score;
    }
}
