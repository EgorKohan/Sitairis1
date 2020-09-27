package my.SAX;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

public class SimpleStudentHandler extends DefaultHandler {
    @Override
    public void startDocument() {
        System.out.println("Parsing started");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        StringBuilder s = new StringBuilder(localName);
// получение и вывод информации об атрибутах элемента
        for (int i = 0; i < attrs.getLength(); i++) {
            s.append(" ").append(attrs.getLocalName(i)).append("=").append(attrs.getValue(i));
        }
        System.out.print(s.toString().trim());
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        System.out.print(new String(ch, start, length) + " ");
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        System.out.print(localName);
    }

    @Override
    public void endDocument() {
        System.out.println("\nParsing ended");
    }
}