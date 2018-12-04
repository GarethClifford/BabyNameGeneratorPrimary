package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Name {

	@Id
	@GeneratedValue
	private Long idNumber;
	private String nameStartingWith;
	private Long lengthOfName;

	private String actualName;


	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public Name() {
	}
	
	public Name(String nameStartingWith, Long lengthOfName) {
		this.nameStartingWith = nameStartingWith;
		this.lengthOfName = lengthOfName;
	}

	public Long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Long idNumber) {
		this.idNumber = idNumber;
	}

	public String getNameStartingWith() {
		return nameStartingWith;
	}

	public void setNameStartingWith(String nameStartingWith) {
		this.nameStartingWith = nameStartingWith;
	}

	public Long getLengthOfName() {
		return lengthOfName;
	}

	public void setLengthOfName(Long lengthOfName) {
		this.lengthOfName = lengthOfName;
	}

	@Override
	public String toString() {
		return "Name [idNumber=" + idNumber + ", nameStartingWith=" + nameStartingWith + ", lengthOfName="
				+ lengthOfName + "]";
	}

}
