package com.exam.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table (name="article")
public class 	Article {


	@Id
	@Column (name="id", nullable=false)
	int id;
	@Column (name="slug", nullable=false)
	String slug;
	@Column (name="title", nullable=false)
	String title;
	@Column (name="description", nullable=false)
	String description;
	@Column (name="body", nullable=false)
	String body;
	@Column (name="createdAt", nullable=false)
	Date createdAt;
	@Column (name="updatedAt", nullable=false)
	Date updatedAt;
		public Article()
	{
		
	}
	
	//
	public Article(	int id,	String slug,	 	String description,		String body,		Date createdAt,		Date updatedAt)
	{

		this.id=id;

		 this.slug=slug;

		  this.description=description;

	 this.body=body;

		  this.createdAt=createdAt;

		  this.updatedAt=updatedAt;

			}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
