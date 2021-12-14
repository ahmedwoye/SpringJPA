package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name="Student")
public class Student {
	@Id
	private Long StudentId;
	
	@Column(name="FirstName" )
	private String firstName;
	
	@Column(name="LastName" )
	private String lastName;
	
	@Column(name="email" )
	private String emailId;
	
	@Column(name="GuardianName" )
	private String guardianName;
	
	@Column(name="Guardianemail" )
	private String guardianEmail;
	
	@Column(name="GuardianMobile" )
	private String guardianMobile;

}
