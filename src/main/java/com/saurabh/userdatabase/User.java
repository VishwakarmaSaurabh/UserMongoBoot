package com.saurabh.userdatabase;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@Document(collection = "USER")
public class User {
	
	@Id
	private String id;
	private String name;
	private Integer age;
	
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
