package GeoVANT.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import GeoVANT.model.Sensor;

public interface SensorRepository extends MongoRepository<Sensor, Long>{

}
