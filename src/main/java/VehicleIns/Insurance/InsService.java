package VehicleIns.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
	public class InsService {
	    
	    @Autowired
	    private InsRepository InsRepository;

	    // Method to provide insurance for a new car or change policy for an existing customer
	    public Ins provideIns(Ins Ins) {
	        // Implement logic to provide insurance (e.g., save insurance details)
	        return InsRepository.save(Ins);
	    }

	    // Method to retrieve insurance by ID
	    public Ins getInsById(Long id) {
	        return InsRepository.findById(id).orElse(null);
	    }
	    // Method to retrieve all insurances
	    public List<Ins> getAllIns() {
	        return InsRepository.findAll();
	    }
	    // Method to update insurance details
	    public Ins updateIns(Ins Ins) {
	        // Implement logic to update insurance details
	        return InsRepository.save(Ins);
	    }

	    // Method to delete insurance
	    public void deleteIns(Long id) {
	        // Implement logic to delete insurance
	        InsRepository.deleteById(id);
	    }
	}



