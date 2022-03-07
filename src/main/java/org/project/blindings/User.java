package org.project.blindings;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

	@Data
public class User{
	private Integer userId;
	private String userFName;
	private String userLName;
	private String userEmail;
	private Integer userPhno;
	@DateTimeFormat(pattern = "yyyy-dd-mm")
	private LocalDate userDob;
	private String userGender;
	private String userCountry;
	private String userState;
	private String usercity;
	private String userPwd;
	private String userAccStatus;
	private LocalDate createdDate;
	private LocalDate updatedDate;
}
