import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
public class Day1 {

    public static int task(int numOfElves) throws IOException {

        int current = 0;
        ArrayList<Integer> calories = new ArrayList<Integer>();
        BufferedReader bi = new BufferedReader(new FileReader("input/1.txt"));
        while (bi.ready()){
            String line = bi.readLine();
            if (line.isEmpty()){
                calories.add(current);
                current = 0;
            }
            else{
                current += Integer.parseInt(line);
            }
        }

        Collections.sort(calories, Collections.reverseOrder());
        int result = 0;
        for (int i=0; i < numOfElves;i++){
            result += calories.get(i);
        }
        return result;
    }
}
