package days.controllers;

import days.controllers.helpers.DayController;
import factorys.DayFileReader;

import java.util.List;
import java.util.stream.IntStream;

public class Day1Controller extends DayController<Integer, Integer> {
    public Day1Controller(String filePath) {
        super(filePath);
    }

    private final List<Integer> input = new DayFileReader().fileToIntegerList(FILEPATH, "\\s+");

    @Override
    public Integer solutionPartOne() {
        return (int) IntStream.range(1, input.size()).filter(i -> input.get(i - 1) < input.get(i)).count();
    }

    @Override
    public Integer solutionPartTwo() {
        return (int) IntStream.range(3, input.size()).filter(this::verifyWindow).count();
    }

    private boolean verifyWindow(int i) {
        return getSumFromWindow(i - 3, i - 1) < getSumFromWindow(i - 2, i);
    }

    private Integer getSumFromWindow(int from, int to) {
        return input.subList(from, to + 1).stream().mapToInt(Integer::intValue).sum();
    }
}
