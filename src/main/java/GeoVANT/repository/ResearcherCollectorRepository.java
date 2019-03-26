package GeoVANT.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import GeoVANT.model.ResearcherCollector;

public interface ResearcherCollectorRepository extends MongoRepository<ResearcherCollector, Long>{

	public Optional<ResearcherCollector> findByEmail(String email);
}
