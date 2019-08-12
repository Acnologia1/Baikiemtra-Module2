package com.codegym.service;

import com.codegym.model.City;
import com.codegym.model.Country;
import com.codegym.repository.CityRepository;
import com.codegym.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;
    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City findById(Long id) {
        return cityRepository.findOne(id);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
        City city = cityRepository.findOne(id);
        cityRepository.delete(city);
    }
    @Override
    public Iterable<City> findAllByCountry(Country country) {
        return cityRepository.findAllByCountry(country);
    }
}