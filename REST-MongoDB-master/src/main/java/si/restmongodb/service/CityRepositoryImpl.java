package si.restmongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.restmongodb.entity.City;
import si.restmongodb.repository.CityRepository;

import java.util.List;

@Service
public class CityRepositoryImpl implements CityService {

    @Autowired
    private CityRepository repo;

    @Override
    public List<City> getCities() {
        return this.repo.findAll();
    }

}
