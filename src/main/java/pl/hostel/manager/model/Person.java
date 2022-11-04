package pl.hostel.manager.model;

import javax.persistence.*;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private String name;
	private String surname;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String personCode;
	
	public Person() {}
	
	public Person(Long id, String name, String surname, String imageUrl, String personCode) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.imageUrl = imageUrl;
		this.personCode = personCode;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", imageUrl=" + imageUrl
				+ ", personCode=" + personCode + "]";
	}
}
