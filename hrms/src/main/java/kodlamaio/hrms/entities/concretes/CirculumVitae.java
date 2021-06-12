package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="circulum_vitaes")
@NoArgsConstructor
@AllArgsConstructor
public class CirculumVitae {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int cvId;

	@Column(name="githubb_adress")
	private String githubbAdress;
	@Column(name="linkedin_adress")
	private String linkedinAdress;
	@Column(name="self_introduction_letter")
	private String selfIntroductionLetter;
	@Column(name="circulum_vitae_name")
	private String circulumVitaeName;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private JobSeeker job_seeker;
	
	
	
	


















}
