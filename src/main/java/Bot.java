import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Bot {

    public static void main(String[] args)throws IOException {
        String configFilePath = "src/main/resources/config/config.properties";
        FileInputStream propsInput = new FileInputStream(configFilePath);
        Properties prop = new Properties();
        prop.load(propsInput);

        System.out.println(prop.getProperty("key"));
        System.out.println(prop.getProperty("channel_id"));
    }

}
