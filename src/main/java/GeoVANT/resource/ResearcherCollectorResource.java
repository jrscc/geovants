package GeoVANT.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import GeoVANT.model.ResearcherCollector;
import GeoVANT.repository.ResearcherCollectorRepository;
import GeoVANT.service.ResearcherCollectorService;

@RestController
@RequestMapping("/collectors")
public class ResearcherCollectorResource {
	
	@Autowired
	private ResearcherCollectorRepository researcherCollectorRepository;
	
	@Autowired
	private ResearcherCollectorService researcherCollectorService;
	
	@GetMapping
	public List<ResearcherCollector> read(){
		return researcherCollectorRepository.findAll();
	}
	@PostMapping
	public ResponseEntity<ResearcherCollector> create(@Valid @RequestBody ResearcherCollector researcherCollector, HttpServletResponse response){
		
		ResearcherCollector collectorSaved = researcherCollectorRepository.save(researcherCollector);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(collectorSaved);
		
	}
	
	@GetMapping("/{collectorID}")
	public ResearcherCollector readByCollectorId(@PathVariable Long collectorID){
		return researcherCollectorRepository.findOne(collectorID);
	}
	
	@DeleteMapping("/{collectorID}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long collectorID) {
		researcherCollectorRepository.delete(collectorID);
		
	}
	
	@PutMapping("/{collectorID}")
	public ResponseEntity<ResearcherCollector> update(@PathVariable Long collectorID, @RequestBody @Valid ResearcherCollector researcherCollector) {
		
		ResearcherCollector researcherCollectorSalved = researcherCollectorService.update(collectorID, researcherCollector);
		return ResponseEntity.ok(researcherCollectorSalved); 
	}
	

}
