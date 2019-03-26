package GeoVANT.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import GeoVANT.model.SensorDatakit;

public interface SensorDatakitRepository extends MongoRepository<SensorDatakit, Long>{

}
