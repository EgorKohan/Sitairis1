package my.DOM;

import org.xml.sax.SAXException;

import java.io.IOException;

public class StudentsDomRunner {

    public static void main(String[] args) throws IOException, SAXException {
        StudentsDOMBuilder studentsDOMBuilder = new StudentsDOMBuilder();
        studentsDOMBuilder.buildSetStudents("file:////C:\\Users\\User\\Desktop\\5 семестр\\Sitairis1\\src\\main\\resources\\marshStudents.xml");
        System.out.println(studentsDOMBuilder.getStudents());
    }

}
