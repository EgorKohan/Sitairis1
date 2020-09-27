package my.marshall;

import my.Students;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DeMarshallMain {

    public static void main(String[] args) {
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            FileReader fileReader = new FileReader(
                    new File(
                            "C:\\Users\\User\\Desktop\\5 семестр\\Sitairis1\\src\\" +
                                    "main\\resources\\marshStudents.xml"));
            Students students = (Students) unmarshaller.unmarshal(fileReader);
            System.out.println(students);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
