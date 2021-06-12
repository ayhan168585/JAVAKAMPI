package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="working_features")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_advertisements"})
public class WorkingFeature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="working_feature_id")
	private int workingFeatureId;
	@Column(name="working_feature_name")
	private String workingFeatureName;
	
	@OneToMany(mappedBy = "working_feature")
	private List<JobAdvertisement> job_advertisements;
}
