public class LogLevels {
    
    public static String message(String logLine) {
        int position = logLine.indexOf(":");
        String message = logLine.substring(position + 1);
        String result = message.trim();
        return result;
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
    }

    public static String logLevel(String logLine) {
        int positionFirstStaple = logLine.indexOf("[");
        int positionSecondStaple = logLine.indexOf("]");
        String result = logLine.substring(positionFirstStaple + 1, positionSecondStaple);
        return result.toLowerCase();
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
    }

    public static String reformat(String logLine) {
        int position = logLine.indexOf(":");
        String message = logLine.substring(position + 2);
        String messageFinal = message.trim();
        String logLevel = logLevel(logLine);
        String result = messageFinal + " (" + logLevel + ")";
        return result;
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
    }
}
/*
[ERROR]
0123456
*/