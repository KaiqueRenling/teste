package helpers;
import java.io.*;
import java.util.Properties;

public class FilesOperation {
    private static final String DIR_PATH_PROPERTIES =
            System.getProperty("user.dir") + File.separator + "src" + File.separator
                    + "test" + File.separator + "resources" + File.separator;

    public Properties getProperties(String fileName) throws IOException {
        InputStream inputStream = null;
        Properties prop = new Properties();
        try {
            File file = new File(DIR_PATH_PROPERTIES + fileName + ".properties");
            inputStream = new FileInputStream(file);
            prop.load(inputStream);
            return prop;
        } catch (Exception e) {
            System.out.println("Passando exception " + e.getMessage());
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        return prop;
    }
    public static Properties getSetupProperties() throws IOException {
        InputStream inputStream = null;
        Properties prop = new Properties();
        try {
            File file = new File(DIR_PATH_PROPERTIES + "setup.properties");
            inputStream = new FileInputStream(file);
            prop.load(inputStream);
            return prop;
        } catch (Exception e) {
            System.out.println("Passando exception " + e.getMessage());
        } finally {
            assert inputStream != null;
            inputStream.close();
        }
        return prop;
    }

    public void setProperties(String fileName, String propKey, String propValue) throws IOException {
        Properties prop = getProperties(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(DIR_PATH_PROPERTIES + fileName + ".properties");
            prop.setProperty(propKey, propValue);
            prop.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
