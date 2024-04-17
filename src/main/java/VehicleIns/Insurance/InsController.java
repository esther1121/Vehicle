package VehicleIns.Insurance;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/Ins")
public class InsController {
    @Autowired
    private InsService InsService;
    @PostMapping("/provide")
    public ResponseEntity<Ins> provideIns(@RequestBody Ins Ins) {
        Ins providedIns = InsService.provideIns(Ins);
        return ResponseEntity.ok(providedIns);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ins> getInsById(@PathVariable Long id) {
        Ins Ins = InsService.getInsById(id);
        if (Ins == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Ins);
    }

    @GetMapping
    public List<Ins> getAllIns() {
        return InsService.getAllIns();
    }  

    @PutMapping("/update")
    public ResponseEntity<Ins> updateIns(@RequestBody Ins Ins) {
        Ins updatedIns = InsService.updateIns(Ins);
        return ResponseEntity.ok(updatedIns);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIns(@PathVariable Long id) {
        InsService.deleteIns(id);
        return ResponseEntity.noContent().build();
    }
}


