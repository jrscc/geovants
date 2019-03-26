package GeoVANT.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import GeoVANT.model.VANTDatakit;
import GeoVANT.repository.VANTDatakitRepository;

@Service
public class VANTDatakitService {
	
	@Autowired
	private VANTDatakitRepository vANTDatakitRepository;

	public VANTDatakit update(Long vANTDatakitId, @Valid VANTDatakit vANTDatakit) {
		
		VANTDatakit vdk = findByVANTDatakitId(vANTDatakitId);
		BeanUtils.copyProperties(vANTDatakit, vdk, "vANTDatakitId");
		
		return vANTDatakitRepository.save(vdk);
		
	}
	
	public VANTDatakit findByVANTDatakitId(Long vANTDatakitId) {
		VANTDatakit vANTDatakitSaved =  vANTDatakitRepository.findOne(vANTDatakitId);
		if(vANTDatakitSaved == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return vANTDatakitSaved;
	}

}
