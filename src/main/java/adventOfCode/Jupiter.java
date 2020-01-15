package adventOfCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Jupiter {

     final String WIREFILE = "wire.txt";

    public void startWireMovement() {
        Coordinate redStart = new Coordinate(0,0);
        Coordinate blueStart = new Coordinate(0,0);
        ArrayList<String> redWireCommandList;
        ArrayList<String> blueWireCommandList;


        ArrayList<String> wireCommandListRaw = new ArrayList<>(readWireInputFromFile(WIREFILE));
        for (String commandLine: wireCommandListRaw) {
            commandListParse(commandLine);
        }



    }

    public List<String> commandListParse(String commandListToParse){
        return Arrays.asList(commandListToParse.split("\\s*,\\s*"));
    }

    public List<String> readWireInputFromFile(String fileName){
        ArrayList<String> commandList = new ArrayList<>();
        File wireInputFile = new File(String.format("src/main/resources/%s",fileName));
        BufferedReader wireBufferedReader = null;
        String readLine;

        try {
            wireBufferedReader = new BufferedReader(new FileReader(wireInputFile));

            while ((readLine = wireBufferedReader.readLine()) != null) {
                commandList.add(readLine);
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally {
            if(wireBufferedReader != null) {
                try {
                    wireBufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return commandList;
    }

    public Set<Coordinate> checkWireCorssings(List<Coordinate> redWire, List<Coordinate>  blueWire){
        return  redWire.stream().distinct().filter(blueWire::contains).collect(Collectors.toSet());
    }

    public Coordinate getClosestCoordinateToCenter(Set<Coordinate> crossSectionList){
        Coordinate closestToCenterCoordinate = new Coordinate(0,0);
        for (Coordinate crossSection : crossSectionList) {
            if((crossSection.posX + crossSection.posY) < (closestToCenterCoordinate.posX + closestToCenterCoordinate.posY)){
                closestToCenterCoordinate = crossSection;
            }
        }
        return closestToCenterCoordinate;
    }

    public List<Coordinate> parseMoves(List<String> commandList, Coordinate wire){
        ArrayList<Coordinate> movesDone = new ArrayList<>();
        for (String command: commandList) {
                switch(command.charAt(0)){
                    case 'D':
                        movesDone.add(wire.moveDown(1));
                        break;
                    case 'U':
                        movesDone.add(wire.moveUp(1));
                        break;
                    case 'R':
                        movesDone.add(wire.moveRight(1));
                        break;
                    case 'L':
                        movesDone.add(wire.moveLeft(1));
                        break;
                    default:
                        throw new IllegalArgumentException();
                }

            }
        return movesDone;
    }

}
