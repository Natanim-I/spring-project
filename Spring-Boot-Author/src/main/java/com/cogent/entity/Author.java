package com.cogent.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="AUTHOR_TBL")

public class Author implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int authorId;
	private String authorName;
	private String authorAddress;
	private String authorPhone;
  
	public Author() {
		super();
	}

	public Author(int authorId, String authorName, String authorAddress, String authorPhone) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorAddress = authorAddress;
		this.authorPhone = authorPhone;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorAddress() {
		return authorAddress;
	}

	public void setAuthorAddress(String authorAddress) {
		this.authorAddress = authorAddress;
	}

	public String getAuthorPhone() {
		return authorPhone;
	}

	public void setAuthorPhone(String authorPhone) {
		this.authorPhone = authorPhone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
