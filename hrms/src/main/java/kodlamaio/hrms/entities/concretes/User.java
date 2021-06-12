package kodlamaio.hrms.entities.concretes;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
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
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","work_experiences","foreign_languages","programming_languages","job_advertisement","circulumVitae","photo"})

@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

//	@Column(name="photo_id")
//	private int photoId;
	
	@Column(name="user_email")
	private String userEmail;
	@Column(name="password")
	private String password;
	@Column(name="confirm_password")
	private String confirmPassword;
	
//	@OneToOne(mappedBy = "user")
//	private Employer employer;
	
	@OneToOne(mappedBy = "user")
	private Photo photo;
	
	@ManyToOne()
	@JoinColumn(name="role_id")
	private Role role;
	

	
	
	

	
	
	
}
