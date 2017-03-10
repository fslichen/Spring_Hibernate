package cn.itcast.sh.entity;

import javax.persistence.*;

@Entity// Turn a pojo into a persistence class.
@Table(name="USER_INFO")// Define the name of the table.
public class User {
	@Id// Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="U_ID")// Define the name of the column.
	private int id;
	@Column(name="U_NAME", length=50)
	private String name;
	@Column(name="U_AGE")
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}