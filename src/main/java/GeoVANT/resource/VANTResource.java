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

import GeoVANT.model.VANT;
import GeoVANT.repository.VANTRepository;
import GeoVANT.service.VANTService;


@RestController
@RequestMapping("/vants")
public class VANTResource {
	
	@Autowired
	private VANTRepository vantRepository;
	
	@Autowired
	private VANTService vantService;
	
	@GetMapping
	public List<VANT> read(){
		return vantRepository.findAll();
	}
	@PostMapping
	public ResponseEntity<VANT> create(@Valid @RequestBody VANT vant, HttpServletResponse response){
		
		VANT VANTSaved = vantRepository.save(vant);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(VANTSaved);
		
	}
	
	@GetMapping("/{vantId}")
	public VANT readByVantId(@PathVariable Long vantId){
		return vantRepository.findOne(vantId);
	}
	
	@DeleteMapping("/{vantId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long vantId) {
		vantRepository.delete(vantId);
		
	}
	
	@PutMapping("/{vantId}")
	public ResponseEntity<VANT> update(@PathVariable Long vantId, @RequestBody @Valid VANT vant) {
		
		VANT vantSalved = vantService.update(vantId, vant);
		return ResponseEntity.ok(vantSalved); 
	}
	

}


