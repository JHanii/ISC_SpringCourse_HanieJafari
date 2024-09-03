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

import generated.Teacher;


@SpringBootApplication
@EntityScan("com")
public class TeacherParser {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		SpringApplication.run(TeacherParser.class, args);
		 File xmlfile = new ClassPathResource("teacher.xml").getFile();
		 XmlMapper xmlMapper = new XmlMapper();
		 Teacher teacher = xmlMapper.readValue(xmlfile, Teacher.class);
		 System.out.println(teacher);
		 
		 
		 Teacher teacher1 = new Teacher();
		 teacher1.setTeacherID(50014);
		 teacher1.setFirstName("Ahmad");
		 teacher1.setLastName("Azirani");
		 teacher1.setAge(44);
		 xmlMapper.writeValue(new File("generated-teacher.xml"), teacher1);
 	}

}
