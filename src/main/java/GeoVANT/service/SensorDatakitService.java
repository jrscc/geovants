package GeoVANT.service;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import GeoVANT.model.SensorDatakit;
import GeoVANT.repository.SensorDatakitRepository;

@Service
public class SensorDatakitService {
	
	@Autowired
	private SensorDatakitRepository sensorDatakitRepository;

	public SensorDatakit update(Long sensorDatakitId, @Valid SensorDatakit sensorDatakit) {
		
		SensorDatakit sdk = findBySensorDatakitId(sensorDatakitId);
		BeanUtils.copyProperties(sensorDatakit, sdk, "sensorDatakitId");
		
		return sensorDatakitRepository.save(sdk);
		
	}
	
	public SensorDatakit findBySensorDatakitId(Long sensorDataKitId) {
		SensorDatakit sensorDatakitSaved =  sensorDatakitRepository.findOne(sensorDataKitId);
		if(sensorDatakitSaved == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return sensorDatakitSaved;
	}

}
