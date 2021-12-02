package tests.java;

import days.controllers.Day2Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.java.helpers.DayTestInterface;

public class Day2ControllerTest implements DayTestInterface {

    @Test
    public void part_1_solution() {
        Assertions.assertEquals(Integer.valueOf(1924923), new Day2Controller(PATH_TO_FILE).solutionPartOne());
    }

    @Test
    public void part_2_solution() {
        Assertions.assertEquals(Integer.valueOf(1982495697), new Day2Controller(PATH_TO_FILE).solutionPartTwo());
    }

    private static final String PATH_TO_FILE = "./src/main/resources/inputfiles/day2.txt";
}
