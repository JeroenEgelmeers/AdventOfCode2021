package tests.java;

import days.controllers.Day1Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.java.helpers.DayTestInterface;


public class Day1ControllerTest implements DayTestInterface {

    @Test
    public void part_1_solution() {
        Assertions.assertEquals(Integer.valueOf(1451), new Day1Controller(PATH_TO_FILE).solutionPartOne());
    }

    @Test
    public void part_2_solution() {
        Assertions.assertEquals(Integer.valueOf(1395), new Day1Controller(PATH_TO_FILE).solutionPartTwo());
    }

    private static final String PATH_TO_FILE = "./src/main/resources/inputfiles/day1.txt";
}
