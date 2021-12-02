package days.controllers;

import days.controllers.helpers.DayController;
import factorys.DayFileReader;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Day2Controller extends DayController<Integer, Integer> {
    public Day2Controller(String filePath) {
        super(filePath);
    }

    private final List<String> input = new DayFileReader().fileToStringList(FILEPATH, "\\r?\\n");

    @Override
    public Integer solutionPartOne() {
        return calculatePlannedCourse();
    }

    @Override
    public Integer solutionPartTwo() {
        return calculatePlannedCourseWithAim();
    }

    private Integer calculatePlannedCourse() {
        int depth = 0;
        int horizontal = 0;

        for(String direction : input) {
            String[] splitted = direction.split("\\s+");
            switch (splitted[0]) {
                case "forward": horizontal += parseInt(splitted[1]); break;
                case "up": depth -= parseInt(splitted[1]); break;
                case "down": depth += parseInt(splitted[1]); break;
                default: throw new IllegalStateException("Unexpected value: " + splitted[0]);
            }
        }
        return depth * horizontal;
    }

    private Integer calculatePlannedCourseWithAim() {
        int depth = 0;
        int horizontal = 0;
        int aim = 0;

        for (String direction : input) {
            String[] splitDirection = direction.split("\\s+");
            switch (splitDirection[0]) {
                case "forward":
                    horizontal += parseInt(splitDirection[1]);
                    depth += parseInt(splitDirection[1]) * aim;
                 break;
                case "up": aim -= parseInt(splitDirection[1]); break;
                case "down": aim += parseInt(splitDirection[1]); break;
                default: throw new IllegalStateException("Unexpected value: " + splitDirection[0]);
            }
        }
        return depth * horizontal;
    }
}
