package main;

import factorys.DayFactory;

public class Main {
    private static final int DAY = 8; // Current day (=20: application will run from {startDay} till day 20)
    private static final int START_DAY = 1; // Day of month to start on. (=1: Application will run from day 1 to {days})

    public static void main(String[] args) {
        System.out.println("===============  Advent Of Code 2021: ===============");
        new DayFactory(DAY, START_DAY).run();
        System.out.println("\n============ End of Advent of Code 2021! ===========");
    }
}
