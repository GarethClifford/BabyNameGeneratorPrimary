package com.qa.persistence.domain;

import javax.persistence.Id;

public class Name {

	@Id
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
