package my.StAX;

import my.Student;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;

public class StudentsStAXBuilder {

    private final HashSet<Student> students = new HashSet<>();
    private final XMLInputFactory xmlInputFactory;

    public StudentsStAXBuilder() {
        this.xmlInputFactory = XMLInputFactory.newInstance();
    }

    public HashSet<Student> getStudents() {
        return students;
    }

    public void buildSetStudents(String fileName){
        FileInputStream inputStream = null;
        XMLStreamReader streamReader = null;
        String name;
        try{
            inputStream = new FileInputStream(fileName);
            streamReader = xmlInputFactory.createXMLStreamReader(inputStream);
            while(streamReader.hasNext()){
                int type = streamReader.next();
                if(type == XMLStreamConstants.START_ELEMENT){
                    name = streamReader.getLocalName();
//                    if()
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

}
