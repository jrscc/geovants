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

import GeoVANT.model.SensorFeed;
import GeoVANT.repository.SensorFeedRepository;
import GeoVANT.service.SensorFeedService;

@RestController
@RequestMapping("/sensorFeed")
public class SensorFeedResource {
	
	@Autowired
	private SensorFeedRepository sensorFeedRepository;
	
	@Autowired
	private SensorFeedService sensorFeedService;
	
	@GetMapping
	public List<SensorFeed> read(){
		return sensorFeedRepository.findAll();
	}
	@PostMapping
	public ResponseEntity<SensorFeed> create(@Valid @RequestBody SensorFeed SensorFeed, HttpServletResponse response){
		
		SensorFeed sensorFeedSaved = sensorFeedRepository.save(SensorFeed);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(sensorFeedSaved);
		
	}
	
	@GetMapping("/{sensorFeedId}")
	public SensorFeed readBysensorFeedId(@PathVariable Long sensorFeedId){
		return sensorFeedRepository.findOne(sensorFeedId);
	}
	
	@DeleteMapping("/{sensorFeedId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long sensorFeedId) {
		sensorFeedRepository.delete(sensorFeedId);
		
	}
	
	@PutMapping("/{sensorFeedId}")
	public ResponseEntity<SensorFeed> update(@PathVariable Long sensorFeedId, @RequestBody @Valid SensorFeed SensorFeed) {
		
		SensorFeed SensorFeedSalved = sensorFeedService.update(sensorFeedId, SensorFeed);
		return ResponseEntity.ok(SensorFeedSalved); 
	}

}
