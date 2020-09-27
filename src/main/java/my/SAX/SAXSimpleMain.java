package my.SAX;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;


public class SAXSimpleMain {

    public static void main(String[] args) throws SAXException, IOException {
        XMLReader xmlReader = XMLReaderFactory.createXMLReader();
        SimpleStudentHandler simpleStudentHandler = new SimpleStudentHandler();
        xmlReader.setContentHandler(simpleStudentHandler);
        xmlReader.parse("file:////C:\\Users\\User\\Desktop\\5 семестр\\Sitairis1\\src\\main\\resources\\marshStudents.xml");

    }

}
