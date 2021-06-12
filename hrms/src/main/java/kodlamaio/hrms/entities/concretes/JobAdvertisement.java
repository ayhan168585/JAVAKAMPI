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


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")
@NoArgsConstructor
@AllArgsConstructor

public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_advertisement_id")
	private int jobAdvertisementId;
	//@Column(name="job_position_id")
	//private int jobPositionId;
	//@Column(name="city_id")
	//private int cityId;
	//@Column(name="user_id")
	//private int userId;
	@Column(name="salary_min")
	private double salaryMin;
	@Column(name="salary_max")
	private double salaryMax;
	@Column(name="number_of_open_position")
	private int numberOfOpenPosition;
	@Column(name="application_deadline")
	private Date applicationDeadline;
	@Column(name="is_active")
	private boolean isActive;
	@Column(name="job_description")
	private String jobDescription;
//	@Column(name="working_feature_id")
//	private int workingFeatureId;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition job_position;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="working_feature_id")
	private WorkingFeature working_feature;
	
	@ManyToOne()
	@JoinColumn(name="working_type_id")
	private WorkingType working_type;
	
}
