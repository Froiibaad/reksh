package simulator.elements;

import simulator.*;
import java.util.*;

public class Clock {
    private static ArrayList<SekvMreza> sequential = new ArrayList<SekvMreza>();

    public static void init() {
        for (int i = 0; i < sequential.size(); i++) {
            sequential.get(i).setOutputs();
        }
        for (int i = 0; i < sequential.size(); i++) {
            sequential.get(i).notifySuccessors();
        }
    }

    public static void tick() {
        for (int i = 0; i < sequential.size(); i++) {
            SekvMreza temp = sequential.get(i);
            boolean bad = false;
            for (int j = 0; j < temp.numOfInputs; j++) {
                try {
                    if (temp.inputs.get(j).getValue() == -1) {
                        bad = true;
                    }
                } catch (java.lang.IndexOutOfBoundsException e) {
                    System.out.println(temp.getClass().getName());
                }
            }
            if (!bad) {
                temp.calc();
            }
        }
        for (int i = 0; i < sequential.size(); i++) {
            sequential.get(i).setOutputs();
        }
        for (int i = 0; i < sequential.size(); i++) {
            sequential.get(i).notifySuccessors();
        }
    }

    public static void addToClock(SekvMreza sm) {
        sequential.add(sm);
    }
}
