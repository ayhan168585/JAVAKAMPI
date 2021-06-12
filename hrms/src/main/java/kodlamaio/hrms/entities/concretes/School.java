package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="schools")
@NoArgsConstructor
@AllArgsConstructor
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="school_id")
	private int schoolId;
	@Column(name="school_name")
	private String schoolName;
	@Column(name="department_name")
	private String departmentName;
	@Column(name="year_of_entry")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date yearOfEntry;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name="graduation_year")
	private Date graduationYear;
//	@Column(name="user_id")
//	private int userId;


	@ManyToOne()
	@JoinColumn(name="user_id")
	private JobSeeker job_seeker;


}
