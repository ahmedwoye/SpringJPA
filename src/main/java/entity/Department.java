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

@Table(name="Department")
public class Department {
	
	@Id
      private long depatmentid;
	
	@Column(name="DepartmentName" )
      private String departmentname;
	
	@Column(name="DepartmentContact")
      private String depatmentcontact;
      
}
