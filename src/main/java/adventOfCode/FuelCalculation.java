package adventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FuelCalculation {

    int mass;

    void initFuel() throws IOException{
        File file = new File("src/main/resources/input1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String readLine;
        int result = 0;
        while ((readLine = br.readLine()) != null) {
            result += calculateFuel(Integer.parseInt(readLine));
        }
        System.out.println("Result: " +result);
    }
    int calculateFuel(int mass)  {
        int result = 0;
        int tmpResult = 0;
        while(mass > 0 ) {
            tmpResult = (Math.round(mass / 3)) - 2;
            if(tmpResult > 0) {
                result += tmpResult;
            }
            mass = tmpResult;
        }
        return result;
    }

}

