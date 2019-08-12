package com.codegym.service;

import com.codegym.model.City;
import com.codegym.model.Country;

public interface CityService {
    Iterable<City> findAll();

    void save(City city);

    City findById(Long id);

    void remove(Long id);

    Iterable<City> findAllByCountry(Country country);
}
