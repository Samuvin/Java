import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Property {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // 1. setProperty(String key, String value) - Adds or updates a key-value pair
        properties.setProperty("username", "admin");
        properties.setProperty("password", "12345");
        properties.setProperty("url", "https://example.com");
        
        // 2. getProperty(String key) - Retrieves the value for a specified key
        String username = properties.getProperty("username");
        System.out.println("Username: " + username);

        // 3. getProperty(String key, String defaultValue) - Retrieves the value or returns the default if key is absent
        String timeout = properties.getProperty("timeout", "30");
        System.out.println("Timeout: " + timeout);

        // 4. list(PrintStream or PrintWriter) - Lists all properties to the specified output stream
        System.out.println("All Properties:");
        properties.list(System.out);

        // 5. remove(Object key) - Removes a specific key-value pair
        properties.remove("password");
        System.out.println("After removing 'password':");
        properties.list(System.out);

        // 6. stringPropertyNames() - Returns a set of keys in the property list
        Set<String> keys = properties.stringPropertyNames();
        System.out.println("Keys in Properties:");
        for (String key : keys) {
            System.out.println(key + ": " + properties.getProperty(key));
        }

        // 7. store(OutputStream out, String comments) - Saves properties to a file
        try (FileOutputStream out = new FileOutputStream("config.properties")) {
            properties.store(out, "Application Configuration");
            System.out.println("Properties saved to file 'config.properties'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 8. load(InputStream in) - Loads properties from a file
        Properties loadedProperties = new Properties();
        try (FileInputStream in = new FileInputStream("config.properties")) {
            loadedProperties.load(in);
            System.out.println("Loaded Properties from file:");
            loadedProperties.list(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
