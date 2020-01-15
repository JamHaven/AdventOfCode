package adventOfCode;

import java.util.ArrayList;
import java.util.List;

public class OpCode {

    public int calculateOpCode(ArrayList<Integer> testOpCodeArray){
        ArrayList<Integer> memoryOpCodeArray = new ArrayList<Integer>(testOpCodeArray);
        int result = 0;
        for (int noun = 0; noun < 99; noun++) {
            for (int verb = 0; verb < 99; verb++) {
                testOpCodeArray.set(1,noun);
                testOpCodeArray.set(2,verb);
                testOpCodeArray = calculateCurrentOpcode(testOpCodeArray);
                if(testOpCodeArray.get(0) == 19690720){
                    result = 100*noun+verb;
                }
                testOpCodeArray = new ArrayList<Integer>(memoryOpCodeArray);
            }
        }
        return result;
    }

    public ArrayList<Integer> calculateCurrentOpcode( List<Integer> opCodeArray) {
        for (int position = 0; position < opCodeArray.size(); ) {
            switch (opCodeArray.get(position)) {
                case 99:
                    return new ArrayList<Integer>(opCodeArray);
                case 1:
                    opCodeArray.set(opCodeArray.get(position + 3), opCodeArray.get(opCodeArray.get(position + 1)) + opCodeArray.get(opCodeArray.get(position + 2)));
                    position += 4;
                    break;
                case 2:
                    opCodeArray.set(opCodeArray.get(position + 3), opCodeArray.get(opCodeArray.get(position + 1)) * opCodeArray.get(opCodeArray.get(position + 2)));
                    position += 4;
                    break;
                default:
                    System.out.println("error");
            }
        }
        return new ArrayList<Integer>(opCodeArray);
    }


}
