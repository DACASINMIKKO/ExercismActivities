public class LogLevels {
    public static String message(String message){
        if (message.contains("[ERROR]")){
            return message.replace("[ERROR]:", "").trim();
        } else if (message.contains("[WARNING]")) {
            return message.replace("[WARNING]:", "").trim();
        } else if (message.contains("[INFO]")) {
            return message.replace("[INFO]:", "").trim();
        }
        return "";
    }

    public static String logLevel(String message){
        if (message.contains("[ERROR]")){
            return "error";
        } else if (message.contains("[WARNING]")) {
            return "warning";
        } else if (message.contains("[INFO]")) {
            return "info";
        }
        return "";
    }

    public static String reformat(String message){
        if (message.contains("[ERROR]")){
            return message.replace("[ERROR]:", "").trim() + " (error)";
        } else if (message.contains("[WARNING]")) {
            return message.replace("[WARNING]:", "").trim() + " (warning)";
        } else if (message.contains("[INFO]")) {
            return message.replace("[INFO]:", "").trim() + " (info)";
        }
        return "";
    }
}
