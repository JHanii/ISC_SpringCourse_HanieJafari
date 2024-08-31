package ir.freeland.springboot.relation.manytomany;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    
    @ManyToMany(mappedBy = "likedCourses")
    private Set<Student> likes = new HashSet<>();

    @OneToMany(mappedBy = "course")
    private Set<CourseRating> ratings = new HashSet<>();

    @OneToMany(mappedBy = "course") //many-to-many relationship doesn’t have an owner side in the database, we could configure the join table in this class
    private Set<CourseRegistration> registrations = new HashSet<>();

    
    public Course() {
    }

    public Course(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Student> getLikes() {
        return likes;
    }

    public void setLikes(Set<Student> likes) {
        this.likes = likes;
    }

    public Set<CourseRating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<CourseRating> ratings) {
        this.ratings = ratings;
    }

    public Set<CourseRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<CourseRegistration> registrations) {
        this.registrations = registrations;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, likes, name, ratings, registrations);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id)
				&& Objects.equals(likes, other.likes)
				&& Objects.equals(name, other.name)
				&& Objects.equals(ratings, other.ratings)
				&& Objects.equals(registrations, other.registrations);
	}

}
