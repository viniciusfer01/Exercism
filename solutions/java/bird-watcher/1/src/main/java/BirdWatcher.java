
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int todayIndex = 6;
        return birdsPerDay[todayIndex];
    }

    public void incrementTodaysCount() {
        int todayIndex = 6;
        birdsPerDay[todayIndex]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int WEEK_LENGTH = 7;

        if (numberOfDays > WEEK_LENGTH) {
            numberOfDays = WEEK_LENGTH;
        }

        for (int day = 0; day < numberOfDays; day++) {
            sum += birdsPerDay[day];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int day = 0; day < birdsPerDay.length; day++) {
            if (birdsPerDay[day] > 4) {
                busyDays++;
            }
        }

        return busyDays;
    }
}
