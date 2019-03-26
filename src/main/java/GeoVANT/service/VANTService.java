package GeoVANT.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import GeoVANT.model.VANT;
import GeoVANT.repository.VANTRepository;

@Service
public class VANTService {

	@Autowired
	private VANTRepository vantRepository;

	public VANT update(Long vantId, @Valid VANT vant) {
		
		VANT v = findByVantId(vantId);
		BeanUtils.copyProperties(vant, v, "vantId");
		
		return vantRepository.save(v);
		
	}
	
	public VANT findByVantId(Long vantId) {
		VANT vantSaved =  vantRepository.findOne(vantId);
		if(vantSaved == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return vantSaved;
	}

}
