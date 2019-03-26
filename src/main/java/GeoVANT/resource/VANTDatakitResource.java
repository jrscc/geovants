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

import GeoVANT.model.VANTDatakit;
import GeoVANT.repository.VANTDatakitRepository;
import GeoVANT.service.VANTDatakitService;

@RestController
@RequestMapping("/vantDatakit")
public class VANTDatakitResource {
	
	@Autowired
	private VANTDatakitRepository vANTDatakitRepository;
	
	@Autowired
	private VANTDatakitService vANTDatakitService;
	
	@GetMapping
	public List<VANTDatakit> read(){
		return vANTDatakitRepository.findAll();
	}
	@PostMapping
	public ResponseEntity<VANTDatakit> create(@Valid @RequestBody VANTDatakit VANTDatakit, HttpServletResponse response){
		
		VANTDatakit vANTDatakitSaved = vANTDatakitRepository.save(VANTDatakit);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(vANTDatakitSaved);
		
	}
	
	@GetMapping("/{vANTDatakitId}")
	public VANTDatakit readByvANTDatakitId(@PathVariable Long vANTDatakitId){
		return vANTDatakitRepository.findOne(vANTDatakitId);
	}
	
	@DeleteMapping("/{vANTDatakitId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long vANTDatakitId) {
		vANTDatakitRepository.delete(vANTDatakitId);
		
	}
	
	@PutMapping("/{vANTDatakitId}")
	public ResponseEntity<VANTDatakit> update(@PathVariable Long vANTDatakitId, @RequestBody @Valid VANTDatakit VANTDatakit) {
		
		VANTDatakit VANTDatakitSalved = vANTDatakitService.update(vANTDatakitId, VANTDatakit);
		return ResponseEntity.ok(VANTDatakitSalved); 
	}

}
