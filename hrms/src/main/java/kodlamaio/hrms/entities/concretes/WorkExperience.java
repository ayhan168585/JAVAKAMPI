package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="work_experiences")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_position"})
public class WorkExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="work_experiences_id")
	private int workExperiencesId;
	@Column(name="company_name")
	private String companyName;
//	@Column(name="job_position_id")
//	private int jobPositionId;
	@Column(name="entry_year_company")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date entryYearCompany;
	@Column(name="exit_year_from_work")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date exitYearFromWork;



@OneToOne()
@JoinColumn(name="job_position_id")
private JobPosition job_position;

@ManyToOne()
@JoinColumn(name="user_id")
private JobSeeker job_seeker;
}
