package my.marshall;

import my.Student;
import my.Students;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshallMain {

    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Marshaller marshaller = context.createMarshaller();
            Students students = new Students() {
                Student.Address addr = new Student.Address("BLR", "Minsk", "Skoriny 4");

                {
                    add(new Student("gochette", "Klimenko", "mmf", 2095306, addr));
                    addr = new Student.Address("BLR", "Polotesk", "Simeona P. 23");
                    add(new Student("ivette", "Teran", "mmf", 2345386, addr));
                }
            };
            marshaller.marshal(students, new FileOutputStream("marshStudents.xml"));
            marshaller.marshal(students, System.out);
            System.out.println("File was create");
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
