package GeoVANT.service;


import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;


import GeoVANT.model.ResearcherCollector;
import GeoVANT.repository.ResearcherCollectorRepository;

@Service
public class ResearcherCollectorService {
	
	@Autowired
	private ResearcherCollectorRepository researcherCollectorRepository;

	public ResearcherCollector update(Long collectorID, @Valid ResearcherCollector researcherCollector) {
		
		ResearcherCollector rc = findByCollectorId(collectorID);
		BeanUtils.copyProperties(researcherCollector, rc, "collectorID");
		
		return researcherCollectorRepository.save(rc);
		
	}
	
	public ResearcherCollector findByCollectorId(Long collectorID) {
		ResearcherCollector researcherCollectorSaved =  researcherCollectorRepository.findOne(collectorID);
		if(researcherCollectorSaved == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return researcherCollectorSaved;
	}
}
