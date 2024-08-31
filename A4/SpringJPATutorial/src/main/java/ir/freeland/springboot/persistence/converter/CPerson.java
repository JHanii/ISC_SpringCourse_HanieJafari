package ir.freeland.springboot.persistence.converter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity(name = "PersonTable")
public class CPerson {

    @Id
    @GeneratedValue
    private Long id;

    @Convert(converter = PersonNameConverter.class)
    private PersonName personName;

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public Long getId() {
        return id;
    }

	@Override
	public String toString() {
		return "CPerson [id=" + id + ", personName=" + personName + "]";
	}

    
}