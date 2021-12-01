package days.controllers.helpers;

import static java.lang.System.*;

public abstract class DayController<T, E> implements DayControllerInterface<T, E> {
    protected final String FILEPATH;
    public DayController(String filePath) {
        this.FILEPATH = filePath;
    }

    public void run() {
        out.println("Part one: " + solutionPartOne());
        out.println("Part two: " + solutionPartTwo());
    }
}