import utils.PropertiesReaderClassLoader;

public class PropertiesUse {
    public static void main(String[] args) {
        String timeVal = PropertiesReaderClassLoader.getInstance().getValueFromProperty("defaultTimeout");
        String baseUrlVal  = PropertiesReaderClassLoader.getInstance().getValueFromProperty("baseUrl");


        System.out.println("timeVal =" + " " + timeVal);
        System.out.println("baseUrlVal = " + " " + baseUrlVal );
    }
}
