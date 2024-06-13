package XmlParser;

import static XmlParser.XmlParser.parseXmlFile;

public class Main {
    public static void main(String[] args) {
        String filePath = "src\\XmlParser\\books.xml";
        parseXmlFile(filePath);
    }
}
