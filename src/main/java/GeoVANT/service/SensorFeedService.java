package GeoVANT.service;

import javax.validation.Valid;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import GeoVANT.model.SensorFeed;
import GeoVANT.repository.SensorFeedRepository;

@Service
public class SensorFeedService {
	
	@Autowired
	private SensorFeedRepository sensorFeedRepositoryRepository;

	public SensorFeed update(Long sensorFeedId, @Valid SensorFeed sensorFeed) {
		
		SensorFeed sf = findBySensorFeedId(sensorFeedId);
		BeanUtils.copyProperties(sensorFeed, sf, "sensorFeedId");
		
		return sensorFeedRepositoryRepository.save(sf);
		
	}
	
	public SensorFeed findBySensorFeedId(Long sensorFeedId) {
		SensorFeed sensorFeedSaved =  sensorFeedRepositoryRepository.findOne(sensorFeedId);
		if(sensorFeedSaved == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return sensorFeedSaved;
	}

}
