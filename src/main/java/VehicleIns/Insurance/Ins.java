package VehicleIns.Insurance;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import org.springframework.data.annotation.Id;
@Entity
	public class Ins {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String InsProvider;
	    private String policyNumber;
	    	    // Other fields and getters/setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getInsProvider() {
			return InsProvider;
		}
		public void setInsProvider(String InsProvider) {
			this.InsProvider = InsProvider;
		}
		public String getPolicyNumber() {
			return policyNumber;
		}
		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}
		@Override
		public String toString() {
			return "Ins [id=" + id + ", InsProvider=" + InsProvider + ", policyNumber=" + policyNumber
					+ "]";
		}
	}


