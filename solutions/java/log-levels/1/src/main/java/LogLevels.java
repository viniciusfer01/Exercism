public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        String rawLogLevel = logLine.split(":")[0];

        String logLevel = rawLogLevel.replace('[', ' ').replace(']', ' ').trim();

        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
