package Xml;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
class CloneNode
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
            System.out.println("Before addition");
            transformer.transform(source, result);
            NodeList questions = doc.getElementsByTagName("question");
            Node aCopy = questions.item(0).cloneNode(true);
            ((Element)aCopy).setAttribute("id", "q3");
            ((Text)aCopy.getFirstChild()).replaceWholeText("What is XML?");
            root.appendChild(aCopy);
            System.out.println("\nAfter addition");
            transformer.transform(source, result);
        }catch(Exception e) {e.printStackTrace();}
    }
}
