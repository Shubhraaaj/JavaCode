package Xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Xml2 {
    public static void main(String args[]) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = factory.newDocumentBuilder();
        Document document = parser.parse("Question.xml");
        Element root = document.getDocumentElement();
        //NodeList children = root.getChildNodes();
        NodeList children = document.getElementsByTagName("question");
        System.out.print(children.getLength()+"\n");
        for(int i = 0; i< children.getLength(); i++)
        {
            Node node = children.item(i);
            if(node.getNodeType()==Node.ELEMENT_NODE)
            {
                System.out.println(node.getFirstChild().getNodeValue());
            }
        }
    }
}