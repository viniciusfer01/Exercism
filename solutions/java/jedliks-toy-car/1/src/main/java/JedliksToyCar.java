public class JedliksToyCar {
    private int distance;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (isEmpty(battery)) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (!isEmpty(battery)) {
            distance += 20;
            battery--;
        } 
    }

    private boolean isEmpty(int battery) {
        if (battery > 0) {
            return false;
        } 
        return true;
    }
}
