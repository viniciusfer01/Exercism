public class Lasagna {
    public int expectedMinutesInOven() {
        int EXPECTED_MINUTES_IN_OVEN = 40;
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minutesSpent) {
        return expectedMinutesInOven() - minutesSpent;
    }

    public int preparationTimeInMinutes(int layers) {
        int TIME_PER_LAYER = 2;
        return layers * TIME_PER_LAYER;
    }


    public int totalTimeInMinutes(int layers, int minutesSpent) {
        return preparationTimeInMinutes(layers) + minutesSpent;
    }
}
