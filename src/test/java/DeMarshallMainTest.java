import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

public class DeMarshallMainTest {

    private static File file;

    @BeforeClass
    public static void beforeClass(){
        file = new File("C:\\Users\\User\\Desktop\\5 семестр\\Sitairis1\\src\\main\\resources\\marshStudents.xml");
    }

    @Test
    public void shouldOpenFile() throws FileNotFoundException {
        Reader fileReader =  new FileReader(file);
    }

}
