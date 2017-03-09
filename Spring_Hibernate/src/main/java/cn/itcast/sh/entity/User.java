package cn.itcast.sh.entity;

import javax.persistence.*;

/**
 * User
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2016-2-22 下午4:26:36
 * @version 1.0
 */
@Entity // 把一个pojo转化成持久化类
@Table(name="USER_INFO")
public class User {
	@Id  // 主键列
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="U_ID")
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