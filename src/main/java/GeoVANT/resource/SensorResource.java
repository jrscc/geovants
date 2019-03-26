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

import GeoVANT.model.Sensor;
import GeoVANT.repository.SensorRepository;
import GeoVANT.service.SensorService;


@RestController
@RequestMapping("/sensors")
public class SensorResource {
	
	@Autowired
	private SensorRepository sensorRepository;
	
	
	@Autowired
	private SensorService sensorService;
	
	@GetMapping
	public List<Sensor> read(){
		return sensorRepository.findAll();
	}
	@PostMapping
	public ResponseEntity<Sensor> create(@Valid @RequestBody Sensor sensor, HttpServletResponse response){
		
		Sensor sensorSaved = sensorRepository.save(sensor);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(sensorSaved);
		
	}
	
	@GetMapping("/{sensorId}")
	public Sensor readBySensorId(@PathVariable Long sensorId){
		return sensorRepository.findOne(sensorId);
	}
	
	@DeleteMapping("/{sensorId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long sensorId) {
		sensorRepository.delete(sensorId);
		
	}
	
	@PutMapping("/{sensorId}")
	public ResponseEntity<Sensor> update(@PathVariable Long sensorId, @RequestBody @Valid Sensor sensor) {
		
		Sensor sensorSalved = sensorService.update(sensorId, sensor);
		return ResponseEntity.ok(sensorSalved); 
	}
	


}
