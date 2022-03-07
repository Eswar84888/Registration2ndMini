package org.project.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.project.blindings.User;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


 
	@Entity
	@Data
	@Table(name="USER_DTLS")
	public class UserEntity {

		@Id
		@GeneratedValue
		@Column(name="USER_ID")
		private Integer userId;
		@Column(name="USER_FIRST_NAME")
		private String userFName;
		@Column(name="USER_LAST_NAME")
		private String userLName;
		@Column(name="USER_EMAIL",unique=true)
		private String userEmail;
		@Column(name="USER_PHNO")
		private Integer userPhno;
		@Column(name="USER_DOB")
		@DateTimeFormat(pattern="DD/MM/YYYY")
		private LocalDate userDob;
		@Column(name="USER_GENDER")
		private String userGender;
		@Column(name="USER_COUNTRY")
		private String userCountry;
		@Column(name="USER_STATE")
		private String userState;
		@Column(name="USER_CITY")
		private String usercity;
		@Column(name="USER_PWD")
		private String userPwd;
		@Column(name="USER_ACCSTATUS")
		private String userAccStatus;
		@Column(name="USER_CREATEDATE")
		private LocalDate createdDate;
		@Column(name="USER_UPDATEDATE")
		private LocalDate updatedDate;
		
		
	
}
