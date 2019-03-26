package GeoVANT.service;


import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import GeoVANT.model.Sensor;
import GeoVANT.repository.SensorRepository;

@Service
public class SensorService {

	@Autowired
	private SensorRepository sensorRepository;

	public Sensor update(Long sensorId, @Valid Sensor sensor) {
		
		Sensor s = findBySensorId(sensorId);
		BeanUtils.copyProperties(sensor, s, "sensorId");
		
		return sensorRepository.save(s);
		
	}
	
	public Sensor findBySensorId(Long sensorId) {
		Sensor sensorSaved =  sensorRepository.findOne(sensorId);
		if(sensorSaved == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return sensorSaved;
	}
}
