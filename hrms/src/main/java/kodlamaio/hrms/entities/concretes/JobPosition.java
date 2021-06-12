package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_positions")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employers","job_seekers","job_advertisements","work_experience"})


public class JobPosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_position_id")
	private int id;
	
	@Column(name="job_position_name")
	private String jobPositionName;
	
	@OneToMany(mappedBy = "job_position")
	private List<Employer> employers;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private JobSeeker job_seeker;
		
	@OneToMany(mappedBy = "job_position")
	private List<JobAdvertisement> job_advertisements;
	
	@OneToOne(mappedBy = "job_position")
	private WorkExperience work_experience;

}
