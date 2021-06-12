package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="programming_languages")
public class ProgrammingLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="programming_language_id")
	private int programmingLanguageId;
	@Column(name="programming_language_name")
	private String programmingLanguageName;

	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private JobSeeker job_seeker;


}
