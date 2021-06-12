package kodlamaio.hrms.entities.concretes;

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
@Table(name="foreign_languages")
@NoArgsConstructor
@AllArgsConstructor
public class ForeignLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="foreign_language_id")
	private int foreignLanguageId;
	@Column(name="foreign_languages_name")
	private String foreignLanguagesName;
	@Column(name="foreign_language_level")
	private int foreignLanguageLevel;


	@ManyToOne()
	@JoinColumn(name="user_id")
	private JobSeeker job_seeker;

}
