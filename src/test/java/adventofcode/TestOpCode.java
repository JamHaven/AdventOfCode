package adventofcode;
import adventOfCode.OpCode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestOpCode {

    OpCode opCode = new OpCode();

    @Test
    void testCalculateOpCodeAdd(){
        ArrayList<Integer> testOpCodeArray = new ArrayList<Integer>(Arrays.asList(1,0,0,0,99));
        System.out.println(testOpCodeArray);
        List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2,0,0,0,99));
        opCode = new OpCode();
        ArrayList<Integer> resultOpCodeArray = opCode.calculateCurrentOpcode(testOpCodeArray);

        Assert.assertEquals(expectedResult,resultOpCodeArray);
    }
    @Test
    void testCalculateOpCodeMulti(){
        ArrayList<Integer> testOpCodeArray = new ArrayList<Integer>(Arrays.asList(2,3,0,3,99));
        System.out.println(testOpCodeArray);
        List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2,3,0,6,99));
        opCode = new OpCode();
        ArrayList<Integer> resultOpCodeArray = opCode.calculateCurrentOpcode(testOpCodeArray);

        Assert.assertEquals(expectedResult,resultOpCodeArray);
    }

    @Test
    void testCalculateOpCodeTest3(){
        ArrayList<Integer> testOpCodeArray = new ArrayList<Integer>(Arrays.asList(2,4,4,5,99,0));
        System.out.println(testOpCodeArray);
        List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2,4,4,5,99,9801));
        opCode = new OpCode();
        ArrayList<Integer> resultOpCodeArray = opCode.calculateCurrentOpcode(testOpCodeArray);

        Assert.assertEquals(expectedResult,resultOpCodeArray);
    }

    @Test
    void testCalculateOpCodeTest4(){
        ArrayList<Integer> testOpCodeArray = new ArrayList<Integer>(Arrays.asList(1,1,1,4,99,5,6,0,99));
        System.out.println(testOpCodeArray);
        List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(30,1,1,4,2,5,6,0,99));
        opCode = new OpCode();
        ArrayList<Integer> resultOpCodeArray = opCode.calculateCurrentOpcode(testOpCodeArray);

        Assert.assertEquals(expectedResult,resultOpCodeArray);
    }

    @Test
    void testCalculateOpCodeExam(){
        ArrayList<Integer> testOpCodeArray = new ArrayList<Integer>(Arrays.asList(1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,19,5,23,2,23,13,27,1,10,27,31,2,31,6,35,1,5,35,39,1,39,10,43,2,9,43,47,1,47,5,51,2,51,9,55,1,13,55,59,1,13,59,63,1,6,63,67,2,13,67,71,1,10,71,75,2,13,75,79,1,5,79,83,2,83,9,87,2,87,13,91,1,91,5,95,2,9,95,99,1,99,5,103,1,2,103,107,1,10,107,0,99,2,14,0,0));
        System.out.println(testOpCodeArray);
        //List<Integer> expectedResult = Arrays.asList(30,1,1,4,2,5,6,0,99);

        ArrayList<Integer> resultOpCodeArray = opCode.calculateCurrentOpcode(testOpCodeArray);
        System.out.println(resultOpCodeArray);
        //Assert.assertEquals(expectedResult,resultOpCodeArray);
    }

    @Test
    void testCalculateOpCode_reverse(){
        ArrayList<Integer> testOpCodeArray = new ArrayList<Integer>(Arrays.asList(1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,9,19,1,19,5,23,2,23,13,27,1,10,27,31,2,31,6,35,1,5,35,39,1,39,10,43,2,9,43,47,1,47,5,51,2,51,9,55,1,13,55,59,1,13,59,63,1,6,63,67,2,13,67,71,1,10,71,75,2,13,75,79,1,5,79,83,2,83,9,87,2,87,13,91,1,91,5,95,2,9,95,99,1,99,5,103,1,2,103,107,1,10,107,0,99,2,14,0,0));

        System.out.println(opCode.calculateOpCode(testOpCodeArray));

    }
}
