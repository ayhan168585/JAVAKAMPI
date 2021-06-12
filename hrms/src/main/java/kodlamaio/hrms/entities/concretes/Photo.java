package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "photos")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","user"})
public class Photo {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "path")
	    private String path;

	    @Column(name = "uploaded_at")
	    private LocalDate uploadedAt;
	
//	@Column(name="cv_id")
//	private int cvId;


	@OneToOne()
	@JoinColumn(name="user_id")
	private User user;
	
//	@OneToOne()
//	@JoinColumn(name="user_id")
//	private Employer employer;

}
