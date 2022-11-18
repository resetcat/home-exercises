package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(1, 30),
    INTERMEDIATE(31, 120),
    ADVANCED(121, 300);

    private int minRuning;
    private int maxRuning;

    Runner(int minRunning, int maxRunning) {
        this.minRuning = minRunning;
        this.maxRuning = maxRunning;
    }

    public Runner getFitnessLevel(int runningTime) {
        if (runningTime < INTERMEDIATE.minRuning) {
            return Runner.BEGINNER;
        } else if (runningTime < ADVANCED.minRuning) {
            return Runner.INTERMEDIATE;
        }
        return Runner.ADVANCED;
    }

}
