package Xml;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.IOException;

public class GetElementById {
    public static void main(String args[]) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = factory.newDocumentBuilder();
        Document document = parser.parse("Questions.xml");
        Element e = document.getElementById("q1");
        String value = e.getAttribute("id");
        System.out.print(value + ": "); //Print Question Number
        System.out.println(e.getFirstChild().getNodeValue());
    }
}