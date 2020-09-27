package my.DOM;

import my.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudentsDOMBuilder {
    private final Set<Student> students;
    private DocumentBuilder documentBuilder;

    public StudentsDOMBuilder() {
        students = new HashSet<>();
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        try{
            documentBuilder = builderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void buildSetStudents(String fileName) throws IOException, SAXException {
        Document document = documentBuilder.parse(fileName);
        Element mainElement = document.getDocumentElement();
        NodeList nodeList = mainElement.getElementsByTagName("student");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            Student student = buildStudent(element);
            students.add(student);
        }
    }

    private Student buildStudent(Element element){
        Student student = new Student();
        student.setFaculty(element.getAttribute("faculty"));
        student.setLogin(element.getAttribute("login"));
        student.setName(getElementTextContent(element, "name"));
        student.setTelephone(Integer.parseInt(getElementTextContent(element, "telephone")));
        Student.Address address = new Student.Address();
        Element addressElement = (Element) element.getElementsByTagName("address").item(0);
        address.setCountry(getElementTextContent(addressElement, "country"));
        address.setCity(getElementTextContent(addressElement, "city"));
        address.setStreet(getElementTextContent(addressElement, "street"));
        student.setAddress(address);
        return student;
    }

    private static String getElementTextContent(Element element, String elementName){
        NodeList nodeList = element.getElementsByTagName(elementName);
        Node item = nodeList.item(0);
        return item.getTextContent();
    }

    public Set<Student> getStudents() {
        return students;
    }
}