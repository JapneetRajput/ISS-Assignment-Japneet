package XmlParser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParser {

    private static final Logger logger = LogManager.getLogger(XmlParser.class);

    public static void parseXmlFile(String filePath) {
        try {
            File xmlFile = new File(filePath);

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            Document document = documentFactory.newDocumentBuilder().parse(xmlFile);

            document.getDocumentElement().normalize();

            logger.info("Root element :" + document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName("book");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);

                String title = getElementValue(element, "title");
                String author = getElementValue(element, "author");
                int year = Integer.parseInt(getElementValue(element, "year"));

                logger.info("----------------------------");
                logger.info("Title : " + title);
                logger.info("Author : " + author);
                logger.info("Year : " + year);
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            logger.error("Error parsing XML file: " + e.getMessage());
        }
    }

    private static String getElementValue(Element element, String childName) {
        NodeList nodeList = element.getElementsByTagName(childName);
        if (nodeList.getLength() > 0) {
            return nodeList.item(0).getTextContent();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String filePath = "books.xml"; // Replace with your actual file path
        parseXmlFile(filePath);
    }
}
