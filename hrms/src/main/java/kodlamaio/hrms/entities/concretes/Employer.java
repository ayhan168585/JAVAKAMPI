package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisement"})

public class Employer extends User{

	@Column(name="company_name")
	private String companyName;

	@Column(name = "web_adress")
	private String webAdress;

	@Column(name = "email_Adress_of_web")
	private String emailAdressOfWeb;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "is_verify")
	private boolean isVerify;
	
	@OneToOne(mappedBy = "employer")
	private JobAdvertisement job_advertisement;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private JobPosition job_position;
	
//	@OneToOne(mappedBy = "employer")
//	private Photo photo;
	
//	@OneToOne()
//	@JoinColumn(name="user_id")
//	private User user;
	
	
}
