package days.controllers;

import days.controllers.helpers.DayController;
import factorys.DayFileReader;

import java.util.List;
import java.util.stream.IntStream;

public class Day1Controller extends DayController<Integer, Integer> {
    public Day1Controller(String filePath) {
        super(filePath);
    }

    @Override
    public Integer solutionPartOne() {
        List<Integer> input = new DayFileReader().fileToIntegerList(FILEPATH, "\\s+");
        return (int) IntStream.range(1, input.size()).filter(i -> input.get(i - 1) < input.get(i)).count();
    }

    @Override
    public Integer solutionPartTwo() {
        List<Integer> input = new DayFileReader().fileToIntegerList(FILEPATH, "\\s+");
        return (int) IntStream.range(3, input.size()).filter(i -> verifyWindow(input, i)).count();
    }

    private boolean verifyWindow(List<Integer> input, int i) {
        return getSumFromWindow(input, i - 3, i - 1) < getSumFromWindow(input, i - 2, i);
    }

    public Integer getSumFromWindow(List<Integer> input, int from, int to) {
        return input.subList(from, to + 1).stream().mapToInt(Integer::intValue).sum();
    }
}
