package GeoVANT.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import GeoVANT.model.VANTDatakit;

public interface VANTDatakitRepository extends MongoRepository<VANTDatakit, Long>{

}
