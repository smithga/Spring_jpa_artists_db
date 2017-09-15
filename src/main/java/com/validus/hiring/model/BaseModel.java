package com.validus.hiring.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public class BaseModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	
	@CreatedDate
	protected Date Created;
	
	@LastModifiedDate
	protected Date LastModified;
}
