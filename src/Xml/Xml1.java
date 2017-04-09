package Xml;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Xml1
{
    public static void main(String args[]) throws IOException, SAXException, ParserConfigurationException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = factory.newDocumentBuilder();
        Document document=parser.parse("greeting.xml");
        Element root=document.getDocumentElement();
        String name=root.getNodeName();
        System.out.println(name);
        Node node = root.getFirstChild();
        String txt = node.getNodeValue();
        System.out.println(txt);
    }
}

/*
1. XML (eXentensible Markup Language) is a key Technology for Structured Data Representation and Transfer.
2. DOM (Documentation Object Model) is a language-neutral and platform-independant object model used for XML
3. W3C (World Wide Web)
*/