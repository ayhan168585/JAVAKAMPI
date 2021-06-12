package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","work_experiences","foreign_languages","programming_languages","schools","job_advertisement","circulum_vitaes","job_positions"})

public class JobSeeker extends User{
	
	
	@Column(name="tc_no")
	private String tcNo;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name = "is_verify")
	private boolean isVerify;
	@Column(name="birth_year")
	private int birthYear;
	
	
	
	@OneToMany(mappedBy = "job_seeker")
	private List<JobPosition> job_positions;
	
	@OneToMany(mappedBy = "job_seeker")
	private List<CirculumVitae> circulum_vitaes;
	
	@OneToMany(mappedBy = "job_seeker")
	private List<ForeignLanguage> foreign_languages;
	
	@OneToMany(mappedBy = "job_seeker")
	private List<ProgrammingLanguage> programming_languages;
	
	@OneToMany(mappedBy = "job_seeker")
	private List<School> schools;

	@OneToMany(mappedBy = "job_seeker")
	private List<WorkExperience> work_experiences;
	
//	@OneToOne(mappedBy = "job_seeker")
//	private Photo photo;
	
	
	


}
