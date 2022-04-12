package constatns;

public class FrameworkConstants {


    private static final String url = "https://in.indeed.com/";
    private static final String resourcePath = System.getProperty("user.dir") + "/src/test/resources";
    private static final String configPath = resourcePath + "/config/config.properties";
    private static final String chrome = "chrome";
    private static final String firefox = "firefox";
    private static final String safari = "safari";


    public static String url() {
        return url;
    }
    public static String getChrome() {
        return chrome;
    }

    public static String getFirefox() {
        return firefox;
    }

    public static String getSafari() {
        return safari;
    }

    public static String getConfigPath() {
        return configPath;
    }


}
