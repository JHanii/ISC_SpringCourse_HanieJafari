package ir.freeland.springboot.xml;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import generated.Student;


@SpringBootApplication
@EntityScan("com")
public class StudentParser {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		SpringApplication.run(StudentParser.class, args);
		 File xmlfile = new ClassPathResource("student.xml").getFile();
		 XmlMapper xmlMapper = new XmlMapper();
		 Student student = xmlMapper.readValue(xmlfile, Student.class);
		 System.out.println(student);
		 
		 
		 Student student1 = new Student();
		 student1.setStudentID(98520000);
		 student1.setFirstName("Hanie");
		 student1.setLastName("Jafari");
		 student1.setEnteranceYear(1398);
		 xmlMapper.writeValue(new File("generated-student.xml"), student1);
 	}

}
