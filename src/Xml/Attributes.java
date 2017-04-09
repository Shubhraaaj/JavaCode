package Xml;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.IOException;


public class Attributes {
    public static void main(String args[]) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = factory.newDocumentBuilder();
        Document doc = parser.parse("Questions.xml");
        Element root = doc.getDocumentElement();
        NodeList children = root.getElementsByTagName("question");
        for (int i = 0; i < children.getLength(); i++) {
            Node node = children.item(i);
            String value = ((Element) node).getAttribute("no");
            System.out.print(value + ". "); //print question number
            System.out.println(node.getFirstChild().getNodeValue());
        }
    }
}
