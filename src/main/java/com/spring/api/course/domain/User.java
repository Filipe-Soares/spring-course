package com.spring.api.course.domain;

import java.util.ArrayList;
import java.util.List;

import com.spring.api.course.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private Role role;
	
	private List<Request> requests = new ArrayList<Request>();
	
	private List<RequestStage> stages =  new ArrayList<RequestStage>();
	
}
