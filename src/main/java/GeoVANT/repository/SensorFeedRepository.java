package GeoVANT.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import GeoVANT.model.SensorFeed;

public interface SensorFeedRepository extends MongoRepository<SensorFeed, Long>{

}
