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

import GeoVANT.model.SensorDatakit;
import GeoVANT.repository.SensorDatakitRepository;
import GeoVANT.service.SensorDatakitService;


@RestController
@RequestMapping("/sensorDatakit")
public class SensorDatakitResource {
	
	@Autowired
	private SensorDatakitRepository sensorDatakitRepository;
	
	@Autowired
	private SensorDatakitService sensorDatakitService;
	
	@GetMapping
	public List<SensorDatakit> read(){
		return sensorDatakitRepository.findAll();
	}
	@PostMapping
	public ResponseEntity<SensorDatakit> create(@Valid @RequestBody SensorDatakit sensorDatakit, HttpServletResponse response){
		
		SensorDatakit sensorDatakitSaved = sensorDatakitRepository.save(sensorDatakit);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(sensorDatakitSaved);
		
	}
	
	@GetMapping("/{sensorDatakitId}")
	public SensorDatakit readBysensorDatakitId(@PathVariable Long sensorDatakitId){
		return sensorDatakitRepository.findOne(sensorDatakitId);
	}
	
	@DeleteMapping("/{sensorDatakitId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long sensorDatakitId) {
		sensorDatakitRepository.delete(sensorDatakitId);
		
	}
	
	@PutMapping("/{sensorDatakitId}")
	public ResponseEntity<SensorDatakit> update(@PathVariable Long sensorDatakitId, @RequestBody @Valid SensorDatakit sensorDatakit) {
		
		SensorDatakit sensorDatakitSalved = sensorDatakitService.update(sensorDatakitId, sensorDatakit);
		return ResponseEntity.ok(sensorDatakitSalved); 
	}
	

}



