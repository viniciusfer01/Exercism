public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 0;
        int CARS_PRODUCED_PER_HOUR = 221;

        if (speed > 0 && speed < 5) {
            successRate = 1;
        } else if (speed < 9) {
            successRate = 0.9;
        } else if (speed < 10) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }
        return CARS_PRODUCED_PER_HOUR * successRate * speed;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
