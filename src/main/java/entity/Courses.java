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

@Table(name="Course")
public class Courses {
	
	@Id
	private Long courseId;
	
	@Column(name="department" )
	private String  department;
	
	@Column(name="coursecode" )
	private String  coursecode;

}
