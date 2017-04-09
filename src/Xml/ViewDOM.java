package Xml;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ViewDOM
{
    public static void main(String args[]) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factory.newDocumentBuilder();
            Document doc = parser.parse("Questions.xml");
            Element root = doc.getDocumentElement();
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            DOMSource source = new DOMSource(root);
            StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);
        }catch(Exception e) {e.printStackTrace();}
    }
}
