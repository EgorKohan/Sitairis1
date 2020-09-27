package my;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Students{

    @XmlElement(name = "student")
    private ArrayList<Student> list = new ArrayList<>();

    public Students() {
    }

    public boolean add(Student student){
        return list.add(student);
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Students{" +
                "list=" + list +
                '}';
    }
}
