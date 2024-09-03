package ir.freeland.springboot.xml;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import generated.Note;
import generated.Office;
import generated.Staff;


@SpringBootApplication
@EntityScan("ir.freeland.springboot.persistence.model")
public class XMLApplication {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		SpringApplication.run(XMLApplication.class, args);
		 File xmlfile = new ClassPathResource("x.xml").getFile();
		 XmlMapper xmlMapper = new XmlMapper();
		 Note note = xmlMapper.readValue(xmlfile, Note.class);
		 System.out.println(note);
		 
		 
		 Note mynote = new Note();
		 mynote.setFrom("Alireza");
		 mynote.setTo("Roham");
		 mynote.setBody("A sample body");
		 mynote.setHeading("IMPORTANT!");
		xmlMapper.writeValue(new File("generated-from-java.xml"), mynote);
		
		File jsonfile = new ClassPathResource("office.json").getFile();
		ObjectMapper mapper = new ObjectMapper();
		var Office = mapper.readValue(jsonfile,  Office.class);
		System.out.println(Office);
 	}

}
