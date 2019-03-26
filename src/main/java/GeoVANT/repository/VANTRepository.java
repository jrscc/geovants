package GeoVANT.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import GeoVANT.model.VANT;

public interface VANTRepository extends MongoRepository<VANT, Long>{

}
