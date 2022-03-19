package si.restmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import si.restmongodb.entity.City;

import java.util.List;

@Repository
public interface CityRepository extends MongoRepository<City, String> {

}
